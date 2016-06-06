package sekta.platform.core.service;

import sekta.platform.web.dto.UserRatingDto;

import java.util.List;

/**
 * Created by mr. Sergey on 06.06.2016.
 */
public interface RatingService {
    List<UserRatingDto> getAllUsersWithRating();
}
