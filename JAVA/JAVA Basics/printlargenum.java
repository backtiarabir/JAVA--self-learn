import java.util.Scanner;

public class printlargenum {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 3;
        int c = 6;

        if(a>=b && a>=c)
        {
            System.out.println("a is largest number");
        }
        if(b>=a && b>=c)
        {
            System.out.println("b is largest number");
        }
        else
        {
            System.out.println("c is largest number");
        }
    }
}

