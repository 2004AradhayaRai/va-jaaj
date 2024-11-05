import java.util.*;

public class Javabasic {

  public static int multiply(int a,int b){
    int product=a*b;
    return product;
  }

  public static int factorial(int n){
    int f=1;

    for (int i=1; i<=n; i++){
      f=f*i;
    }
    return f;
  }

  public static int bincoef(int n,int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);

    int bincoef=fact_n/(fact_r*fact_nmr);

    return bincoef;

  }

  /*public static int sum(int a, int b){
    return a+b;
  }*/

  public static int sum(int a,int b,int c){
    return a+b+c;
  }

  public static int sum(int a, int b){
    return a+b;
  }
  public static float sum(float a, float b){
    return a+b;
  }

  public static boolean isprime(int n){
    boolean isprime=true;
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i==0){
        isprime=false;
        return isprime;
      }
    }
    return true;
  }

  public static void primeinrange(int n){
    for (int i=2; i<=n; i++){
      if (isprime(i)){
        System.out.print(i+ " ");
      }
    }
    System.out.println();
  }

  public static void bintodec(int binNum){
    int pow=0;
    int decNum=0;
    int bin=binNum;
    while(binNum>0){
      int lastdigit=binNum%10;
      decNum=decNum+(lastdigit* (int) Math.pow(2,pow));
      pow++;
      binNum=binNum/10;

    }
    System.out.println("Deciml of "+ bin + " = " +decNum);
  }

  public static void dectobin(int n){
    int mynum=n;
    int pow=0;
    int binnum=0;
    while (n>0) {
      int rem=n%2;
      binnum=binnum+(rem * (int) Math.pow(10,pow));
      pow++;
      n=n/2;
    }
    System.out.println("Binary form of " + mynum + " = " + binnum);
  }


  public static void main (String args []){
    dectobin(5);
    dectobin(1);
    dectobin(2);
    dectobin(3);
    dectobin(4);
    dectobin(15);

  }

}