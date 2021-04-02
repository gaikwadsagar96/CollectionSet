//Write a program to convert a hash set to a tree set. 
package com.hefshine.cw;

import java.util.HashSet;
import java.util.TreeSet;

public class Q8_HashSetToTreeSet 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(17);
		TreeSet ts=new TreeSet();
		ts.addAll(hs);
		System.out.println(ts);
	}

}
