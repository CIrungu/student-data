package task.demo.demo.student;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Getter
@Setter
@RequiredArgsConstructor


public class Student {

    @Id
    @GeneratedValue
    private long id;


    private String firstname;


    private String lastname;


    private LocalDate dateofbirth;

@Column(unique = true)
    private String email;

@Transient
    private int age;

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public LocalDate getDateofBirth() {
//        return dateofbirth;
//    }
//
//    public void setDateofbirth(LocalDate dateofBirth) {
//        this.dateofbirth = dateofbirth;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Student(
//            Long id,
//            String firstname,
//            String lastname,
//            String email,
//            int age) {
//        this.id = idS;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.age = age;
//    }
//    public  Student (){}
}