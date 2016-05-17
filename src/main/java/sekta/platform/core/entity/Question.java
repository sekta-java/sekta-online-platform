package sekta.platform.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "tests_id")
    private TestTask testTask;

    @OneToMany(mappedBy =  "question")
    private List<Answer> answers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TestTask getTestTask() {
        return testTask;
    }

    public void setTestTask(TestTask testTask) {
        this.testTask = testTask;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
