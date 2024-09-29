import java.util.Scanner;

public class forloop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        for(int number=0; number<=range; number++)
        {
            sum = sum + number;
        }
        System.out.println(sum+" ");

    }
}
