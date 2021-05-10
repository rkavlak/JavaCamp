package campHomework4.concrete;

import campHomework4.abstracts.ISaleService;
import campHomework4.entities.Campaign;
import campHomework4.entities.Game;
import campHomework4.entities.User;

public class SaleManager implements ISaleService{

	@Override
	public void saleWithCampaign(Game game, Campaign campaign, User user) {
		System.out.println(game.getName() + " bought from " + user.getFirstName() + " " + user.getLastName() 
		+ " with this campaign " + campaign.getName() + " and with this price : " + game.getAfterDiscount());
		
		
	}

	@Override
	public void saleWithoutCampaign(Game game, User user) {
		System.out.println(game.getName() + " bought from " + user.getFirstName());
	}

}
