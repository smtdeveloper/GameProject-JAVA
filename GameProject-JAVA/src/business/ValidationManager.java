package business;

import entity.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean iAmNotARobot(Gamer gamer) {
		if (gamer.getTc().length() == 11 ) {
			System.out.println("Kimlik do�rulamas� ba�ar�l�.");
			return true;
		}
		else
			System.out.println("Robot musun len :)");
		return false;
		
	}

}
