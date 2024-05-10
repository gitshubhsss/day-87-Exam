package Set_A;
import java.util.*;
class Stud
{
	int roll;
	String name;
	double per;
	
	Stud()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("roll number :");
		roll=shubham.nextInt();
		System.out.println("name - :");
		name=shubham.next();
		System.out.println("Enter the percentage");
		per=shubham.nextDouble();
	}
	Stud(int roll,String name,double per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println("roll :"+roll+"\nname - "+name+"\npercentage :"+per);
	}
}
public class Student {

	public static void main(String[] args) 
	{
		int roll;
		String name;
		double per;
		int i,n;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of records");
		n=shubham.nextInt();
		Stud s1[]=new Stud[n];
		for(i=0;i<n;i++)
		{
			s1[i]=new Stud();
			System.out.println("Enter roll :");
			roll=shubham.nextInt();
			System.out.println("\nname - :");
			name=shubham.next();
			System.out.println("\nEnter the percentage");
			per=shubham.nextDouble();
			s1[i].Stud(roll,name,per);
		}
		
	}

}
