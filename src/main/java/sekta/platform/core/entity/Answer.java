package sekta.platform.core.entity;


import javax.persistence.*;

@Entity
public class Answer extends EntityModel {

    private String text;

    private Boolean validate;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;


    public Answer() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(Boolean right) {
        this.validate = right;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
