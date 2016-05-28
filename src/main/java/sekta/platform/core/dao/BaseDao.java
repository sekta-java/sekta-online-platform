package sekta.platform.core.dao;

import java.util.List;

/**
 * Created by natad on 15.05.2016.
 */
public interface BaseDao<T> {

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    List<T> findAll();

    List<T> findAllByProperty(String propertyName, Object propertyValue);

}
