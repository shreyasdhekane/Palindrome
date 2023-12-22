import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to check :");
        String A=sc.next();
        String rev = "";
        /* Enter your code here. Print output to STDOUT. */
        for (int i = A.length()-1 ; i >= 0 ; i--){
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev)){
            System.out.println("Yes, The given string is a palandrome.");
        }
        else{
            System.out.println("No,The given string is not a palandrome.");
        }
        
    }
}