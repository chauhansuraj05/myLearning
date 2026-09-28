package tostring;

public class SOne {
	String name;
	String color;
	int number;
	int id;
	
	public SOne(String name,String color,int number,int id ) {
		this.name = name;
		this.color = color;
		this.number = number;
		this.id = id;
	}
	
	public String toString() {
		return "Name : "+ name +"\nColor : "+ color+"\nNumber : " +number +"\nID : "+id;
	}


}
