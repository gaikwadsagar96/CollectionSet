//Write a program to iterate through all elements in a hashlist.
package com.hefshine.cw;

import java.util.HashSet;
import java.util.Iterator;

public class Q2_IterateHashSet 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet();
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(17);
		//System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
