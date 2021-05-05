package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = client.TCKimlikNoDogrula(
				customer.getNationaliyId(),
				customer.getFirstname().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
		
		
		return result;
		
		
	}
	
}
