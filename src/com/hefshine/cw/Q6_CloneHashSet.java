//Write a program to clone a hash set to another hash set.
package com.hefshine.cw;

import java.util.HashSet;

public class Q6_CloneHashSet 
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
		HashSet hs1=new HashSet();
		hs1=(HashSet) hs.clone();
		System.out.println(hs1);

	}

}
