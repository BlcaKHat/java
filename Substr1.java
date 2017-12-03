import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substr1{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int k = sc.nextInt();  // size of sub string

	SortedSet<String> sets=new TreeSet<String>();
	for(int i=0;i<str.length()-k+1;i++)
	{
		sets.add(str.substring(i,i+k));
		System.out.println(sets);
		// break;
	}
	System.out.println(sets.first());
	System.out.println(sets.last());

	}

}