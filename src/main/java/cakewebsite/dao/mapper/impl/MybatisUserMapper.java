package cakewebsite.dao.mapper.impl;

import cakewebsite.common.dataobject.User;
import cakewebsite.dao.mapper.UserMapper;
import com.google.common.collect.Maps;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

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
        Map<String, Object> param = Maps.newHashMap();
        param.put("id", id);
        return getSqlSession().selectOne(NAMESPACE + ".findById", id);
    }

    @Override
    public User findByNameAndPassword(String name, String password) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("name", name);
        param.put("password", password);

        return getSqlSession().selectOne(NAMESPACE + ".findByNameAndPassword", param);
    }

    @Override
    public User findByEmail(String email) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("email", email);

        return getSqlSession().selectOne(NAMESPACE + ".findByEmail", param);
    }

    @Override
    public void insert(User user) {
        getSqlSession().insert(NAMESPACE + ".insert", user);
    }

    @Override
    public void removeById(Long id) {
        getSqlSession().delete(NAMESPACE + ".removeById", id);
    }

    @Override
    public void update(User user) {
        getSqlSession().update(NAMESPACE + ".update", user);
    }

    @Override
    public void changePassword(Long id, String password) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("id", id);
        param.put("password", password);

        getSqlSession().update(NAMESPACE + ".changePassword", param);
    }

    @Override
    public List<User> list(Long location, Integer startPos, Integer pageSize) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("location", location);
        param.put("startPos", startPos);
        param.put("pageSize", pageSize);

        return getSqlSession().selectList(NAMESPACE + ".list", param);
    }

    @Override
    public Long count(Long location) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("location", location);

        return getSqlSession().selectOne(NAMESPACE + ".count", param);
    }
}
