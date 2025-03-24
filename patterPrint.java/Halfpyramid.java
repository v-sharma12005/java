import java.util.*;

public class Halfpyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++){  //line print
   
      for(int j=1; j<=i; j++){    //star print

        System.out.print(j);
      }
      System.out.println();  // for next line

    }
  }
  
}
