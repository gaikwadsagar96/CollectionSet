//Write a program to empty an hash set.

package com.hefshine.cw;

import java.util.HashSet;
import java.util.Iterator;

public class Q4_EmptyHashset 
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
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		hs.removeAll(hs);
		System.out.println();
		if(hs.isEmpty())
			System.out.println("hashset is empty");

	}

}
