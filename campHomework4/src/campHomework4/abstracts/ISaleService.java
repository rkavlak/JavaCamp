package campHomework4.abstracts;

import campHomework4.entities.Campaign;
import campHomework4.entities.Game;
import campHomework4.entities.User;

public interface ISaleService {
	 void saleWithCampaign(Game game, Campaign campaign, User user);
	 void saleWithoutCampaign(Game game, User user);
}
