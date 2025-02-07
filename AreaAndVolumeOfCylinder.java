import java.util.Scanner ;
class AreaAndVolumeOfCylinder
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of a cylinder : ");
		float radius = sc.nextFloat();
		System.out.print("Enter the height of a cylinder : ");
    	float height = sc.nextFloat();
		
		final double pi = 22.0/7.0;
		double area = pi*radius*radius;
		System.out.println("Area Of Cylinder : "+area);

		double volume = area*height;
		System.out.print("Volume Of Cylinder : "+volume);
	}
}