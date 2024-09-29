public class touhid {

    public static void main(String h[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {  // outer loop 

            for (int j = 1; j <= i; j++) {  // inner loop
                
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }
                else{
                    if (j % 2 != 0)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
