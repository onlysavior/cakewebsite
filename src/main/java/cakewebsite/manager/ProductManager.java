package cakewebsite.manager;

import cakewebsite.common.ao.ProductAo;
import cakewebsite.common.dataobject.*;
import cakewebsite.dao.mapper.ProductMapper;
import cakewebsite.dao.mapper.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public class ProductManager {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private TypeManager typeManager;
    @Autowired
    private HolidayManager holidayManager;
    @Autowired
    private ByWhoManager byWhoManager;
    @Autowired
    private SpecificationMapper specificationMapper;

    public List<Type> listAllType() {
        return typeManager.listAllType();
    }

    public List<Product> listAllProduct(Long location, Long byWho, Long type,
                                        Long holiday, Integer startPos, Integer pageSize) {
        return productMapper.list(location, byWho, type, holiday, startPos, pageSize);
    }

    public ProductAo getById(Long id) {
        Product product = productMapper.getById(id);
        Type type = typeManager.getById(product.getType());
        Holiday holiday = holidayManager.getById(product.getHoliday());
        Bywho bywho = byWhoManager.getById(product.getByWho());

        ProductAo rtn = new ProductAo();
        rtn.fill(product, holiday, bywho, type);
        List<Specification> specifications = specificationMapper.getByProduct(id);
        rtn.setSpecifications(specifications);
        return rtn;
    }
}
