import java.util.*;
import java.io.*;
public class A{

public static void main(String[] args) throws IOException
{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(bf.readLine());
	if(n%2==0)
	{
		System.out.println("Bob");
	}else
	{
		System.out.println("Alice");
	}
}
}
