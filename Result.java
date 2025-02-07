class Result
{
	public static void main(String[] args) 
	{
		int marks = 457;
		double percentage = (marks*100)/600;
		System.out.println("Percentage :"+percentage);
		String result = (percentage>=35)?("PASS"):("FAIL");
		System.out.println(result);
	}
}