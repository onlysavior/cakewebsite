package cakewebsite.common.ao;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午2:44
 * To change this template use File | Settings | File Templates.
 */
public class CartAo implements Serializable{
    private Long productId;
    private Long specificationId;
    private Integer count;
    private Double price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof CartAo) {
            CartAo other = (CartAo)obj;
            return other.getSpecificationId().equals(specificationId)
                    && other.getProductId().equals(productId)
                    && other.getCount().equals(count)
                    && other.getPrice().equals(price);
        }
        return false;
    }
}
