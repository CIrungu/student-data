package task.demo.demo.student;

import org.jvnet.staxex.BinaryText;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

    void deleteByEmail(String email);

    String email(String email);



    String Email(String email);


}
