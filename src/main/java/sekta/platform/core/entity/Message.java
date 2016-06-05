package sekta.platform.core.entity;


import javax.persistence.*;

/**
 * Created by Retro on 16.05.2016.
 */

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    private String message;

    private String createdAt;

    @ManyToOne
    @JoinColumn(name="forum_id")
    private ForumCategory forumCategory;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Message() {
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long id_message) {
        this.messageId = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String data_stamp) {
        this.createdAt = data_stamp;
    }

    public ForumCategory getForumCategory() {
        return forumCategory;
    }

    public void setForumCategory(ForumCategory forumCategory) {
        this.forumCategory = forumCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
