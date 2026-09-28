package equals;

public class ETwo {
	int a;
	int b;
	int c;
	int d;
	
	public ETwo(int a,int b,int c,int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	public boolean equals(Object obj) {
		ETwo etwo = (ETwo) obj;
		
		if(this.a==etwo.a && 
		  this.b==etwo.b &&
		  this.c==etwo.c &&
          this.d==etwo.d ){
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
//    ETwo etwo = (ETwo) obj;
//
//    return this.a == etwo.a &&
//           this.b == etwo.b &&
//           this.c == etwo.c &&
//           this.d == etwo.d;
//}

