package campHomework4.adapters;
import java.rmi.RemoteException;

import campHomework4.abstracts.IUserCheckService;
import campHomework4.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName(), user.getLastName(),user.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();;
		}
		return result;
	}

	
}
