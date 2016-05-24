package sekta.platform.core.entity;

import javax.persistence.*;

/**
 * Created by Retro on 14.05.2016.
 */

@Entity
public class Grade extends EntityModel {

    @Enumerated(EnumType.STRING)
    private GradeEnum grade;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Grade() {
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
