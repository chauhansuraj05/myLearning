package manyTOmany;

import java.util.List;
import jakarta.persistence.*;

@Entity(name = "courses_s")
@Table(name = "courses_std")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String coursename;
    private double fees;

    @ManyToMany
    private List<Student> students;

   

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCoursename() { return coursename; }
    public void setCoursename(String coursename) { this.coursename = coursename; }

    public double getFees() { return fees; }
    public void setFees(double fees) { this.fees = fees; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", fees=" + fees +
                '}';
    }
}
