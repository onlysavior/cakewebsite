package cakewebsite.manager;

import cakewebsite.common.dataobject.Holiday;
import cakewebsite.dao.mapper.HolidayMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public class HolidayManager {
    @Autowired
    private HolidayMapper holidayMapper;
    private Map<Long, Holiday> cache = new ConcurrentHashMap<Long, Holiday>();

    public Holiday getById(Long id) {
        if(cache.containsKey(id)) {
            return cache.get(id);
        }
        Holiday rtn = holidayMapper.getById(id);
        cache.put(rtn.getId(), rtn);
        return rtn;
    }

    public void clearCache() {
        cache.clear();
    }

    public List<Holiday> list() {
        return holidayMapper.list();
    }
}
