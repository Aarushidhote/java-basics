import java.util.Scanner;
class HiTwoFive
{
    public static void main(String[] args) 

{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a  number :");
	int num = sc.nextInt();

	String op = ((num%2==0 && num%5==0))?("hitwofive"):((num%2==0)?("hitwo"):((num%5==0)?("hifive"):(" ")));
	System.out.println(op);	
}

}