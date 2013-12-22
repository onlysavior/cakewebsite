package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.Location;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface LocationMapper {
    public List<Location> list();
    public Location getById(Long id);
    public void update(Location holiday);
    public void insert(Location holiday);
    public void deleteById(Long id);
}
