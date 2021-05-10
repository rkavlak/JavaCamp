package campHomework4.concrete;
import campHomework4.abstracts.ICampaignService;
import campHomework4.entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated");
		
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted");
		
	}






	
}
