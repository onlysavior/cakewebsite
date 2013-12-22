package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.Holiday;
import cakewebsite.dao.mapper.HolidayMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:09
 * To change this template use File | Settings | File Templates.
 */
public class MybatisHolidayMapper extends SqlSessionDaoSupport implements HolidayMapper {
    public static final String NAME_SPACE = "cakewebsite.dao.mapper.HolidayMapper";
    @Override
     public List<Holiday> list() {
        return getSqlSession().selectList(NAME_SPACE + ".list");
    }

    @Override
    public Holiday getById(Long id) {
        return getSqlSession().selectOne(NAME_SPACE + ".getById", id);
    }

    @Override
    public void update(Holiday holiday) {
        getSqlSession().update(NAME_SPACE + ".update", holiday);
    }

    @Override
    public void insert(Holiday holiday) {
        getSqlSession().insert(NAME_SPACE + ".insert", holiday);
    }

    @Override
    public void deleteById(Long id) {
        getSqlSession().delete(NAME_SPACE + ".deleteById", id);
    }
}
