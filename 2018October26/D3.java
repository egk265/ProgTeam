//Final attempt as well to run it but it was getting really late and I wanted to sleep
//If fate and time allow it, I would like to re-solve this problem once again. 

import java.util.*;
import java.io.*;
public class D3{

public static void main(String[] args) throws IOException
{	
	Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
	String s = sc.nextLine();
	s = sc.nextLine();
	StringTokenizer tokens = new StringTokenizer(s);
    int numberOfWords = tokens.countTokens();
	String[] arrStr = new String[numberOfWords];
	arrStr = s.split(" ");
	String line;
	HashMap<String, String> map = new HashMap<String, String>();
	while(true)
	{
		s = sc.nextLine();
		if(s.equals("what does the fox say?")) break;
		String[] animalSound = new String [3];
		animalSound = s.split(" ");
		map.put(animalSound[0], animalSound[2]);
    	
	}
	String iterator; 
	sc.close();
	for(int i =0;i<numberOfWords;i++)
	{
		iterator = arrStr[i];
		if(map.containsValue(iterator))
		{
			continue;
		}else
		{
			System.out.print(iterator+" ");
		}
	}
}

}
