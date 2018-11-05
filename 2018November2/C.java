//doesn't work - review solutions
import java.util.*;
import java.io.*;
public class C{

public static void main(String[] args) throws IOException
{
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int[][] matrix = new int[num][num];
	for(int i =0;i<num;i++)
	{
		for(int j = 0;j<num;j++)
		{
			matrix[i][j] = scan.nextInt();
		}
		
	}
	
	if(checkParity(matrix))
	{
		System.out.println("OK");
	}
	
}
static boolean checkParity(int[][] matrix)
{
	int row = matrix.length;
	int column = matrix[0].length;
	for(int j =0;j<column;j++)
	{	
		int rowSum = 0;
		for(int i = 0;i<row;i++)
		{	
			rowSum += matrix[i][j];
			System.out.println("rowsum = " +rowSum);
			
		}
		if(rowSum %2!=0)
			{
				return false;
			}
	}
	for(int i =0;i<row;i++)
	{	
		int columnSum = 0;
		for(int j = 0;j<column;j++)
		{	
			columnSum += matrix[i][j];
			if(columnSum %2!=0)
			{
				return false;
			}
		}
	}
	return true;
}
}
