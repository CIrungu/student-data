package task.demo.demo.Teacher;

import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherService {

    TeacherEntity save (TeacherEntity T);

    TeacherEntity findByEmail(String email);


    TeacherEntity update (TeacherEntity T);


    List<TeacherEntity> findAllTeachers();

    Void delete (String email);

}








