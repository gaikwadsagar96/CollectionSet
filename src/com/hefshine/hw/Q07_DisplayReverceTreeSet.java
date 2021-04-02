// Write a program to create a reverse order view of the elements contained in a given tree set.
package com.hefshine.hw;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Q07_DisplayReverceTreeSet 
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
		 
		 Iterator it=ts.descendingIterator();
		 while (it.hasNext())
		 {
			 System.out.println(it.next());
			
		}

	}

}
