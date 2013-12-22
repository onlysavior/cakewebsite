package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.Holiday;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午1:59
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface HolidayMapper {
    public List<Holiday> list();
    public Holiday getById(Long id);
    public void update(Holiday holiday);
    public void insert(Holiday holiday);
    public void deleteById(Long id);
}
