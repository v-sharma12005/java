import java.util.*;

public class loops {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter: ");
  int n = sc.nextInt();
    
  

 //int n =2525;
 while(n>0){
  int lastDigit = n%10;
  System.out.print(lastDigit +" ");
   n = n/10;
 }
 System.out.println();

  
}
  
}
