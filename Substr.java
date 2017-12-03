/* Printing the sub-string of an string*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substr {

    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
    String name = userInput.nextLine();
    char[] nameArray = name.toCharArray();
    	int len=name.length();
    	//System.out.println(len);
        int start = userInput.nextInt();
        int end = userInput.nextInt();

        if(start <len && end <=len){
        	for(int i=start;i<end;i++)
        	{
        		System.out.print(nameArray[i]);
        	}
        }
        else{
        	System.out.println("incorrct length");
        }
        
    }
}
