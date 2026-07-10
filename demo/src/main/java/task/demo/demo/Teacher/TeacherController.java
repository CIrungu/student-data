package task.demo.demo.Teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

@GetMapping
    public List <String> findAllTeachers(){
        return List.of(
                "clement",
                "mwangi"
        );
    }
}