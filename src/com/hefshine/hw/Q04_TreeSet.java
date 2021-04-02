//Write a program to create a new tree set, add some colors (string) and print out the tree set.

package com.hefshine.hw;

import java.util.Iterator;
import java.util.TreeSet;

public class Q04_TreeSet 
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
	 Iterator it=ts.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }

	}

}
