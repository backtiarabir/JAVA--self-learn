public class solidRhombas {
    public static void main(String[] args) {
        
        int n = 7;

        for(int i=1; i<=n; i++){

            //inner loop-- space part
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");

            }

            for(int j = 1; j<=n; j++){
                System.out.print("*");

            } 



            for( int j =1; j<=i*2;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }            
            for(int j=1; j<=n+1-i; j++){
                if(j==1)
                {System.out.print("******"); }           }
            System.out.println();
        }
    }
}
