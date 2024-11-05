import java.util.*;

public class Bitwise{
    public static void evenorodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        } else{
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitmask =1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n, int i,int newbit){
        if((newbit == 0)){
            return clearithbit(n, i);
        } else{
            return setithbit(n, i);
        }
    }
    public static int clearibits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearrangebits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean ispoweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(8));
    }

    
}
