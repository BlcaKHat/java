import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j= n-i; j>=0; j--)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
