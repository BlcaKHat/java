import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Small_large {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long[] arr1 = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		if(i==j)
        		{

        		}
        		else
        			arr1[i]=arr1[i]+arr[j];
        	}
        }
        //sorting ......................................
        long temp=0;
        for (int i=0;i<5 ;i++ ) {
        	for (int j=0;j<5;j++) {
        		if(arr1[i]>arr1[j])
        		{
        			temp=arr1[i];
        			arr1[i]=arr1[j];
        			arr1[j]=temp;
        		}
        	}
        	      	
        }
        System.out.print(arr1[4]+" "+arr1[0]);	

        //
        
    }
}
