//Write a program to compare two sets and retain elements which are same on both sets.
package com.hefshine.hw;

import java.util.HashSet;
import java.util.Iterator;

public class Q02_CompareAndReturnElementWhichAreSame 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(13);
		hs.add(24);
		hs.add(15);
		hs.add(16);
		hs.add(17);
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(13);
		hs1.add(14);
		hs1.add(15);
		hs1.add(16);
		hs1.add(17);
		Object o1,o2;
		if(hs.size()==hs1.size())
		{
			Iterator it1=hs.iterator();
			Iterator it2=hs1.iterator();
			while(it1.hasNext()&&it2.hasNext())
			{
				 o1=it1.next();
				 o2=it2.next();
				if(o1==o2)
				{
					System.out.println(o1);
				}
			}
		}
	}

}
