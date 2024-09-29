import java.util.Scanner;
public class switchcase {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        switch(numbers){
            case 1 : System.out.println("pepsi");
                        break;
            case 2 : System.out.println("coke");
                        break;
            case 3 : System.out.println("rc");
                        break;
            case 4 : System.out.println("7 up");
                        break;
            default : System.out.println("we woke up");

        }
    }
}
