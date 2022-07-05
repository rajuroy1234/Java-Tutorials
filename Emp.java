import java.util.*;
class Emp{				//Encapsulated classification
	static Scanner sc=new Scanner(System.in);

	public static int[] empid=new int[1000];	//Abstracted attribute
	public static String[] name=new String[1000]; //Abstracted attribute
	private static int[] sal=new int[1000];	//Encapsulated attribute(data hiding)
	
	public int getSal(int i){			//getter
		return sal[i];
	}
	
	public static void setSal(int s,int i)		//setter
	{
		if(s<=0)
		{
			s=0;
		}
		sal[i]=s;
	}
	
	public static void imputEmp(int id, String n, int s,int i)	//Abstracted behavior
	{
		empid[i]=id;
		name[i]=n;
		setSal(s,i);
	}
	
	public static void display(int i)			//Abstracted behavior
	{
		System.out.println("\nName: "+name[i]+"\nId: "+empid[i]+"\nSalary: "+sal[i]);
	}
}
