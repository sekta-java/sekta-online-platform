package sekta.platform.core.service;

import sekta.platform.core.entity.Answer;

import java.util.List;

/**
 * Created by natad on 29.05.2016.
 */
public interface AnswerService {
    List<Answer> getAllAnswers();
    Answer getAnswerById(Long id);
    Answer createAnswer(Answer answer);
    Answer updateAnswer(Answer answer);
    void deleteAnswer(Long answerId);
}
