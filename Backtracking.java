public class Backtracking {
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    public static void findsubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findsubsets(str, ans, i+1);
    }

    public static void main(String args[]){
        
    }
    
}
