package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Bywho;
import cakewebsite.dao.mapper.BywhoMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:17
 * To change this template use File | Settings | File Templates.
 */
public class MybatisBywhoMapper extends SqlSessionDaoSupport implements BywhoMapper{
    public static final String NAME_SPACE = "cakewebsite.dao.mapper.BywhoMapper";
    @Override
    public List<Bywho> list() {
        return getSqlSession().selectList(NAME_SPACE + ".list");
    }

    @Override
    public Bywho getById(Long id) {
        return getSqlSession().selectOne(NAME_SPACE + ".getById", id);
    }

    @Override
    public void update(Bywho holiday) {
        getSqlSession().update(NAME_SPACE + ".update", holiday);
    }

    @Override
    public void insert(Bywho holiday) {
        getSqlSession().insert(NAME_SPACE + ".insert", holiday);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
