package business;

import entity.Gamer;

public class GamerManager implements GamerService {

	private ValidationManager validationManager;

	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	@Override
	public void register(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Kayd�n�z Ba�ar�l� bir �ekilde tamamland�.");
		}else
			System.out.println(" Hatal� Kay�t");
		
		
	}

	@Override
	public void login(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Ba�ar�l� Giri�");
		}else
			System.out.println(" Hatal� Giri� ");
	
	}

	@Override
	public void update(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Ba�ar�l� G�ncellendi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatal� G�ncelleme ");
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Ba�ar�l� Silindi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatal�, Silme i�lemi Ba�ar�s�z ");
		
	}

}
