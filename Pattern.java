public class Pattern{
    public static void hollow_rectangle(int totrow,int totcol){
        //outer loop
        for(int i=1 ; i<=totrow; i++){
            //inner loop
            for(int j=1; j<=totcol; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("* " +" ");
                } 
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pattern(int n){
        //outer
        for (int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();    
        }
    }

    public static void half_pyramid(int n){
        for (int i=1; i<=n ; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 

    public static void floyds(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    } 

    public static void zero_one_triangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if((i+j) %2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //1st half
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 ||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    } 
    public static void diamond_prob(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]) {
        hollow_rectangle(4,4);
        System.out.println();
       
        half_pyramid(5);
        System.out.println();
        floyds(4);
        System.out.println();
        zero_one_triangle(5);
        System.out.println();
        butterfly(5);
        System.out.println();
        solid_rhombus(5);
        System.out.println();
        hollow_rhombus(5);
        System.out.println();
        diamond_prob(4);
    }
}
