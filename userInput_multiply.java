import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
	
		//User Input
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int myInt = scan.nextInt(); //-> gets next input as int
		System.out.println("Your number is: " + myInt);
		
	//print the multiplication table up to 10 with the user input stored in myInt variable
		for (int i = 1; i < 11; i++) {
			//print i * myInt
			System.out.println(i + " x " + myInt + " = " + (i*myInt));
		}
	}
}
