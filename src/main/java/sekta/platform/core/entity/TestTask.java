package sekta.platform.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TestTask extends EntityModel{

    private String name;

    @OneToMany(mappedBy =  "testTask")
    private List<Question> questions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
