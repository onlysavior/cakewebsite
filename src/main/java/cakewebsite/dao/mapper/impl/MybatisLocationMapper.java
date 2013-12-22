package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Location;
import cakewebsite.dao.mapper.LocationMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:25
 * To change this template use File | Settings | File Templates.
 */
public class MybatisLocationMapper extends SqlSessionDaoSupport implements LocationMapper {
    public static final String NAME_SPACE = "cakewebsite.dao.mapper.LocationMapper";
    @Override
    public List<Location> list() {
        return getSqlSession().selectList(NAME_SPACE + ".list");
    }

    @Override
    public Location getById(Long id) {
        return getSqlSession().selectOne(NAME_SPACE + ".getById", id);
    }

    @Override
    public void update(Location holiday) {
        getSqlSession().update(NAME_SPACE + ".update", holiday);
    }

    @Override
    public void insert(Location holiday) {
        getSqlSession().insert(NAME_SPACE + ".insert", holiday);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
