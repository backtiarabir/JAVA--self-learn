import java.util.Scanner;

public class reversenumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse: ");
        int num = sc.nextInt();
        while(num>0)
        {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        System.out.println();
    }
}
