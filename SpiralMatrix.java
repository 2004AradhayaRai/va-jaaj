public class SpiralMatrix {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length;
        int endcol=matrix[0].length;

        while (startrow<=endrow && startcol<=endcol) {
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            //right
            for (int i=startrow; i<=endrow; i++){
                System.out.print(matrix[i][endcol]);
            }
            //bottom
            for(int j=endcol-1;j>=startrow+1;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]);
            }
            //left
            for(int i=endrow-1; i>=startrow-1; i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]);
            }
            
            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        System.out.println();

    }
    public static void main (String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(matrix);


    }
    
}
