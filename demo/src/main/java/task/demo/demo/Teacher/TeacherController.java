package task.demo.demo.Teacher;

import org.hibernate.service.Service;
import org.hibernate.sql.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    // 1. Save a teacher
    @PostMapping
    public ResponseEntity<TeacherEntity> saveTeacher(@RequestBody TeacherEntity teacher) {
        TeacherEntity savedTeacher = teacherService.save(teacher);
        return new ResponseEntity<>(savedTeacher, HttpStatus.CREATED);
    }

    // 2. Get all teachers
    @GetMapping
    public ResponseEntity<List<TeacherEntity>> getAllTeachers() {
        return ResponseEntity.ok(teacherService.findAllTeachers());
    }

    // 3. Get teacher by email
    @GetMapping("/{email}")
    public ResponseEntity<TeacherEntity> getTeacherByEmail(@PathVariable String email) {
        TeacherEntity teacher = teacherService.findByEmail(email);

        if (teacher == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(teacher);
    }

    // 4. Delete teacher
    @DeleteMapping("/{email}")

    public void delete(
            @PathVariable String email) {
        teacherService.delete(email);

    }

    @ PutMapping

    public TeacherEntity getUpdate(
            @RequestBody TeacherEntity teacherEntity)
     {
        return teacherService.update(teacherEntity);

    }

}