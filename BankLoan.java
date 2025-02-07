import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month : ");
	    int month = sc.nextInt();
	    int year = (month/12);
	    int mnth = month%12;
		System.out.println(year+(mnth/10.0));

	}
}