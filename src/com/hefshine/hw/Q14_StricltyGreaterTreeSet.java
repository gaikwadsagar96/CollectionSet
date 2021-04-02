//Write a program to get the element in a tree set which is strictly greater than or equal to the given element
package com.hefshine.hw;

import java.util.Iterator;
import java.util.TreeSet;

public class Q14_StricltyGreaterTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(8);
		ts.add(11);
		ts.add(5);
		ts.add(56);
		ts.add(10);
		ts.add(60);
		ts.add(9);
		ts.add(57);
		ts.add(6);
		ts.add(67);
		ts.add(7);
		int e=7;
		int a;
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext())
		{
			a=it.next();
			if(a>=e)
			{
				System.out.println(a);
			}
		}

	}

}
