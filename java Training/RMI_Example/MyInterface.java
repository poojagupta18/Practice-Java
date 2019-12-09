import java.rmi.*;

public interface MyInterface extends Remote
{
	public String wordCount(String str) throws RemoteException;
}