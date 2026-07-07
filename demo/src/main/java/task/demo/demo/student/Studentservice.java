package task.demo.demo.student;


import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Studentservice {

public List<Student> findAllStudents() {
    return List.of(
            new Student(
                    "clement",
                    "see",
                    "clemet@gmail.com",
                    32

            ),


            new Student(
                    "studii2",
                    "mwas",
                    "mwast@gmail.com",
                    36

            )
    );


}
}

