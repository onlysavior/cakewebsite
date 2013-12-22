package cakewebsite.common.dataobject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class Specification extends BaseDO {
    private Double weight;
    private Integer high;
    private Integer width;
    private Double price;
    private Long product;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }
}
