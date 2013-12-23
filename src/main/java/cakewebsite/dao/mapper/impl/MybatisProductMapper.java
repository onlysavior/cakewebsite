package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Product;
import cakewebsite.dao.mapper.ProductMapper;
import com.google.common.collect.Maps;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-23
 * Time: 下午10:37
 * To change this template use File | Settings | File Templates.
 */
public class MybatisProductMapper extends SqlSessionDaoSupport implements ProductMapper {
    private static final String NAME_SPACE = "cakewebsite.dao.mapper.ProductMapper";
    @Override
    public Product getById(Long id) {
        return getSqlSession().selectOne(NAME_SPACE + ".getById", id);
    }

    @Override
    public List<Product> list(Long location, Long byWho, Long type, Long holiday, Integer startPos, Integer pageSize) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("location", location);
        param.put("byWho", byWho);
        param.put("type", type);
        param.put("holiday", holiday);
        param.put("startPos", startPos);
        param.put("pageSize", pageSize);

        return getSqlSession().selectList(NAME_SPACE + ".list", param);
    }

    @Override
    public Integer count(Long location, Long byWho, Long type, Long holiday) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("location", location);
        param.put("byWho", byWho);
        param.put("type", type);
        param.put("holiday", holiday);

        return getSqlSession().selectOne(NAME_SPACE + ".count", param);
    }

    @Override
    public void insert(Product product) {
        getSqlSession().insert(NAME_SPACE + ".insert", product);
    }

    @Override
    public void update(Product product) {
        getSqlSession().update(NAME_SPACE + ".update", product);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
