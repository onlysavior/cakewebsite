package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Specification;
import cakewebsite.dao.mapper.SpecificationMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 */
public class MybatisSpecificationMapper extends SqlSessionDaoSupport implements SpecificationMapper {
    private static final String NAME_SPACE = "cakewebsite.dao.mapper.SpecificationMapper";
    @Override
    public List<Specification> getByProduct(Long product) {
        return getSqlSession().selectList(NAME_SPACE + ".getByProduct", product);
    }

    @Override
    public void update(Specification specification) {
        getSqlSession().update(NAME_SPACE + ".update", specification);
    }

    @Override
    public void insert(Specification specification) {
        getSqlSession().insert(NAME_SPACE + ".insert", specification);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
