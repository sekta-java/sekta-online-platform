package sekta.platform.core.dao;

import sekta.platform.web.dto.UserRatingDto;

/**
 * Created by natad on 18.05.2016.
 */
public interface UserRatingDtoDao extends BaseDao<UserRatingDto> {
    UserRatingDto getById(Long id);
}
