import java.util.*;

public class Arrays {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++) {
            marks[i]=marks[i]+1;

        }
    }

    public static int linearsearch(String menu[],String key){

        for (int i=0; i<=menu.length; i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getgreatest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest =numbers[i];
            } 
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }   


        }
        System.out.println("smallest value is : "+ smallest);

        return largest;
    }

    public static int binsearch(int numbers[], int key){
        int start=0,end = numbers.length-1;
        

        while (start <= end) {
            int mid =(start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] <key){
                start=mid++;
            }else{
                end =mid-1;
            }
            
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first =0 , last = numbers.length-1;

        while(first < last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void printpairs(int numbers[]){
        int tp= 0;
        for (int i=0; i<numbers.length; i++){
            int curr=numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("total pairs =" + tp);

    }

    public static void subarrays(int numbers[]){
        int ts=0;
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                int s=0;
                for(int k=start; k<end; k++){
                    System.out.print(numbers[k]+" ");
                    //int sum = 0 ;
                    //um=sum + numbers[k];
                    //System.out.println("sum = " + sum);
                    //s= numbers[k];
                }
                //return(s);
            }
            System.out.println();
        }
        System.out.println("total sunarrays " + ts);
    }

    public static void subarraysum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        
        prefix[0]=numbers[0];

        //calculate prefix array
        for (int i=1;i<prefix.length;i++ ){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                //for(int k=start; k<end; k++){
                //    currsum= currsum + numbers[k];
                //}
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;

                }
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum =  " + maxsum);
    }
    public static void kadanes(int numbers[]){

        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0; i<numbers.length; i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our Max sum is = " + ms);
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10 };
        //kadanes(numbers);
        subarrays(numbers);
    }
    
}
