//Write a program to remove all of the elements from a hash set.
package com.hefshine.hw;

import java.util.HashSet;

public class Q03_RemoveAllElementFormHashSet 
{

	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(13);
		hs1.add(14);
		hs1.add(15);
		hs1.add(16);
		hs1.add(17);
		System.out.println(hs1);
		hs1.removeAll(hs1);
		System.out.println(hs1);

	}

}
