package cakewebsite.manager;

import cakewebsite.common.dataobject.Type;
import cakewebsite.dao.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-29
 * Time: 下午1:36
 * To change this template use File | Settings | File Templates.
 */
public class TypeManager {
    @Autowired
    private TypeMapper typeMapper;

    private static final Map<Long, Type> typeCache = new ConcurrentHashMap<Long, Type>();

    public Type getById(Long id) {
        if(typeCache.containsKey(id)) {
            return typeCache.get(id);
        }

        Type type = typeMapper.getById(id);
        typeCache.put(id, type);
        return type;
    }

    public List<Type> listAllType() {
        List<Type> types = typeMapper.getParentTypes();
        return types;
    }

    public void clearCache() {
        typeCache.clear();
    }
}
