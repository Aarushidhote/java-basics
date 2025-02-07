class SwapNumber1
{
	public static void main (String []args)
	{
		int a = 0;
		int b = 7;
		System.out.println("Before Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);

         int temp = a;
         a = b;
         b = temp;

		System.out.println("After Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	}
}