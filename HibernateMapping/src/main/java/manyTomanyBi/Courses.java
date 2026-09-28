package manyTomanyBi;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;  
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity(name = "Course_c")
@Table(name = "Course_T")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String coursename;
    private double fees;

    @ManyToMany
    @JoinTable(
        name = "student_courses_SStd",
        joinColumns = @JoinColumn(name = "courses_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> s;
    
    

	public String toString()
	{
		return coursename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}

    
   }
