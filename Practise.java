import java.util.*;


public class Practise {

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){ //base
            return;
        }
        int mid=si+(ei-si)/2; 
        mergeSort(arr, si, mid);  //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr,si,mid,ei);
    }

    // merge method to merge the sorted array
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si; //index for first sorted part
        int j=mid+1; //index for second sorted part
        int k=0; //index for temp

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
            
        //for leftover elements of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0, i=si; k<temp.length;i++, k++){
            arr[i]=temp[k];
        }
            
    }


    //quick sort
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;  //base
        }
        //last element
        int pidx=partition(arr,si,ei);//pivot index
        quickSort(arr, si, pidx-1); //left
        quickSort(arr, pidx+1, ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot =arr[ei];
        int i=si-1;  //to make place for elements smallr than pivot

        for(int j=si;j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }   
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
