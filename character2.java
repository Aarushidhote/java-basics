import java.util.Scanner;
class character2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an Alphabet :");
		char ch = sc.next().charAt(0);
	    String type = (ch >= 65 && ch <= 90)? ("uppercase"):(" ");
		System.out.println("type:"+type);
	}
}