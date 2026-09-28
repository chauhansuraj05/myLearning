package oneTooneBi;

import jakarta.persistence.*;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	@OneToOne(mappedBy = "p")
	private Adhar p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adhar getP() {
		return p;
	}

	public void setP(Adhar p) {
		this.p = p;
	}
	

}
