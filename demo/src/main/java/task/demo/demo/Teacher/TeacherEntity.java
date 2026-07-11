package task.demo.demo.Teacher;

public class TeacherEntity {


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public TeacherEntity(String firstname,
                         String lastname,
                         int idnumber,
                         String email
    )
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idnumber = idnumber;
        Email = email;
    }

    public TeacherEntity() {
    }

    private  String firstname;

    private String lastname;

     private int  idnumber;

     private  String Email;

}
