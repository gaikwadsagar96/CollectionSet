//Write a program to convert a hash set to a List/ArrayList.
package com.hefshine.hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Q19_TreeSetToList 
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
		ArrayList al=new ArrayList();
		al=(ArrayList) ts.clone();
		LinkedList ll=new LinkedList();
		ll=(LinkedList) ts.clone();
		System.out.println(al);
		System.out.println(ll);
		
	}

}
