import java.util.Scanner;

public class Sentence{
    public static void main(String[]args){
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your sentence");
        x = sc.nextLine();

            if (x.equals("")){
                System.out.println("you have not written anything");
            }else{
                int y = x.length();
                System.out.println("Length is: " + y);
            }
             sc.close();
        }
    
    }

