package ActivityDec8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentCourseMain {

	public static void main(String[] args) {
		Map<Integer,String> std01 = new TreeMap<Integer,String>();
		std01.put(101,"CSE");
		std01.put(102,"ECE");
		
		for(Map.Entry m:std01.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Map<Integer,String> std02 = new TreeMap<Integer,String>();
		std02.put(1003,"M.tech");
		std02.put(1004,"B.tech");
		for(Map.Entry m1:std02.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		//Add the one set to another
		std01.putAll(std02);
			System.out.println("After the copied elements: "+std01);

		//Check the value and key elements contains Or not
			if(std01.containsKey(1003))
		{
			System.out.println("The given key is contains");
		}
		else
		{
			System.out.println("The given key is not contains");
		}

		if (std01.containsValue("B.tech"))
		{
			System.out.println("The given key is contains");
		}
		else
		{
			System.out.println("The given key is not contains");
		}
			//using replace() and removed specific given key
			System.out.println("the value is removed: "+std01.remove(1002));
			System.out.println("the value is replaced: "+std01.replace(1001,"Bcom"));

			//Find the Highest value and Lowest value
			System.out.println(std01);
			System.out.println("the First value is: "+((TreeMap<Integer, String>) std01).pollFirstEntry());
			System.out.println("the Last value is: "+((TreeMap<Integer, String>) std01).pollLastEntry());

	}

}
