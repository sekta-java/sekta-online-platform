package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.UserDao;
import sekta.platform.core.dao.UserRatingDtoDao;
import sekta.platform.core.entity.User;
import sekta.platform.web.dto.UserRatingDto;

/**
 * Created by natad on 18.05.2016.
 */
@Repository
public class UserRatingDtoDaoImpl extends BaseDaoImpl<UserRatingDto> implements UserRatingDtoDao {
    @Override
    public UserRatingDto getById(Long id) {
        return (UserRatingDto) sessionFactory.getCurrentSession().get(UserRatingDto.class, id);
    }
}
