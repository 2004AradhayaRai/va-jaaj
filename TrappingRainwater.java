import java.util.*;

public class TrappingRainwater{
    public static int trappedrainwater(int height[]){
        int n=height.length;
        //cal left max boundary-array\
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }
        // cal right max boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);

        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
             //water level =min(left max boundary,right max boundary)
            int waterlevel= Math.min(leftmax[i],rightmax[i]);

            //trapped water = water level-height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
    public static int buyandsellstock(int price[]){
        int buyprice= Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0 ; i<price.length;i++){
            if (buyprice<price[i]){
                int profit= price[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);

            } else{
                buyprice = price[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedrainwater(height));

        int price[]={7,1,5,3,6,4};  
        //System.out.println(buyandsellstock(price));     
    }


    

}
