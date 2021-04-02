//Write a program to get the number of elements in a hashset.

package com.hefshine.cw;

import java.util.HashSet;
import java.util.Iterator;

public class Q3_GetNumberOfElementInHashset 
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
		int cnt=0;
		//System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			cnt++;
		}
			System.out.println("Total number of element: "+cnt);

	}

}
