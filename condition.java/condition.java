import java.util.*;


public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num:");

        int num = sc.nextInt();
       // System.out.println("Enter the Num:");

        if (num%2==0) {                                //if else condition Applied
            System.out.println("Num is Even:");
            
        } else{
            System.out.println("Num is odd:");
        }
    }
    
}
