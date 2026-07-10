package task.demo.demo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("DB")
@Primary
public class DBStudentService implements Studentservice {

    private  final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student S) {
        return repository.save(S);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String Email) {
        return repository.findByEmail ( "Email");
    }

    @Override
    public Student update(Student S) {
        return repository.save(S);
    }

    @Override
    public void delete(String EmaIL) {
repository.deleteByEmail("Email");
    }
}
