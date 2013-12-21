package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.User;

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
}
