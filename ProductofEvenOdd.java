class ProductofEvenOdd
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int evenSum = 1;
		int oddSum = 1;
		int temp = 1;
		int rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum*rem):(oddSum=oddSum*rem);

		num = num/10;
	    rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum*rem):(oddSum=oddSum*rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum*rem):(oddSum=oddSum*rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum*rem):(oddSum=oddSum*rem);

		System.out.println("EvenSum:"+evenSum);
		System.out.println("OddSum:"+oddSum);



	}
}