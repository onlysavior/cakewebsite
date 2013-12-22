package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.Type;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午2:34
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface TypeMapper {
    public List<Type> getParentTypes();
    public List<Type> getChildTypes(Long parent);
    public Type getById(Long id);
    public void update(Type type);
    public void insert(Type type);
    public void deleteById(Long id);
}
