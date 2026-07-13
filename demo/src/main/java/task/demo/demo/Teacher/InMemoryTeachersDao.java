package task.demo.demo.Teacher;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryTeachersDao {

    private final List<TeacherEntity> teachers = new ArrayList<>();

    public TeacherEntity save(TeacherEntity t) {
        teachers.add(t);
        return t;
    }

    public TeacherEntity findByEmail(String email) {
        return teachers.stream()
                .filter(t -> email.equals(t.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public TeacherEntity update(TeacherEntity t) {

        int index = IntStream.range(0, teachers.size())
                .filter(i -> teachers.get(i).getEmail().equals(t.getEmail()))
                .findFirst()
                .orElse(-1);

        if (index != -1) {
            teachers.set(index, t);
            return t;
        }

        return null;
    }

    public List<TeacherEntity> findAllTeachers() {
        return teachers;
    }

    public Void delete(String email) {
        TeacherEntity teacher = findByEmail(email);
        if (teacher != null) {
            teachers.remove(teacher);
        }
        return null;
    }
}