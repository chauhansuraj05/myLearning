package equals;

public class EThree {

    // Primitive types
    int id;
    long phone;
    float rating;
    double salary;
    boolean active;
    char grade;

    // Object / Wrapper types (assumed NOT null)
    String name;
    Integer age;
    Double bonus;

    public EThree(int id, long phone, float rating,
                               double salary, boolean active, char grade,
                               String name, Integer age, Double bonus) {

        this.id = id;
        this.phone = phone;
        this.rating = rating;
        this.salary = salary;
        this.active = active;
        this.grade = grade;
        this.name = name;
        this.age = age;
        this.bonus = bonus;
    }

    
    public boolean equals(Object obj) {

    	 EThree other = (EThree) obj;
       
        if(this.id == other.id &&
               this.phone == other.phone &&
               Float.compare(this.rating, other.rating) == 0 &&
               Double.compare(this.salary, other.salary) == 0 &&
               this.active == other.active &&
               this.grade == other.grade &&
               this.name.equals(other.name) &&
               this.age.equals(other.age) &&
               this.bonus.equals(other.bonus)) {
        	return true;
        }else {
        	return false;
        }
    }

}

//@Override
//public boolean equals(Object obj) {
//
//    // Same reference
//    if (this == obj)
//        return true;
//
//    // Null check
//    if (obj == null)
//        return false;
//
//    // Type check
//    if (this.getClass() != obj.getClass())
//        return false;
//
//    AllDataTypeExample other = (AllDataTypeExample) obj;
//
//    return this.id == other.id &&
//           this.phone == other.phone &&
//           Float.compare(this.rating, other.rating) == 0 &&
//           Double.compare(this.salary, other.salary) == 0 &&
//           this.active == other.active &&
//           this.grade == other.grade &&
//           this.name.equals(other.name) &&
//           this.age.equals(other.age) &&
//           this.bonus.equals(other.bonus);
//}
