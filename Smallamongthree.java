class Smallamongthree
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 15;
		int c = 12;
		int small = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
	    System.out.println("Small number : "+small);
	}
}