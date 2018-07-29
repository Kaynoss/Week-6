import java.util.Scanner;

public class MenuDrivenProgram {

	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 {
	            
	            float a,b,area = 0;
	            char choice;
	            
	            Scanner input = new Scanner(System.in);
	 
	           
	             System.out.println("Enter c for circle.");
	             System.out.println("Enter s for square.");
	             System.out.println("Enter r for rectangle.");
	             System.out.println("Enter t for triangle.");
	             String s = input.next();
	             choice = s.charAt(0);
	 
	             
	             switch(num)
	             {
	             case 'c':
	                 System.out.println("Enter radius:");
	                 a = input.nextFloat();
	                 area = 3.14f*a*a;
	                 break;
	             case 's':
	                 System.out.println("Enter side:");
	                 a = input.nextFloat();
	                 area = a*a;
	                 break;
	             case 'r':
	                 System.out.println("Enter length and breadth:");
	                 a = input.nextFloat();
	                 b = input.nextFloat();
	                 area = a*b;
	                 break;
	             case 't':
	                 System.out.println("Enter base and height:");
	                 a =input.nextFloat();
	                 b =input.nextFloat();
	                 area = 0.5f*a*b;
	                 break;
	             default:
	                System.out.println("Error");
	             }
	 
	             System.out.println("Area = "+area);
	        }
	}

	}

