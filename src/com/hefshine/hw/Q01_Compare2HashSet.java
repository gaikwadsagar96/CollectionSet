//System.out.println(ts);
package com.hefshine.hw;

import java.util.HashSet;
import java.util.Iterator;

public class Q01_Compare2HashSet 
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
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(13);
		hs1.add(14);
		hs1.add(15);
		hs1.add(16);
		hs1.add(17);
	//	hs.add(18);
		boolean y=false;
		if(hs.size()==hs1.size())
		{
			Iterator it1=hs.iterator();
			Iterator it2=hs1.iterator();
			while(it1.hasNext()&&it2.hasNext())
			{
				if(it1.next()==it2.next())
				{
					y=true;
					//System.out.println("same");
				}
				else
				{
					y=false;
					//System.out.println("not same");
				}
			}
		}
		else {
			y=false;
			//System.out.println("not same");
		}
		if(y) {
			System.out.println("same");
		}else
			System.out.println("not same");
	}

}
