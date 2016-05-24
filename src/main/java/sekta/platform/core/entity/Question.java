package sekta.platform.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Question extends EntityModel{

    private String text;

    @OneToMany(mappedBy = "question")
    private Set<Answer> answerSet= new HashSet<Answer>();

    @ManyToOne
    @JoinColumn(name = "tests_id")
    private TestTask testTask;


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


    public Set<Answer> getAnswerSet() {
        return answerSet;
    }

    public void setAnswerSet(Set<Answer> answerSet) {
        this.answerSet = answerSet;
    }
}
