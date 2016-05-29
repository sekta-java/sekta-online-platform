package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.GradeDao;
import sekta.platform.core.entity.Grade;
import sekta.platform.core.service.GradeService;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeDao gradeDao;

    @Override
    @Transactional
    public List<Grade> getAllGrades() {
        return gradeDao.findAll();
    }

    @Override
    @Transactional
    public Grade getGradeById(Long id) {
        return gradeDao.getById(id);
    }

    @Override
    @Transactional
    public Grade createGrade(Grade user) {
        gradeDao.create(user);
        return user;
    }

    @Override
    @Transactional
    public Grade updateGrade(Grade user) {
        gradeDao.update(user);
        return user;
    }

    @Override
    @Transactional
    public void deleteGrade(Long id) {
        Grade grade = new Grade();
        grade.setId(id);
        gradeDao.delete(grade);
    }
}
