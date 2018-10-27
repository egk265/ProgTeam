//https://vjudge.net/contest/265441#problem/C
//doesn't work;;; cannot solve the spacing issue; The code should be simpler as well.
import java.util.*;
import java.io.*;
public class C{

public static void main(String[] args) throws IOException
{	
    ArrayList<String> arr = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt(); 
    String s;
    sc.nextLine();
    for(int i =0;i<size;i++)
    {
        s = sc.nextLine();
        String[] strArray = new String[2];
        strArray = s.split(" ");
        int len = strArray[1].charAt(0)-'0';
        for(int j=0;j<len;j++)
        {
            if(j==0)
            {
                arr.add(strArray[0]);
                s = sc.nextLine();
            }else
            {
                s = sc.nextLine();
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
