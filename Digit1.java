import java.util.Scanner;
class Digit1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Digit :");
		char num = sc.next().charAt(0);
		String type = (num>='0' && num<='9')?("is a Digit "):("is not a digit");
		System.out.println(type);
	}
}