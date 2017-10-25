import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Amicable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[100];
    int s1=0;
    int s2=0;
    for(int i=0;i<n;i++)
    {
    	arr[i] = in.nextInt();
    }
     for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    s1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    s2 += i;
            }
            
    }
}