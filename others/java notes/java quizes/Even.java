public class Even{
    public static void main(String[]args){
     
     int sum = 0;

    for(int x = 2; x <= 100; x +=2){
        sum +=x;
    } 
       System.out.println("The sum of 100 first even numbers is "+ sum);
    }
}