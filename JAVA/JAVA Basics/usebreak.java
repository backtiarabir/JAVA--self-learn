import java.util.Scanner;

public class usebreak {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            int ans = sc.nextInt();
            if(ans % 10 == 0){
                System.out.println("You got it bro!");
                break;
            }
            System.out.println(ans);
            //ans++;
        } while(true);
    }
}
