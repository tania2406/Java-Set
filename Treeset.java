package DSA;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
public static void main(String args[])
{
	TreeSet<Integer> h=new TreeSet<Integer> (); // treeSet shows the content in sorted order.
	h.add(30);
	h.add(89);
	h.add(56);
	h.add(78);
	h.add(10);
	h.add(46);
	System.out.println(h);
	
	Set<String> s=new TreeSet<String> ();
	s.add("ramgarh");
	s.add("kolkata");
	s.add("jamsedpur");
	s.add("hazaribag");
	System.out.println(s);
}
}
