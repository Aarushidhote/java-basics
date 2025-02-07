import java.util.Scanner;
class if1
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount :");
		double billAmt = sc.nextDouble();
		if(billAmt>2000);
		{
			billAmt-=billAmt*0.1;
		}
		    System.out.println("The Discounted bill :"+billAmt);
	}
}