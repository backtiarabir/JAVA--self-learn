public class butterflypattern {
    public static void main(String[] args) {
    
                int n = 4;
                
                //outer loop
                for(int i=1; i<=n; i++)
                {
                    //inner loop ----- // UPPER half
                    for(int j=1; j<=i; j++){          // 1st star part
                        System.out.print("*");
                    }

                    for(int j=1; j<=2*(n-i); j++){   //  space part
                        System.out.print(" ");
                    }

                    for( int j=1; j<=i; j++){        // 2nd star part
                       System.out.print("*");
                    }
                    System.out.println();
                } 
                
                // lower half //
                for(int i =n; i>=1; i--){

                    for(int j = 1; j<=i; j++){       // 1st star part
                        System.out.print("*");
                    }

                    int spaces = 2*(n-i);
                    for(int j = 1; j<=spaces; j++){  // space part 
                        System.out.print(" ");
                    }

                    for(int j =1; j<=i; j++){        // 2nd star part
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
}
