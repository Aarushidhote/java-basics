import java.util.Scanner;
class Numberofyears 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = sc.nextInt();
        int minYear = 365*24*60;
        int years = min/minYear;
        int days =(min%minYear)/24*60;
        System.out.println("Enter minutes : "+min);
        System.out.println(years + "years" + days + "days");
    
    }
}