package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.TestTaskDao;
import sekta.platform.core.entity.TestTask;

/**
 * Created by Retro on 24.05.2016.
 */
@Repository
public class TestTaskDaoImpl extends BaseDaoImpl<TestTask> implements TestTaskDao {
    @Override
    public TestTask getById(Long id) {
        return (TestTask) sessionFactory.getCurrentSession().get(TestTask.class, id);
    }
}
