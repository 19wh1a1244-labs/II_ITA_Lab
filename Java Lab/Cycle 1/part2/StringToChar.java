import java.util.Scanner;
public class StringToChar {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		int len = s.length();
		for(int i=0;i<len;i++) {
			char ch = s.charAt(i);
			System.out.println("String to Character : "+ch);
		}
	}
}