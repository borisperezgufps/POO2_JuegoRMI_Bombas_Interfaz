package bombas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBomba extends Remote{

	public void procesarPosicion(String usuario, int x, int y) throws RemoteException;
	
}
