import java.util.Scanner;
class calculatetips
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bill : ");
		float bill = sc.nextFloat();
		System.out.print("Tip rate : ");
		float tipRate = sc.nextFloat();

		float tipAmount =(tipRate*bill)/100;
		float totalBill = bill+tipAmount;
		System.out.println("totalBill is : " + totalBill);
		System.out.println("Tip added is : " + tipAmount);         
        
	}
}