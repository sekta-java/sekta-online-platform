package sekta.platform.core.service;

import sekta.platform.core.entity.Grade;

import java.util.List;

public interface GradeService {
    List<Grade> getAllGrades();
    Grade getGradeById(Long id);
    Grade createGrade(Grade user);
    Grade updateGrade(Grade user);
    void deleteGrade(Long id);
}
