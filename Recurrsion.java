public class Recurrsion {
    public static void printdec(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);

    }

    public static void printInc(int n){
        if (n==1){
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");

    }
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn= n * fact(n-1);
        return fn;
    }
    public static int calcsum(int n){
        if (n==1){
            return 1;
        }
        int Snm1= calcsum(n-1);
        int Sn= n + Snm1;
        return Sn; 
    } 
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibn= fibnm1 + fibnm2;
        return fibn;
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstoccurance(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    public static int lastoccurance(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int isfound = lastoccurance(arr, key, i+1);
        if (isfound == -1 && arr[i]==key) {
            return i;
        }
        return isfound;
    }
    public static int power(int x,int i){
        if(i==0){
            return 1;
        }
        return x *power(x,i-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
