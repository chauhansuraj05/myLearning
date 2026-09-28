package inheritance;
class GrandF{
	String name = "Anil Ambani";
}
class Parent extends GrandF{
	String name = "Smith"; 
	
	String gfName = super.name;
	
	void showParentProperties(){
		System.out.println("Father Name : "+ super.name);
		System.out.println("Child Name : "+ name);
	}
}

class Child extends Parent{
	String name = "Martin";
	
	void showChildProperties(){
		System.out.println("Grand Father Name : "+ gfName);
		System.out.println("Father Name : "+ super.name);
		System.out.println("Child Name : "+ name);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Child child = new Child();
		child.showParentProperties();
		System.out.println();
		child.showChildProperties();
	}
}
