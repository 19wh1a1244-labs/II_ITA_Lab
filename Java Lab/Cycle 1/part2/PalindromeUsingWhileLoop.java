import java.util.Scanner;
public class PalindromeUsingWhileLoop {
	public static void main(String args[]) {
		String s;
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		
		int len = s.length();
		int i = len - 1;
		while(i>=0) {
			rev = rev + s.charAt(i);
			i--;
		}
		
		if(s.equals(rev)) {
			System.out.println("It is a palindrome..");
		}
		else {
			System.out.println("It is not a palindrome..");
		}
		
		
	}
}