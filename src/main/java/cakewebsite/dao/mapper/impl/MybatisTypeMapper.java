package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Type;
import cakewebsite.dao.mapper.TypeMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:56
 * To change this template use File | Settings | File Templates.
 */
public class MybatisTypeMapper extends SqlSessionDaoSupport implements TypeMapper {
    public static final String NAME_SPACE = "cakewebsite.dao.mapper.TypeMapper";
    @Override
    public List<Type> getParentTypes() {
        return getSqlSession().selectList(NAME_SPACE + ".getParentTypes");
    }

    @Override
    public List<Type> getChildTypes(Long parent) {
        return getSqlSession().selectList(NAME_SPACE + ".getChildTypes", parent);
    }

    @Override
    public Type getById(Long id) {
        return getSqlSession().selectOne(NAME_SPACE + ".getById", id);
    }

    @Override
    public void update(Type type) {
        getSqlSession().update(NAME_SPACE + ".update", type);
    }

    @Override
    public void insert(Type type) {
        getSqlSession().insert(NAME_SPACE + ".insert", type);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
