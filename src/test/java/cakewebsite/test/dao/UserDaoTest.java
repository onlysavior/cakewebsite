package cakewebsite.test.dao;

import cakewebsite.common.dataobject.User;
import cakewebsite.dao.mapper.UserMapper;
import cakewebsite.test.BaseSpringTest;
import org.junit.Assert;
import org.junit.Test;

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
}
