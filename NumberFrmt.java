import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberFrmt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nf1=NumberFormat.getInstance(Locale.US);
        //NumberFormat nf2=NumberFormat.getInstance(Locale.FR);
        String us = nf1.format(payment);
        //String france=nf2.format(payment);
        System.out.println("US: $" + us);
        System.out.println("India: Rs." + us);
        System.out.println("China: ￥" + us);
        System.out.println("France: " + us +" "+"€");
    }
}
