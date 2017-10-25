import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grades {

    static int[] solve(int[] grades){
        // Complete this function
        int[] ret=new int[grades.length];
        
        for(int i=0;i<grades.length;i++)
        {
            int inc=0;
            int temp=0;
            if(grades[i] <38)
            {
                ret[i]=grades[i];
            }
            else {
                temp=grades[i];
                 while(grades[i] % 5 != 0)
                     {
                        grades[i]++;
                        inc++;
                }
            if(inc<3)
            {
                ret[i]=grades[i];
            }
            else{
                ret[i]=temp;
            }
        }
    }
            
        return ret;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
