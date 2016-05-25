package sekta.platform.core.entity;

import javax.persistence.*;

/**
 * Created by Retro on 14.05.2016.
 */

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "grade_id")
})
public class Grade  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grade_id;

    private String grade;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Grade() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Long grade_id) {
        this.grade_id = grade_id;
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
