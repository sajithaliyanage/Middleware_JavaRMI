import java.rmi.*;

public interface Adder extends Remote {
	public int addNumber(int x, int y)throws RemoteException;
	
	public int mulNumber(int x, int y)throws RemoteException;
}
