import java.util.Scanner;

public class ifelse {
    public static void main(String agr[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax =0 ;


        if(income<500000){

            System.out.println("tax is ; 0");}

            else if(income>500000 && income<1000000){
            System.out.println("Tax Added 20%:\n"+(income*0.2));}
            //tax = (int)(income*0.2);}
            else{
                System.out.println("Tax Added 30%:"+(income*0.3));
               // tax = (int)(income*0.3);
            }

        
       //System.out.println("Your tax is "+  tax);
    }
}

