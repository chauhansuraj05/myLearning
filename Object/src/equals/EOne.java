package equals;

public class EOne {
	
	String name;
	String color;
	String loc;
	String city;
	
	public EOne(String name,String color,String loc,String city) {
		this.name = name;
		this.color = color;
		this.loc = loc;
		this.city = city;
	}
	
	
	public boolean equals(Object obj) {
		EOne eone =(EOne)obj;
		
		if(this.name.equals(eone.name)&& 
				this.color.equals(eone.color)&& 
				this.loc.equals(eone.loc)&& 
				this.city.equals(eone.city)) {
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
//    EOne eone = (EOne) obj;
//
//    return this.name.equals(eone.name) &&
//           this.color.equals(eone.color) &&
//           this.loc.equals(eone.loc) &&
//           this.city.equals(eone.city);
//}

//
//| Point           | Your Code | Correct Code |
//| --------------- | --------- | ------------ |
//| Same output now | ✅         | ✅            |
//| Null safe       | ❌         | ✅            |
//| Type safe       | ❌         | ✅            |
//| Interview ready | ❌         | ✅            |
//| Collection safe | ❌         | ✅            |
