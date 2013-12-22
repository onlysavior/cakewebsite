package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 上午12:36
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface UserMapper {
    public User findById(Long id);
    public User findByNameAndPassword(String name, String password);
    public User findByEmail(String email);
    public void insert(User user);
    public void removeById(Long id);
    public void update(User user);
    public void changePassword(Long id, String password);
    public List<User> list(Long location, Integer startPos, Integer pageSize);
    public Long count(Long location);
}
