import java.util.Scanner;
class Weather
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the season: ");
        String season = sc.next();

        switch (season) 
        {
            case "Winter": 
            {
            	System.out.println("December");
                System.out.println("January");
                System.out.println("February");
                System.out.println("March");
                break;
            }
            case "Summer": 
            {
                System.out.println("April");
                System.out.println("May");
                System.out.println("June");
                System.out.println("July");
                break;
            }
            case "Rainy": 
            {
                System.out.println("August");
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                break;
            }
            default: 
            {
                System.out.println("Invalid season");
            }
        }
        
    }
}