import java.util.*;

public class factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;          //to hold the number
    int factorial=1;    //to hold the factorial

    System.out.println("Enter Any Positive Integer:");
    num=sc.nextInt();
    for(int i =1; i<=num; i++){
      factorial*=i;

    }
    System.out.println("facttorial: "+factorial);

  }

}
  

