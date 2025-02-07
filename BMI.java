import java.util.Scanner;
class BMI
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter kg :");
        float pounds = sc.nextFloat();

        float kg = 0.45359237f * pounds;
        System.out.println("Enter height in inches :");
        float heightinch = sc.nextFloat();
        float height = 0.0254f * heightinch;
        //System.out.println("Enter height in inches :"+height);

        float Bodymass = (kg/(height*height)) ;
        System.out.println("BMI is :"+Bodymass);
	}
}
