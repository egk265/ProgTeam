//https://vjudge.net/contest/270597#problem/B
//Didn't work;;; Runtime Error


import java.util.*;
import java.io.*;

public class A
{
	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		int lengthOfSubway = s.nextInt();
		int aliceHomeIndex = s.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i =0;i<lengthOfSubway;i++)
		{
			arr1.add(s.nextInt());

		}
		for(int i =0;i<lengthOfSubway;i++)
		{
			arr2.add(s.nextInt());
		}
		if(arr1.get(0)==0)
		{
			System.out.println("NO");
		}else if(arr1.get(aliceHomeIndex)==0)
		{
			for(int i =1;i<arr1.size();i++)
			{
				if(arr1.get(i)==1)
				{
					if(arr2.get(i)==1)
					{
						System.out.println("YES");
					}
				}
			}
		}
		else if(arr1.get(aliceHomeIndex)==1)
		{
			System.out.println("YES");
		}	
		else
		{
			System.out.println("NO");
		}

		
	}

	

}
