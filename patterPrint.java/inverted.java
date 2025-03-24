import java.util.*;


public class inverted {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int n = sc.nextInt();
    
    for(int line = 1; line<=n; line++){    // line print

      for(int star=1; star<=n-line+1; star++){   // for Star print
        System.out.print(star);
      }
      System.out.println();  // For next line
    }
  
  }
  
}
