package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sekta.platform.core.dao.ForumCategoryDao;
import sekta.platform.core.entity.ForumCategory;
import sekta.platform.core.service.ForumCategoryService;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Retro on 23.05.2016.
 */
@Service
public class ForumCategoryServiceImp implements ForumCategoryService {

    @Autowired
    private ForumCategoryDao forumCategoryDao;

    @Override
    @Transactional
    public List<ForumCategory> getAllForumCategory() {
        return forumCategoryDao.findAll();
    }

    @Override
    @Transactional
    public ForumCategory getForumCategoryById(Long id) {
        return forumCategoryDao.getById(id);
    }

    @Override
    @Transactional
    public ForumCategory createForumCategory(ForumCategory forumCategory) {
        forumCategoryDao.create(forumCategory);
        return forumCategory;
    }

    @Override
    @Transactional
    public ForumCategory updateForumCategory(ForumCategory forumCategory) {
        forumCategoryDao.update(forumCategory);
        return forumCategory;
    }

    @Override
    @Transactional
    public void deleteForumCategory(Long id) {
        ForumCategory forumCategory= new ForumCategory();
        forumCategory.setId(id);
        forumCategoryDao.delete(forumCategory);
    }
}
