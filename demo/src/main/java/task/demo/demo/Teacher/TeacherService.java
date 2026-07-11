package task.demo.demo.Teacher;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    public List<TeacherEntity> findAllTeachers() {
        return List.of(
                new TeacherEntity(

                        "Clement",
                        "Mwangi",
                        37636566,
                        "irungucleymoh@gmail.com"
                ),

                new TeacherEntity(
                        "Avril",
                        "Irungu",
                        23023501,
                        "irunguclymoh@gmail.com"
                )
        );
    }
}




