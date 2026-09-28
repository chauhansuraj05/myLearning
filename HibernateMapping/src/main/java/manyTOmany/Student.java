package manyTOmany;

import java.util.List;
import jakarta.persistence.*;

@Entity(name = "student_s")
@Table(name = "student_std")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String gender;

    @ManyToMany
        private List<Courses> courses;

    

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public List<Courses> getCourses() { return courses; }
    public void setCourses(List<Courses> courses) { this.courses = courses; }
}
