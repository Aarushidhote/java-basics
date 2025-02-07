import java.util.Scanner;
class VowelAndConsonent
{
    public static void main(String[] args) 

{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a  alphabet :");
	char ch = sc.next().charAt(0);

	String op = (ch == 'a'|| ch == 'e'||ch == 'i' || ch == 'o' || ch == 'u')?("is a vowel"):("is a consonent");
	System.out.println(op);	
}


}