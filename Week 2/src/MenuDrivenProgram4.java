import java.io.*;
public class MenuDrivenProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome!");
		System.out.println("1. Print 1-10");
		System.out.println("2. Print 100-1");
		System.out.println("3. Print multiples of 5 uptil n");
		System.out.println("Enter your choice : ");
		int ch = Integer.parseInt(br.readLine()); {
		}
		switch(ch) {
		case 1 :
			for(int i = 1;i<=10;i++) {
				System.out.println(i);
			}
		break;	
		case 2:		
			for(int j = 100;j>=1;j--) {
				System.out.println(j);
				
			}
		break;	
		case 3: 
		System.out.println("Enter the value of n : ");
		int n = Integer.parseInt(br.readLine());
		for(int k = 5;k<=n;k+=5) {
		
			System.out.println(k);
		}
		break;
		default: System.out.println("Wrong choice! Program will now exit! "); 
		
		}	
		}
	}

