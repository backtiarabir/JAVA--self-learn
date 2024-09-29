import java.util.Scanner;

public class whileloop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        int number =1;
        while(number<=range)
        {
            //System.out.println(number);
            number++;
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
