class forloop
{

	public static void main(String[] args) 
	{
	  int i = 1;
	  for (i=1;i<=10 ;i++ ) 
	  {
	  	System.out.println(i);
	  }

	   System.out.println();
	   char ch = 'A';
	   for (ch ='A';ch<='Z' ;ch++ ) 
	  {
	  	System.out.println(ch);
	  }

	   System.out.println();
       char lowercase = 'z';
	   for (lowercase ='z';lowercase<='a' ;lowercase-- ) 
	  {
	  	System.out.println(lowercase);
	  }
       char cha = '0';
	   for (cha ='0';ch<='9' ;cha++ ) 
	  {
	  	System.out.println(cha);
	  }
	   System.out.println();
	   for (int ascii=0; ascii<=127 ; ascii++ ) 
	   {
	   	System.out.println( ascii+ " : " +((char)ascii));
	   }
	}
	
}	
