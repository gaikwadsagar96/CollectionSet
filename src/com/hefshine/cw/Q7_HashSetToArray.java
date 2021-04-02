//Write a program to convert a hash set to an array.
package com.hefshine.cw;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Q7_HashSetToArray 
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
		Object[] ch=hs.toArray();
		System.out.println(Arrays.toString(ch));

	}

}
