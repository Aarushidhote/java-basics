import java.util.Scanner;
class charactertype1
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a  character :");
	char ch = sc.next().charAt(0);

	String op = ((ch>='A'&&ch>='Z')||(ch>='a'&&ch<='z'))?((ch>='a'&&ch<='z')?(ch+"is a Lowercase Alphabet"):(ch+"is an Uppercase Alphabet")):((ch>='0'&&ch<='9')?(ch+"is a Digit"):(ch+"is a special Character"));
	System.out.println(op);
}
}

