
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashTest3 {
	public static void main(String[] args) {
		HashSet myset = new HashSet();
		myset.add("green");
		myset.add("red");
		myset.add("orange");
		myset.add("red");
		myset.add("orange");
		
		System.out.println(myset);
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("green");
		lhs.add("red");
		lhs.add("orange");
		lhs.add("red");
		lhs.add("orange");
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add("cat");
		ts.add("Apple");
		ts.add("Ball");
		System.out.println(ts);
	}
}
