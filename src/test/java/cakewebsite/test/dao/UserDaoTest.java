package cakewebsite.test.dao;

import cakewebsite.common.dataobject.User;
import cakewebsite.dao.mapper.UserMapper;
import cakewebsite.test.BaseSpringTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 上午10:47
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoTest extends BaseSpringTest {

    @Test
    public void testFindById() {
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        User user = userMapper.findById(1L);

        Assert.assertNotNull(user);
    }

    @Test
    public void testFindByNameAndPassword() {
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        User user = userMapper.findByNameAndPassword("admin", "admin");

        Assert.assertNotNull(user);
    }

    @Test
    public void testFindByEmail() {
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        User user = userMapper.findByEmail("onlysavior@foxmail.com");

        Assert.assertNotNull(user);
    }

    @Test
    public void testInsert() {
        User user = createNewUser();
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        userMapper.insert(user);

        User newCreateUser = userMapper.findByEmail("onlysavior010@gmail.com");
        Assert.assertNotNull(newCreateUser);
    }

    @Test
    public void testUpdate() {
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        User user = userMapper.findByEmail("onlysavior@foxmail.com");
        user.setPoint(20L);

        userMapper.update(user);
        User user2 = userMapper.findByEmail("onlysavior@foxmail.com");

        Assert.assertEquals(20L, (long) user2.getPoint());
    }

    @Test
    public void testList() {
        UserMapper userMapper = getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.list(null,null,null);

        Assert.assertNotNull(users);

        List<User> users2 = userMapper.list(null,1,1);
        Assert.assertNotNull(users2);
        Assert.assertEquals(1L, users2.size());
    }
}
