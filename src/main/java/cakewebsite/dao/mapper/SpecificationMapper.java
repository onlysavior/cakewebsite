package cakewebsite.dao.mapper;

import cakewebsite.common.annotation.MyBatisMapper;
import cakewebsite.common.dataobject.Specification;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-22
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
@MyBatisMapper
public interface SpecificationMapper {
    public List<Specification> getByProduct(Long product);
    public void update(Specification specification);
    public void insert(Specification specification);
    public void deleteById(Long id);
}
