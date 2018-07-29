import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
	
	
	
		int decision = 0;
		String daniel = "unknown";
		Scanner sc = new Scanner(System.in);
		
		//the application runs until user picks -1
		while (decision != -1) {
			System.out.println("Welcome, " + daniel);
			System.out.println("1) rename user");
			System.out.println("Pick a number between 1 and 10: ");
			decision = sc.nextInt(); {
				
			if (decision > 10 || decision < -1) {
				System.out.println("Please FOLLOW THE INSTRUCTIONS!");
			}	else if (decision == 1) {
				System.out.println("enter user name: ");
				userName = sc.next(); {
					
				}
			}
			}
		}
			}
}
		