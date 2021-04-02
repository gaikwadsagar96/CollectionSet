//Write a program to add all the elements of a specified tree set to another tree set.
package com.hefshine.hw;

import java.util.TreeSet;

public class Q06_AddAllElementToOtherTreeset 
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
		 ts1.addAll(ts);
		 System.out.println(ts1);
	}

}
