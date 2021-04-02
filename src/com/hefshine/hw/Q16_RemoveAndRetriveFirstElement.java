//Write a program to retrieve and remove the first element of a tree set.
package com.hefshine.hw;

import java.util.TreeSet;

public class Q16_RemoveAndRetriveFirstElement 
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
		int e=ts.first();
		System.out.println(e);
		//ts.removeIf(n -> (e==ts.first()));
		
	}

}
