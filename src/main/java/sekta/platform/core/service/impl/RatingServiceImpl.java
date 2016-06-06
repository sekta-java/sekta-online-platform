package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.entity.Grade;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.RatingService;
import sekta.platform.core.service.UserService;
import sekta.platform.web.dto.UserRatingDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mr. Sergey on 06.06.2016.
 */
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public List<UserRatingDto> getAllUsersWithRating() {
        List<UserRatingDto> userRatingDtos = new ArrayList<UserRatingDto>();
        for (User user : userService.getAllUsers()) {
            UserRatingDto userWithRating = new UserRatingDto(user);
            int rating = 0;
            for (Grade grade : user.getGradeSet()) {
                rating += grade.getGrade();
            }
            if(!user.getGradeSet().isEmpty()){
                userWithRating.setRating(rating / user.getGradeSet().size());
            }
            else {
                userWithRating.setRating(0);
            }
            userRatingDtos.add(userWithRating);
        }

        Collections.sort(userRatingDtos, new Comparator<UserRatingDto>() {
            public int compare(UserRatingDto user1, UserRatingDto user2) {
                return user2.getRating().compareTo(user1.getRating());
            }
        });

        return userRatingDtos;
    }
}
