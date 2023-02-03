
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListtest0 {
	public static void main(String[] args) {
		LinkedList myll = new LinkedList();
			
		myll.add("Ironman");
		myll.add("Thor");
		myll.add("Hulk");
		myll.add("Loki");

        myll.addLast("Gamora");
		myll.addFirst("Antman");
		myll.add(2, "Natasha");

        Iterator it = myll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------");
		System.out.println("whos at the top " + myll.peek());
		System.out.println("hey first one get out " + myll.poll());
			
		System.out.println("whos standing at the last ! " + myll.pop());
		System.out.println("----------------");
		it = myll.iterator();
			
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
import java.util.LinkedList;
public class LinkedlistTest1 {
	public static void main(String[] args) {
		LinkedList myll = new LinkedList();
		myll.push("ironman");
	    myll.push("thor");
	    myll.push("thanos");
	    System.out.println(myll.pop());
}
}
