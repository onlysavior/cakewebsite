package cakewebsite.common.dataobject.enumobject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 下午2:24
 * To change this template use File | Settings | File Templates.
 */
public enum LocationEnum {
    LIAO_YUAN(1L,"辽源");

    LocationEnum(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
