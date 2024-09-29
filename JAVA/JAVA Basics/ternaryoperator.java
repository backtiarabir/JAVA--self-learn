import java.util.Scanner;

public class ternaryoperator {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        //ternary operator
        String type = (marks<33) ? "Fail" : "Pass";
        System.out.println(type);
    }
    
}
