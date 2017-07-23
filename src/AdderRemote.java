import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder{

	AdderRemote()throws RemoteException{  
		super();  
	} 
	
	public int addNumber(int x,int y){
		return x+y;
	}  
	
	public int mulNumber(int x,int y){
		return x*y;
	} 
}
