import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Apple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] ap_pos=new int[m]; //storing positions of apples.
        int[] or_pos=new int[n];
        int ap_no=0;
        int or_no=0;
        for(int i=0;i<m;i++)
        {
            ap_pos[i]=a + apple[i];
            //check weather it is in range of house.
            if(ap_pos[i] >= s && ap_pos[i] <=t)
            {
                ap_no=ap_no+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            or_pos[i]=b + orange[i];
            if(or_pos[i] >=s && or_pos[i] <=t)
            {
                or_no=or_no+1;
            }
        }
        System.out.println(ap_no);
        System.out.println(or_no);
    }
}
