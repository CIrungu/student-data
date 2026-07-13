package task.demo.demo.Teacher;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryTeacherServices implements TeacherService {

    private final InMemoryTeachersDao dao;

    public InMemoryTeacherServices(InMemoryTeachersDao dao) {
        this.dao = dao;
    }

    @Override
    public TeacherEntity save(TeacherEntity teacher) {
        return dao.save(teacher);
    }

    @Override
    public TeacherEntity findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public TeacherEntity update(TeacherEntity teacher) {
        return dao.update(teacher);
    }

    @Override
    public List<TeacherEntity> findAllTeachers() {
        return dao.findAllTeachers();
    }

    @Override
    public Void delete(String email) {
        return dao.delete(email);
    }
}