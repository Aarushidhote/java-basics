class ProductofFourdigits
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int product = 1;
		int rem = num%10; 
		int dup = rem;

		product = product * rem ;
		num = num / 10;
		rem = num % 10;

        rem = num % 10;
		product = product * rem ;
		num = num / 10;
		
        rem = num % 10;
		product = product * rem ;
		num = num / 10;
		
        rem = num % 10;
		product = product * rem ;
	    

		System.out.println("Product of digits : " +product);

	}
}