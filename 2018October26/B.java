import java.util.*;
public class main{

public static void main(String[] args)
{	
	ArrayList<String> arr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	while(true)
	{
    	String nextLine = sc.nextLine();
    	if ( nextLine.equals("0") ) 
    	{
       	break;
    	}
    	arr.add(nextLine);
	}
	int size = arr.size();
	
	for(int i =0;i<size;i++)
	{
		String test = arr.get(i);
		int iteration = Integer.parseInt(test);
		int result = 0;
		for(int j = 1;j<=iteration;j++)
		{
			result += j*j;
		}
		System.out.println(result);
	}
	
}

}
