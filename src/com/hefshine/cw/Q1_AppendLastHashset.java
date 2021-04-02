//Write a program to append the specified element to the end of a hash set
package com.hefshine.cw;

import java.util.HashSet;

public class Q1_AppendLastHashset 
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
		System.out.println(hs);
		for(int i=0;i<=hs.size()+1;i++)
		{
			if(hs.size()+1==hs.size()+1)
			{
				hs.add(18);
			}
		}
		System.out.println(hs);

	}

}
