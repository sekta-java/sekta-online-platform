package sekta.platform.web.dto;

import sekta.platform.core.entity.User;

import javax.persistence.Entity;

@Entity
public class UserRatingDto extends User {

    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
