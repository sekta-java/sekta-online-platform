package sekta.platform.core.service;

import sekta.platform.core.entity.ForumCategory;

import java.util.List;

/**
 * Created by Retro on 23.05.2016.
 */
public interface ForumCategoryService {
    List<ForumCategory> getAllForumCategory();
    ForumCategory getForumCategoryById(Long id);
    ForumCategory createForumCategory(ForumCategory forumCategory);
    ForumCategory updateForumCategory(ForumCategory forumCategory);
    void deleteForumCategory(Long id);

}
