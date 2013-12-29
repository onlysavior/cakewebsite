package cakewebsite.manager;

import cakewebsite.common.dataobject.Bywho;
import cakewebsite.dao.mapper.BywhoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:45
 * To change this template use File | Settings | File Templates.
 */
public class ByWhoManager {
    @Autowired
    private BywhoMapper bywhoMapper;

    private Map<Long, Bywho> cache = new ConcurrentHashMap<Long, Bywho>();

    public Bywho getById(Long id) {
        if(cache.containsKey(id)) {
           return cache.get(id);
        }
        Bywho rtn = bywhoMapper.getById(id);
        cache.put(rtn.getId(), rtn);
        return rtn;
    }

    public void clearCache() {
        cache.clear();
    }

    public List<Bywho> list() {
        return bywhoMapper.list();
    }
}
