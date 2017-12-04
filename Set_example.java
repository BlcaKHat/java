/* implementing set.
insertion deletion
comparing sets with different values*/
import java.util.*;
public class Set_example{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	Set<String> new_set = new HashSet<String>(); //String object for set
	Set<Integer> set1 = new HashSet<Integer>(); //Integer object for set1
	Set<Integer> set2 = new HashSet<Integer>();  // set 2
	new_set.add("vijay"); // adding values.
	new_set.add("rohit");
	new_set.add("kundan");
	new_set.add("vivek");
	new_set.add(sc.nextLine()); // adding values to object

	System.out.println("Enter the  number of elements in set A");
	int s1 =  sc.nextInt();

	for(int i=0; i< s1; i++) {
	set1.add(sc.nextInt());   // input for set1 (performing set operation
	}				// set value  1st

	System.out.println("Enter the number of elements in set B");
	int s2 =  sc.nextInt();  	//input for set2
	for(int j=0; j< s2; j++) {
	set2.add(sc.nextInt());
	}

	Set<String> tree_set = new TreeSet<String>(new_set);
	System.out.println(new_set);
	System.out.println(tree_set);
	System.out.println(set1);
	System.out.println(set2);
	Set<Integer> intersect = new HashSet<Integer>(set1);
	set1.addAll(set2);
	intersect.retainAll(set2); //other functions are removeall
	System.out.println("union of set one and set 2"+(set1));
	System.out.println("intersection of set one and set 2"+(intersect));
	
	}
}
