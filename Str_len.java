import java.io.*;
import java.util.*;

public class Str_len {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length() ;
        System.out.println(sum);	//lenth of A and B.

        if(A.charAt(0) > B.charAt(0))
        {
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
        A= A.substring(0,1).toUpperCase()+ A.substring(1);
        B= B.substring(0,1).toUpperCase()+ B.substring(1);
        System.out.println(A+" "+B);
    }
}
