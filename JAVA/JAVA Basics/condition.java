import java.util.Scanner;
public class condition {

    public static void main(String args[])
    {
        int income = nedxtInt();
        int tax = nedxtInt();
        Scanner sc = new Scanner(System.in);

        if(income<=200){
        tax =(int)(income*0);
        }

        else if(income<=500 && income>=1000){
        tax = (int)(income*0.2);
        }

        else(income>=1100){
        tax = (int)(income*0.5);
        }
        System.out.println(tax);


    }

    
}
