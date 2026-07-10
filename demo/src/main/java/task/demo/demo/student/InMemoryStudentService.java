package task.demo.demo.student;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;





@Service("Im")
public  class InMemoryStudentService implements Studentservice {


 public InMemoryStudentService(InMemoryStudentDao dao) {

  this.dao = dao;
 }

 private final InMemoryStudentDao dao;


 @Override
 public Student save(Student s) {
  return dao.save(s);
 }


 @Override
 public List<Student> findAllStudents() {
  return dao.findAllStudents();


 }

 @Override
 public Student findByEmail(String email) {

  return dao.findByEmail(email);
 }

 @Override
 public Student update(Student s) {
  return dao.update(s);
 }

 @Override
 public void delete(String email) {
  dao.delete(email);
 }
}

