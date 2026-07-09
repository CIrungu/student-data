package task.demo.demo.student;


import org.springframework.stereotype.Service;

import java.util.List;


public interface Studentservice {


    Student save (Student S);

    List<Student> findAllStudents() ;

    Student findByEmail(String Email);

    Student update(Student S);

    void delete(String EmaIL);
}
