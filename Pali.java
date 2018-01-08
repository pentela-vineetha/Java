class Palindrome
{
	public void pali(String s)
	{
		String  rev = "";
      		
 		int length = str.length();
 
      		for ( int i = length - 1; i >= 0; i-- )
         		rev = rev + str.charAt(i);
 
      		if (str.equals(rev))
         		System.out.println(str+" is a palindrome");
     		 else
         		System.out.println(str+" is not a palindrome");
	}
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
      		str = sc.nextLine();
		pali(str);
	}
}