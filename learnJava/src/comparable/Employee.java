package comparable;

import java.util.Arrays;

public class Employee {
	
	public static void main(String[] args) {
		
		EmployeeSalary[] s = new EmployeeSalary[3];
		s[0] = new EmployeeSalary(2000);
		s[1] = new EmployeeSalary(4000);
		s[2] = new EmployeeSalary(3000);
		
		Arrays.sort(s);
		
		for(int i=0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}
