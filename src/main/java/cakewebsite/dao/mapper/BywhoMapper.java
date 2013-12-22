package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.Bywho;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:13
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface BywhoMapper {
    public List<Bywho> list();
    public Bywho getById(Long id);
    public void insert(Bywho who);
    public void update(Bywho who);
    public void deleteById(Long id);
}
