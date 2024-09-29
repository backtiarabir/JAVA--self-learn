import java.util.Scanner;

public class reverseorg {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0)
        {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;   //making laast digit into first digit
            n = n / 10;    //last digit deletion
        }
        System.out.println("Reverse of "+n+" is: " + rev);
    }
}
