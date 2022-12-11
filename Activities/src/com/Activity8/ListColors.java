package ActivityDec8;

import java.util.Iterator;
import java.util.TreeSet;

public class ListColors {

	public static void main(String[] args) {
		//creating tree set
		TreeSet<String> tset = new TreeSet<String>();
		//adding colors to the tree set
		tset.add("Red");
		tset.add("Blue");
		tset.add("green");
		
		//printing elements of tree set
		System.out.println("Colors of current tree set are " + tset);
		
		System.out.println("------------------");
		//Creating another tree set for colors
		TreeSet<String> tset1 = new TreeSet<>();
		//adding colors to the 2nd tree set
		tset1.add("Beige");
		tset1.add("Green");
		tset1.add("Mint Green");
		tset1.add("green");
		//printing 2nd tree set
		System.out.println("second tree set colors are: " + tset1);
		//Iterating elements
//		Iterator it = tset1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Adding the first tree set colors to second tree set
		System.out.println("Adding the 1st tree set colors to 2nd tree set" );
		//System.out.println(ts.addAll(ts1));
		tset.addAll(tset1);
		//Iterating the colors
		Iterator itr = tset.iterator();
		System.out.println("All colors available in both tree sets are: " + "\n");
		while(itr.hasNext())
		{
			System.out.println( itr.next());
		}
		//reversing a tree set
		System.out.println("Reversed tree set is: " + tset.descendingSet());
		
		//Comparing two tree sets
		
		boolean b = tset.equals(tset1);
		System.out.println("Both sets are equal?" + b);
		
		//getting the first element in tree set
		System.out.println("The first element in tree set is " + tset.pollFirst());
		
		//Getting the last element in the tree set
		
		System.out.println("The last element in the set is " + tset.pollLast());

	}

}
