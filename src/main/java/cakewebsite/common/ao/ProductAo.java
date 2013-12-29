package cakewebsite.common.ao;

import cakewebsite.common.dataobject.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:34
 * To change this template use File | Settings | File Templates.
 */
public class ProductAo implements Serializable {
    private String name;
    private String shortContent;
    private String longContent;
    private String taste;
    private String keepCondition;
    private String bigPic;
    private String smallPic;
    private String material;
    private String holiday;
    private String byWho;
    private String type;
    private List<Specification> specifications;

    public ProductAo fill(Product product, Holiday holiday, Bywho bywho,
                          Type type) {
        this.name = product.getName();
        this.shortContent = product.getShortContent();
        this.longContent = product.getLongContent();
        this.taste = product.getTaste();
        this.keepCondition = product.getKeepCondition();
        this.bigPic = product.getBigPic();
        this.smallPic = product.getSmallPic();
        this.material = product.getMaterial();
        this.holiday = holiday.getName();
        this.byWho = bywho.getName();
        this.type = type.getName();

        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getLongContent() {
        return longContent;
    }

    public void setLongContent(String longContent) {
        this.longContent = longContent;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKeepCondition() {
        return keepCondition;
    }

    public void setKeepCondition(String keepCondition) {
        this.keepCondition = keepCondition;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getByWho() {
        return byWho;
    }

    public void setByWho(String byWho) {
        this.byWho = byWho;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }
}
