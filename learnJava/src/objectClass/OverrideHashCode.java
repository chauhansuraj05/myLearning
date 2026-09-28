package objectClass;

class Dog{
	String name;
	String color;
	
	Dog(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	
	public boolean equals(Dog obj) {
		
		if(this.name.equalsIgnoreCase(obj.name) && this.color.equalsIgnoreCase(obj.color)) {
			return true;
		}else
			return false; 
	}
	
	public int hashCode() {
		return name.toLowerCase().hashCode()+color.toLowerCase().hashCode();
	}
}

public class OverrideHashCode {
	public static void main(String[] args) {
		Dog d1 = new Dog("GoLuU", "Kala");
		Dog d2 = new Dog("GoLuu", "Kala");
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(d1 == d2);		// false
		System.out.println(d1.equals(d2));	// true
		
		System.out.println("======================");
		
		System.out.println(d1.hashCode() == d2.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
