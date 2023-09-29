import java.util.Scanner;

public class User{
    public static void main(String[]args){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        x = sc.nextInt();
        System.out.println("Input y");
        y = sc.nextInt();
        sc.nextLine(); // consume the leftover newline character

        System.out.println("Choose an operation (+, -, *, /)");
        String operation = sc.nextLine();

        switch(operation){
            case"+":
            int sum = x+y;
             System.out.print(sum);
             break;
         case"-":
            int subtract = x-y;
             System.out.print(subtract);
             break;
         case"*":
            int times = x*y;
             System.out.print(times);
             break;
         case"/":
         if( y == 0){
             System.out.print("Cannot divide by zero");
         }else{
            int division = x/y;
             System.out.print(division);
             break;
         }
         default:
             System.out.print("Error");
             break;
        }
      sc.close();
    }
}