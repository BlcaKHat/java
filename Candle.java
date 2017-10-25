import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candle {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
         //sorting ......................................
        int temp=0;
        for (int i=0;i<n ;i++ ) {
            for (int j=0;j<n;j++) {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }// end of sort.
        int outp=1;
        for(int i=1;i<n;i++)
        {
            if(ar[0]==ar[i])
            {
                outp++;
            }
        }
        return outp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
