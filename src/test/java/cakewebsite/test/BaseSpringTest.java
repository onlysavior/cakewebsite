package cakewebsite.test;

import cakewebsite.common.dataobject.User;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 上午10:38
 * To change this template use File | Settings | File Templates.
 */

public class BaseSpringTest {
    protected String[] confLocations = new String[]{
            "classpath*:spring-test-context.xml"
    };
    protected ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(confLocations);
        Assert.assertNotNull("context init failed", context);
    }

    protected <T> T getBean(String name, Class<T> tClass) {
        T rtn = (T) context.getBean(name, tClass);
        Assert.assertNotNull("the bean for class " + tClass + " & name " + name + " not exist",
                rtn);
        return rtn;
    }

    protected User createNewUser() {
        User user = new User();
        user.setLocation(1L);
        user.setEmail("onlysavior010@gmail.com");
        user.setName("onlysavior");
        user.setPassword("onlysai0r");
        user.setPhone("18686684257");

        return user;
    }
}
