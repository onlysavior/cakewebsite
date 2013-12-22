package cakewebsite.common.dataobject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public class Article extends BaseDO {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
