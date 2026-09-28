package comparable;

public class EmployeeSalary implements Comparable {

	int salary;
	
	public EmployeeSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Salary : " + salary;
	}
	
	public int compareTo(Object obj)
	{
		EmployeeSalary sal = (EmployeeSalary) obj;
		return this.salary - sal.salary;
	}
}
