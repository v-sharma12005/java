import java.util.*;


public class character {
  public static void main(String[] args) {
   
  

  int n=4;
  char ch ='A';

  for(int line =1; line<=n; line++){    // outer loop

    for(int chars=1; chars<=line; chars++){   //inner loop
    
      System.out.print(ch);
      ch++;
      
    }System.out.println();

  }
  
}
}
