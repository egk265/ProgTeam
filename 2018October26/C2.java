//Tried using Buffered Reader; Does not work

import java.util.*;
import java.io.*;
public class C{

public static void main(String[] args) throws IOException
{	
    ArrayList<String> arr = new ArrayList<String>();
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine()); 

    
    for(int i =0;i<size;i++)
    {
        String s = br.readLine();
        String[] strArray = new String[2];
        strArray = s.split(" ");
        int len = strArray[1].charAt(0)-'0';
        for(int j=0;j<len;j++)
        {
            if(j==0)
            {
                arr.add(strArray[0]);
                s= br.readLine();
            }else
            {
                s = br.readLine();
            }   
        }

    }

    for(int i =0;i<size;i++)
    {
        System.out.println(arr.get(i).charAt(0)-'0'-1);

    }
    //br.read();

    //System.out.println();
	
	
}

}
