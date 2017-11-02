import java.util.*;
import java.io.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           int sum=0;
           //double total=0;
           for (int k=0;k<=n ;k++ ) {
                sum=sum + a + (int)(Math.pow(2,k)*b);
                System.out.print(sum +" ");
           //     total=total+sum;
            } 
          //  System.out.print(" = "+ total);
            System.out.print("\n");
        }
        in.close();
    }
}
