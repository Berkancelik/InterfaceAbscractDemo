package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	boolean chckIfRealPerson(Customer customer )throws NumberFormatException, RemoteException;

}
