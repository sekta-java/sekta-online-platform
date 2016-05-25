package sekta.platform.core.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Retro on 16.05.2016.
 */

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "forum_category_id"),
        @UniqueConstraint(columnNames = "title")
})
public class ForumCategory{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forum_category_id;

    private String title;

    @OneToMany(mappedBy = "forumCategory")
    private Set<Message> messageSet= new HashSet<Message>();

    public ForumCategory() {
    }

    public Long getForum_category_id() {
        return forum_category_id;
    }

    public void setForum_category_id(Long forum_category_id) {
        this.forum_category_id = forum_category_id;
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
