package campHomework4;
import java.time.LocalDate;

import campHomework4.adapters.MernisServiceAdapter;
import campHomework4.concrete.CampaignManager;
import campHomework4.concrete.GameManager;
import campHomework4.concrete.SaleManager;
import campHomework4.concrete.UserManager;
import campHomework4.entities.Campaign;
import campHomework4.entities.Game;
import campHomework4.entities.User;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		User();		
		Game();
		Campaign();
		Sale();

		

	}

	private static void Sale() {
		SaleManager saleManager = new SaleManager();
		saleManager.saleWithCampaign(new Game(1,"Counter Strike Global Offensive","Fps",
				"(CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago.",
				 77,25), new Campaign (1,"Steam Winter Sales!",52) , new User( 1,"Ramazan","Kavlak","11245235508",LocalDate.of(1998, 1, 21)));
	}

	private static void Campaign() {
		Campaign campaign = new Campaign(1,"Steam Winter Sales!",52);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
	}

	private static void Game() {
		Game game = new Game(1,"Counter Strike Global Offensive ","Fps",
				"(CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago.",
				 77,25);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
	}

	private static void User() throws Exception {
		User user = new User(1,"Ramazan","Kavlak","11245235508",LocalDate.of(1998, 1, 21));
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		userManager.update(user);
	}

}
