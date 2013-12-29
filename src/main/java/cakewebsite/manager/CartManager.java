package cakewebsite.manager;

import cakewebsite.common.ao.CartAo;
import cakewebsite.common.ao.CartAoSummery;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public class CartManager {
    @Resource(name="redisTemplate")
    private ValueOperations strOpt;
    @Resource(name = "redisTemplate")
    private ListOperations listOperations;
    private ObjectMapper objectMapper = new ObjectMapper();

    public CartAoSummery getCartSummery(Long uid) {
        String jsonValue = (String)strOpt.get(getCartSummery(uid));
        try {
            return objectMapper.readValue(jsonValue, CartAoSummery.class);
        } catch (IOException e) {
            //FIXME
            return new CartAoSummery();
        }
    }

    public CartAoSummery putCartSummery(Long uid, CartAoSummery cartAoSummery) {
        String jsonValue = null;
        try {
            jsonValue = objectMapper.writeValueAsString(cartAoSummery);
        } catch (IOException e) {
        }

        if(jsonValue != null) {
            strOpt.set(getSummeryKey(uid), jsonValue);
        }

        return cartAoSummery;
    }

    public List<CartAo> getCart(Long uid) {
        Long size = listOperations.size(getCart(uid));
        if(size == 0) {
            return new ArrayList<CartAo>();
        }

        return (List<CartAo>)listOperations.range(getCartKey(uid),0, size);
    }

    public void putCart(Long uid, CartAo cartAo) {
        listOperations.leftPush(getCart(uid), cartAo);
        CartAoSummery cartAoSummery = getCartSummery(uid);
        cartAoSummery.setCount(cartAoSummery.getCount() + cartAo.getCount());
        cartAoSummery.setPrice(cartAoSummery.getPrice() + cartAo.getPrice());

        putCartSummery(uid, cartAoSummery);
    }

    public void removeCart(Long uid, CartAo cartAo) {
        Long rtn = listOperations.remove(getCart(uid), 0, cartAo);
        if(rtn > 0) {
            CartAoSummery cartAoSummery = getCartSummery(uid);
            cartAoSummery.setCount(cartAoSummery.getCount() - cartAo.getCount());
            cartAoSummery.setPrice(cartAoSummery.getPrice() - cartAo.getPrice());

            putCartSummery(uid, cartAoSummery);
        }
    }

    private String getSummeryKey(Long uid) {
        return "os_cart_summery_"+uid;
    }

    private String getCartKey(Long uid) {
        return "os_cart_list_"+uid;
    }
}
