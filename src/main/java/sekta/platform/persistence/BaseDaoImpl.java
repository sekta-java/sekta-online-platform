package sekta.platform.persistence;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.BaseDao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by natad on 15.05.2016.
 */
@Repository
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    protected SessionFactory sessionFactory;
    protected Class<T> entityClass;

    public BaseDaoImpl() {
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void create(T entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

    public void update(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(entityClass).list();
    }

    @Override
    public List<T> findAllByProperty(String propertyName, Object propertyValue) {
        String queryString = "from "+ entityClass.getName() +" where " + propertyName + "= ?";
        Query queryObject = sessionFactory.getCurrentSession().createQuery(queryString);
        queryObject.setParameter(0, propertyValue);
        return queryObject.list();
    }
}
