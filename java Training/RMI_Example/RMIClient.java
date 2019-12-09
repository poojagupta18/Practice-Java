import java.rmi.*;
import java.io.*;

public class RMIClient
{

	public static void main(String args[]) 
	{
		try
		{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MyInterface p = (MyInterface)Naming.lookup("rmiInterface");
		System.out.println("Enter String...");
		String input = br.readLine();
		System.out.println(p.wordCount(input));
		}
		catch(Exception e)
		{
			System.out.println("Exception occured : " + e.getMessage());
		}
	}
	
	
}