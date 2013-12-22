package cakewebsite.common.dataobject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 下午3:01
 * To change this template use File | Settings | File Templates.
 */
public class Type extends BaseDO {
    private String name;
    private Long parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }
}
