// https://vjudge.net/contest/265441#problem/D
//Again My solution does not work
//Not sure if it is a spacing problem or if there is an error in the logic

import java.util.*;
import java.io.*;
public class D{

public static void main(String[] args) throws IOException
{	
	ArrayList<String> arr = new ArrayList<String>();
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    int size = Integer.parseInt(reader.readLine());
	String s = reader.readLine();
	StringTokenizer tokens = new StringTokenizer(s);
    int numberOfWords = tokens.countTokens();
	String[] arrStr = new String[numberOfWords];
	arrStr = s.split(" ");
	String line;
	HashMap<String, String> map = new HashMap<String, String>();
	StringBuilder sb = new StringBuilder();
	while(reader.ready() && (line = reader.readLine()) != null)
	{
		String[] animalSound = new String [3];
		animalSound = line.split(" ");
		map.put(animalSound[0], animalSound[2]);
    	
	}
	String iterator; 
	reader.close();
	for(int i =0;i<numberOfWords;i++)
	{
		iterator = arrStr[i];
		if(map.containsValue(iterator))
		{
			continue;
		}else
		{
			sb.append(iterator+" ");
		}
	}
	System.out.println(sb.toString());
}

}
