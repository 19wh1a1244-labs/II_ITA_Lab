import java.util.Scanner;
public class PalindromeUsingForLoop {
	public static void main(String args[]) {
		String s;
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		
		int len = s.length();
		for( int i = len-1 ; i>=0 ; i-- ) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("It is a palindrome..");
		}
		else {
			System.out.println("It is not a palindrome..");
		}
		
		
	}
}