import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the num :");
		int range = sc.nextInt();
		System.out.println("Enter the range : ");

		  
		for (int i = 1;i<=range ;i++) 
		{
			System.out.println(num+"X"+i+(num*range));
		}
			
	}
}