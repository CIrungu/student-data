package task.demo.demo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository

public class InMemoryStudentDao {


    private final List<Student> STUDENT = new ArrayList<>();



    public Student save(Student S) {

        STUDENT.add(S);
                return S;

    }


    public List<Student> findAllStudents() {
        return STUDENT;

    }


public Student findByEmail(String Email) {
    return STUDENT.stream()
            . filter(s -> Email.equals(s.getEmail())).findFirst().orElse(null);

}

public Student update(Student s) {

   var studentIndex = IntStream.range(0, STUDENT.size())
           .filter(index -> STUDENT.get(index).getEmail().equals(s.getEmail()))
           .findFirst()
           .orElse(-1);

   if (studentIndex > -1) {
       STUDENT.set(studentIndex, s);
       return s;
   }
       return null;
}


public void delete(String EmaIL) {
    var Student = findByEmail(EmaIL);
    if (Student != null) {
        STUDENT.remove(Student);
    }
}
}
