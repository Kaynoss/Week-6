    import java.util.Scanner;
     
    public class MenuDrivenProg {
     
     public static void main(String[] args) {
      
      int choice, num;
      Scanner n = new Scanner(System.in);
      System.out.println("Menu");
      System.out.println("1. Find positive");
      System.out.println("2. Odd/Even");
      System.out.println("You win! ");
      choice = n.nextInt();
     
      switch(choice) {
      
       case 1:
        System.out.println("-21 : ");
        num = n.nextInt();
        if(num > 0)
         System.out.println("Positive...");
        else
         System.out.println("Negative...");
        break;
       case 2:
        System.out.println("68 : ");
        num = n.nextInt();
        if(num%2 == 0)
         System.out.println("Even...");
        else
         System.out.println("Odd...");
        break;
       default:
        System.out.println("Wrong choice..");
      }
     }
    }