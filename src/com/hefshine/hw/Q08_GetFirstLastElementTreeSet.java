//Write a program to get the first and last elements in a tree set.
package com.hefshine.hw;

import java.util.TreeSet;

public class Q08_GetFirstLastElementTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		 ts.add("Red");
		 ts.add("White");
		 ts.add("Green");
		 ts.add("Blue");
		 ts.add("Yellow");
		 ts.add("Black");
		 System.out.println(ts);
		 System.out.println(ts.first());
		 System.out.println(ts.last());

	}

}
