//https://vjudge.net/contest/270597#problem/A

import java.util.*;
import java.io.*;

public class A
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<10;i++)
		{
			int n = Integer.parseInt(bf.readLine());
			if(n%42!=0)
			{
				if(map.containsKey(n))
				{
					//System.out.println("modulo "+(n%42));
					continue;
				}else
				{
					map.put(n%42,1);
				}
			}else
			{
				map.put(0,1);
			}
		}
		 
		if(map.size()==0)
		{
			System.out.println(1);
		}else
		{
			System.out.println(map.size());

		}
	}
	

}
