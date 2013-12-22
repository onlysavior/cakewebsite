package cakewebsite.common.dataobject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 下午3:13
 * To change this template use File | Settings | File Templates.
 */
public class Product extends BaseDO {
    private String name;
    private String shortContent;
    private String longContent;
    private String taste;
    private String keepCondition;
    private Long holiday;
    private Long byWho;
    private Long type;
    private Long location;
    private String bigPic;
    private String smallPic;
    private String material;

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

    public Long getHoliday() {
        return holiday;
    }

    public void setHoliday(Long holiday) {
        this.holiday = holiday;
    }

    public Long getByWho() {
        return byWho;
    }

    public void setByWho(Long byWho) {
        this.byWho = byWho;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
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
}
