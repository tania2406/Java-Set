package DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String args[])
	{// three ways to enter the data in Array: HashSet, LinkedHashSet,TreeSet.
		
		HashSet<Integer> h=new HashSet<Integer> (); // Hashset make the contents random.
		h.add(90);
		h.add(32);
		h.add(21);
		h.add(67);
		h.add(32);
		h.add(67);
		System.out.println(h);
		
		Set<String> s=new HashSet<String> ();
		s.add("ranchi");
		s.add("patna");
		s.add("dhanbad");
		s.add("ranchi");
		System.out.println(s); // Duplicacy is not allowed here.
		
	}
}
