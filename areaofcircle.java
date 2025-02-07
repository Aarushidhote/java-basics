import java.util.Scanner ;
class AreaOfCircle
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius(cm) : ");
		int radius = sc.nextInt();

		final float pi = 22/7;
		float ans = pi*radius*radius;
		System.out.print("AreaOfCircle: "+ans);
	}
}
