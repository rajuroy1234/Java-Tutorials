import java.util.*;

public class Hello extends Emp
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {		
		
		String nam;
		int ids,salar,i;
		
		System.out.println("------------------TIMES INTERNET-------------\n");
		System.out.println("Enter number of employees:");
		i=sc.nextInt();
		int j=i,k=i;
		while(i>0)
		{
			System.out.print("Enter name: ");
			nam=sc.next();
			System.out.print("Enter the id: ");
			ids=sc.nextInt();
			System.out.print("Enter the salary: ");
			salar=sc.nextInt();
			
			imputEmp(ids,nam,salar,j-i);
			System.out.println("");
			
			i--;
		}
		j=k;
		System.out.println("\nEmployee Details:");
		while(k>0)
		{
			display(j-k);			
			k--;
		}		
	}
}
