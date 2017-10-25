import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fraction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double zero=0;
        double neg=0;
        double pos=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] == 0) {
            	zero++;
            }
            else if (arr[arr_i] < 0) {
            	neg++;
            }
            else
            	pos++;
            
        }
        //Math.round(i2*1000000.0)/1000000.0;
        double zero_fr = Math.round((zero/n)*1000000.0)/1000000.0;
        //double neg_fr  =   Math.round(neg/n)*1000000.0)/1000000.0;
        //double pos_fr  =   Math.round(pos/n)*1000000.0)/1000000.0;
        //String.format("%.6f", zero_fr);
        System.out.println(zero_fr);
       //System.out.println(neg_fr);
        //System.out.println(pos_fr);
    }
}
//// above code is partially working . not feeling to proceed.
/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        
        double fractionPositive = 0;
        double fractionZero = 0;
        double fractionNegative = 0;
        
        for (int i = 0; i < size; i++){
            a[i] = scanner.nextInt();
            if (a[i] > 0) fractionPositive += 1;
            else if (a[i] == 0) fractionZero += 1;
            else if (a[i] < 0) fractionNegative += 1;
        }
        
        System.out.println(fractionPositive/size);
        System.out.println(fractionNegative/size);
        System.out.println(fractionZero/size);
        
    }// this on is working just find out somewhere..
}
