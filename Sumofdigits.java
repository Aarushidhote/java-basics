import java.util.Scanner;
class Sumofdigits
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = sc.nextInt();

        int add  = number / 100 ;
        int add1 = (number % 100)/10 ;
        int add2 = (number % 100)%10;
        int sum = add + add1 + add2;
        System.out.print("The Sum Of Digits  : " +sum);
    }
    
}        
