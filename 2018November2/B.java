//doesn't work

import java.util.*;
import java.io.*;
public class B{

public static void main(String[] args) throws IOException
{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	String s = bf.readLine();
	char[] table = new char[3];
	table = s.toCharArray();
	int start = table[0]-'0'; 
	int end = table[2]-'0';

	HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	for(int i =start;i<end-1;i++)
	{
		for(int j = i+1; j<end;j++)
		{
			int num1 = i;
			int num2 = j;
			if(gcd(num2,num1)==1)
			{
				System.out.println(" index "+ i +"  " + j);

				map.put(num1,num2);i++;
			}
		}
	}
	if(!map.isEmpty())
	{
		System.out.println("Yes");
	}	
	Iterator it = map.entrySet().iterator();
    while (it.hasNext()) 
    {
    	Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
	
}

static int gcd(int a, int b)
{
	if(b==0)
	{
		return a;
	}
	return gcd(b,a%b);
}
}
