import java.util.Scanner ;
class CelsiusToFahrenheit
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius : ");
		int celsius = sc.nextInt();
		
		double fahrenheit = (9.0/5)*celsius+32;
		System.out.println(" celsius to fahrenheit is : "+fahrenheit);

	
	}
}