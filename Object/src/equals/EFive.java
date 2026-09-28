package equals;

public class EFive {

    int id;            
    String name;       
    Integer age;       
    Double salary;     

    public EFive(int id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public boolean equals(Object obj) {

        EFive o = (EFive) obj;

        if(this.id == o.id &&               
               this.name.equals(o.name) &&     
               this.age.equals(o.age) &&       
               this.salary.equals(o.salary)) {
        	return true;
        }else {
        	return false;
        }        	
    }

}
