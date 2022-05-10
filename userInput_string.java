import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
	
		//User Input ->string
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String myStr = scan.next(); //-> gets next input as string
		
		//print each char in myStr separately
		for (int u = 0; u < myStr.length(); u++) {
			//print char at index u
			System.out.println(myStr.charAt(u));
		}
		
		scan.close(); //close scanner
	}
}
