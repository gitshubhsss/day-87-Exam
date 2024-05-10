package Set_A;
import java.util.*;
class Emp
{
	int id;
	String name,department;
	double sallary;
	static int cnt;
	Emp()
	{
		cnt++;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter id");
		id=shubham.nextInt();
		System.out.println("Enter name and department name");
		name=shubham.next();
		department=shubham.next();
		System.out.println("Enter sallary");
		sallary=shubham.nextDouble();
		
	}
	Emp(int id,String name,String department,double sallary)
	{
		cnt++;
		this.id=id;
		this.name=name;
		this.department=department;
		this.sallary=sallary;
	}
	void display()
	{
		System.out.println("Employe id: "+id+"\nName - "+name+"\nDepartment name :"+department+"\nsallary :"+sallary);
		
	}
	static void count()
	{
		System.out.println("no of count :"+cnt);
	}
	
}
public class Employee {

	public static void main(String[] args) 
	{
		int id;
		String name,department;
		double sallary;
		Scanner shubham=new Scanner(System.in);
		Emp e1=new Emp();
		e1.display();
		Emp.count();
		Emp e2=new Emp();
		e2.display();
		Emp.count();
		

	}

}
