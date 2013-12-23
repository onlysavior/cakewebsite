package cakewebsite.dao.mapper;

import cakewebsite.common.dataobject.Product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-23
 * Time: 下午9:49
 * To change this template use File | Settings | File Templates.
 */
public interface ProductMapper {
    public Product getById(Long id);
    public List<Product> list(Long location, Long byWho, Long type, Long holiday,
                              Integer startPos, Integer pageSize);
    public Integer count(Long location, Long byWho, Long type, Long holiday);
    public void insert(Product product);
    public void update(Product product);
    public void deleteById(Long id);
}
