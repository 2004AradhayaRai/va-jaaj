public class Quicksort {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        //pivot as last element
        int pidx = partition(arr,si,ei);
        quickSort(arr,si,pidx-1);//left
        quickSort(arr, pidx+1, ei);//right
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int  i = si-1;//to make space for element smaller than pivot

        for(int j=si; j<ei;j++){
            if(arr[j] <pivot){
                i++;
                int temp= arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
        return i;



    }
    public static int search(int arr[],int tar,int si,int ei){
        if(si > ei){
            return -1;
        }
        //mid
        int mid =si+(ei-si)/2;
        //case FOUND
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if (arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);    
            }
            else{
               return search(arr, tar, mid+1, ei);
            }

        }
        //md on l2
        else{
            //case c : right
            if (arr[mid] <= tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);
                
            }
            else{
                //case d : left 
                return search(arr, tar, si, mid -1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=5;
        int taridx=search(arr, target, 0, arr.length-1);
        System.out.println(taridx);

    }
    
}
