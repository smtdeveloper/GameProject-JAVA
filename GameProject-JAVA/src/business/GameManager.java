package business;

import entity.Campaign;
import entity.Game;
import entity.Gamer;

public class GameManager implements GameService {

	@Override
	public void sell(Gamer gamer, Campaign campaign, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncunun " + game.getName()
		+  game.getPrice() + " fiyat� �zerinden " + 
	    " %" + campaign.getCampaignRate() + " oran�nda indirim uygulanm��t�r");
		}

	
}
