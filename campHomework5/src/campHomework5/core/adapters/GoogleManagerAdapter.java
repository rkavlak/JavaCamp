package campHomework5.core.adapters;

import campHomework5.Google.GoogleManager;
import campHomework5.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}
