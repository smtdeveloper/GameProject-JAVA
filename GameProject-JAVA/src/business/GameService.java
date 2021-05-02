package business;

import entity.Campaign;
import entity.Game;
import entity.Gamer;

public interface GameService {

	void sell(Gamer gamer, Campaign campaign, Game game);
	
	
}
