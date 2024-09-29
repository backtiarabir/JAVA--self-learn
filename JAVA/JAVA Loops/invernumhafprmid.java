public class invernumhafprmid {
    public static void main(String arg[])
    {
        int n = 10;

        for(int i=1; i<=n ;i++)
        {
            for(int j = 1; j<=n+1-i ;j++){   //  j <= n+1-i 
                System.out.print(j+" ");

            }
             System.out.println();

        }
    }
}
