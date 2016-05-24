package sekta.platform.core.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Retro on 14.05.2016.
 */

@Entity
public class User extends EntityModel{

    private String email;

    private String userName;

    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Grade> gradeSet= new HashSet<Grade>();

    @OneToMany(mappedBy = "user")
    private Set<Message> messageSet= new HashSet<Message>();

    public User() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Grade> getGradeSet() {
        return gradeSet;
    }

    public void setGradeSet(Set<Grade> gradeSet) {
        this.gradeSet = gradeSet;
    }

    public Set<Message> getMessageSet() {
        return messageSet;
    }

    public void setMessageSet(Set<Message> messageSet) {
        this.messageSet = messageSet;
    }
}
