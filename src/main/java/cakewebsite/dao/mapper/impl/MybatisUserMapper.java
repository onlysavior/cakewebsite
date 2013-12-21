package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.User;
import cakewebsite.dao.mapper.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 上午10:50
 * To change this template use File | Settings | File Templates.
 */
public class MybatisUserMapper extends SqlSessionDaoSupport implements UserMapper {
    private static final String NAMESPACE = "cakewebsite.dao.mapper.UserMapper";

    @Override
    public User findById(Long id) {
        return getSqlSession().selectOne(NAMESPACE + ".findById", id);
    }
}
