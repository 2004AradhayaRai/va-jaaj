public class DivideandConqure{

    public static void printArr(int arro[]){
        for(int i=0; i<arro.length; i++){
            System.out.print(arro[i]+ " ");
        }
        System.out.println();
    }

    public static void mergesort(int arro[], int si, int ei){
        if(si>=ei){//base case
            return;
        }
        
        //kaam
        int mid = si+(ei-si)/2;
        mergesort(arro, si, mid);
        mergesort(arro, mid+1, ei);
        merge(arro,si,mid,ei);
    }

    public static void merge(int arro[],int si,int mid,int ei){
        int temp[]= new int [ei-si+1];
        int i= si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei){
            if(arro[i]<arro[j]){
                temp[k]=arro[i];
                i++;
            }
            else{
                temp[k]=arro[j];
                j++;
            }
            k++;
        }
        

        //leftpart
        while (i<=mid){
            temp[k++] = arro[i++];
        }
        while (j <= ei){
            temp[k++]= arro[j++];
        }
        for (k=0,i=si; k<temp.length ; k++,i++){
            arro[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arro[]={6,3,9,5,2,8};
        mergesort(arro, 0, arro.length-1);
        printArr(arro);

    }
    

}