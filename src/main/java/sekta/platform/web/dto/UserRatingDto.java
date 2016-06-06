package sekta.platform.web.dto;

import sekta.platform.core.entity.User;

public class UserRatingDto extends User {

    private Integer rating;

    public UserRatingDto() {
    }

    public UserRatingDto(User user) {
        this.setId(user.getId());
        this.setEmail(user.getEmail());
        this.setUserName(user.getUserName());
        this.setPassword(user.getPassword());
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
