import java.util.Scanner;

public class scanner {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double pie = 3.15;
        System.out.print("Enter Radious: ");
        double Radious = sc.nextFloat();
        double Area = pie*Radious*Radious;
        System.out.println(Area);

    }
    
}
