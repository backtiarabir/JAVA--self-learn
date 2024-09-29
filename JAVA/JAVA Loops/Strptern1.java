import java.util.Scanner;

public class Strptern1 {

    public static void main(String[] args) {

        Scanner st= new Scanner(System.in);
        int n = st.nextInt();
        int m = st.nextInt();

        //outer loop
        for(int i = 1; i<=n ; i++)
        {
            //inner loop
            for(int j = 1;j<=m; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
