import java.rmi.*;  

public class MyClient {
	public static void main(String args[]){  
		try{  
			Adder stub=(Adder)Naming.lookup("rmi://localhost:6000/sonoo");  
			System.out.println(stub.addNumber(34,4));  
			System.out.println(stub.mulNumber(2,4));  
		}
			catch(Exception e){}  
		}  
}
