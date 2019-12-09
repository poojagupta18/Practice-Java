import java.rmi.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements MyInterface
{
	public RMIServer() throws RemoteException
	{
		System.out.println("Remote Server is running now....");
	}

	public static void main(String args[])
	{
		try
		{
			RMIServer p = new RMIServer();
			Naming.rebind("rmiInterface", p);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured " + e.getMessage());
		}
	}

	public String wordCount(String str) throws RemoteException
	{
		String[] str1 = str.trim().split("\\s+");
		System.out.println("your entered string :" + str);
		return "Total words present are : " + str1.length;
	}
}