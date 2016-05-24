package sekta.platform.core.dao;

import sekta.platform.core.entity.TestTask;

/**
 * Created by Retro on 24.05.2016.
 */
public interface TestTaskDao extends BaseDao<TestTask> {
    TestTask getById(Long id);
}
