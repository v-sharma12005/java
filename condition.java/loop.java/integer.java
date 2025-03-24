import java.util.*;

public class integer{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    int choice;
    int evenSum=0;
    int oddSum = 0;

    do{
      System.out.println("Enter Number:");
       num = sc.nextInt();

      if(num%2==0){
        evenSum+=num;

      }else{
        oddSum+=num;
      }
      System.out.println("For Continue Press 1");
      choice=sc.nextInt();
    }while(choice==1);
      System.out.println("Sum of even"+evenSum);
      System.out.println("Sum of Odd"+oddSum);

    }

  }
