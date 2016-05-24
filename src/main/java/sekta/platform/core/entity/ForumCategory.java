package sekta.platform.core.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Retro on 16.05.2016.
 */

@Entity
public class ForumCategory extends EntityModel {

    private String title;

    @OneToMany(mappedBy = "forumCategory")
    private Set<Message> messageSet= new HashSet<Message>();

    public ForumCategory() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Message> getMessageSet() {
        return messageSet;
    }

    public void setMessageSet(Set<Message> messageSet) {
        this.messageSet = messageSet;
    }
}
