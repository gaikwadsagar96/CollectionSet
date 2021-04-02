//Write a program to clone a tree set list to another tree set.

package com.hefshine.hw;

import java.util.TreeSet;

public class Q09_CloneTreeSet 
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
		 TreeSet<String> ts1=new TreeSet<String>();
		
		
		 ts1=(TreeSet<String>) ts.clone();
		 System.out.println(ts1);
	}

}
