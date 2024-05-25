package DSA;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
	public static void main(String args[])
	{

	LinkedHashSet<Integer> h=new LinkedHashSet<Integer> ();  // linkedHashSet shows the contents serially.
	h.add(90);
	h.add(32);
	h.add(21);
	h.add(67);
	h.add(32);
	h.add(67);
	System.out.println(h);
	
	Set<String> s=new LinkedHashSet<String> ();
	s.add("tania");
	s.add("vivek");
	s.add("sonu");
	s.add("ramu");
	System.out.println(s);
}
}
