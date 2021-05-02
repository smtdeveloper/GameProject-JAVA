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
					gamer.getFirstName() + " " + gamer.getLastName() + " Kaydýnýz Baþarýlý bir þekilde tamamlandý.");
		}else
			System.out.println(" Hatalý Kayýt");
		
		
	}

	@Override
	public void login(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Baþarýlý Giriþ");
		}else
			System.out.println(" Hatalý Giriþ ");
	
	}

	@Override
	public void update(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Baþarýlý Güncellendi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatalý Güncelleme ");
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Baþarýlý Silindi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatalý, Silme iþlemi Baþarýsýz ");
		
	}

}
