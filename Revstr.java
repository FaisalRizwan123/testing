import java.util.Scanner;

class Revstr
{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a name: ");
			String str = input.next(); 
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
				
			}
			System.out.println(rev);
			if(str.equals(rev))
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is not a Palindrome");
			}
		}
}