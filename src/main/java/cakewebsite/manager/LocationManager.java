package cakewebsite.manager;

import cakewebsite.common.dataobject.Location;
import cakewebsite.dao.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:51
 * To change this template use File | Settings | File Templates.
 */
public class LocationManager {
    @Autowired
    private LocationMapper locationMapper;
    private static final Map<Long, Location> cache = new ConcurrentHashMap<Long, Location>();

    public Location getById(Long id) {
        if(cache.containsKey(id)) {
            return cache.get(id);
        }
        Location rtn = locationMapper.getById(id);
        cache.put(rtn.getId(), rtn);
        return rtn;
    }

    public void clearCache() {
        cache.clear();
    }

    public List<Location> list() {
        return locationMapper.list();
    }
}
