import java.util.Scanner;
class evenodd2
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  String ans = num%2==0 ? "even" : "odd";
	  System.out.println(ans);
	}
}