package equals;

import java.util.Objects;

public class EFour {

    int id;          // primitive
    String name;     // String
    String city;     // String
    Integer age;     // Wrapper class

    public EFour(int id, String name, String city, Integer age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    
    public boolean equals(Object obj) {

    	  EFour f1 = (EFour) obj;
       
        if(this.id == f1.id &&                       
               Objects.equals(this.name, f1.name) &&  
               Objects.equals(this.city, f1.city) &&    
               Objects.equals(this.age, f1.age)) {
        	return true;
        }else {
        	return false;
        }
    }

}


//@Override
//public boolean equals(Object obj) {
//
//    if (this == obj)
//        return true;
//
//    if (obj == null)
//        return false;
//
//    if (this.getClass() != obj.getClass())
//        return false;
//
//    EFour other = (EFour) obj;
//
//    return this.id == other.id &&                       
//           Objects.equals(this.name, other.name) &&  
//           Objects.equals(this.city, other.city) &&    
//           Objects.equals(this.age, other.age);      
//}
