import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Record {

    static int[] getRecord(int[] s ,int n){
        // Complete this function
        int high=0,low=0,h=0,l=0;
         high=s[0];
         low=s[0];
        for(int i=0;i <n-1;i++)
        {
            if(s[i] <s[i+1])
            {
                high=s[i+1];
                h++;
            }
            if(s[i] > s[i+1])
            {
                low=s[i+1];
                l++;
            }
        }
        int res[] = new int[2];
        res[0]=h;
        res[1]=l;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();// taking imput..
        }
        int[] result = getRecord(s, n);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
