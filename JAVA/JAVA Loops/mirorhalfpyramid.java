public class mirorhalfpyramid {
    public static void main(String args[])
    {
        int n = 5;


        //outer loop//cols
        for(int i=1; i<=n; i++)
        {
           for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
           // inner loop//row
            for(int j=1; j<=i; j++){

                    System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
