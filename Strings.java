import java.util.*;

public class Strings {

    public static void printLetters(String str){
        for (int i=0;i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static boolean palindrome(String str){
        for(int i=0;i<=str.length()/2; i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static String substring(String str, int si, int ei){
        String substr = "";
        for (int i=si; i<ei; i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        
        //System.out.println(palindrome(lastname));
        String str="Hello World";
        System.out.println(substring(str, 0, 8));
    }
    

    
}
