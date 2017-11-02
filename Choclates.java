import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Choclates {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int nows=0;
        for(int j=0;j<n;j++)
        {
            
            int timer=0;
            int sum=0;
            boolean b=true;
            while( b == true)
            {
                
                sum=sum+s[j];
                timer++;
                if(timer == d)
                {
                    b=false;
                }
                
            }if(sum == m)
                {
                    nows++;
                }
                                
        }
        return nows;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
