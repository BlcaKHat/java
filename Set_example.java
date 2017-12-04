import java.util.*;
public class Set_example{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	Set<String> new_set = new HashSet<String>();
	Set<Integer> set1 = new HashSet<Integer>();
	Set<Integer> set2 = new HashSet<Integer>();
	new_set.add("vijay");
	new_set.add("rohit");
	new_set.add("kundan");
	new_set.add("vivek");
	new_set.add(sc.nextLine());

	System.out.println("Enter the  number of elements in set A");
	int s1 =  sc.nextInt();

	for(int i=0; i< s1; i++) {
	set1.add(sc.nextInt());
	}

	System.out.println("Enter the number of elements in set B");
	int s2 =  sc.nextInt();
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
	intersect.retainAll(set2);
	System.out.println("union of set one and set 2"+(set1));
	System.out.println("intersection of set one and set 2"+(intersect));
	
	}
}
