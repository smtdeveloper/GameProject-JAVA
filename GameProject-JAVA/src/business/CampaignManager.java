package business;

import entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " için geçerli " +	" %" + campaign.getCampaignRate()
		+ " oranýnda kampanya eklenmiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id numarasýna sahip kampanya bilgileri güncellenmiþtir.");
		System.out.println("*********************");
		System.out.println("Kampanya adý: " + campaign.getName() + "\n" + "Kampanya oraný: %"
				+ campaign.getCampaignRate() + "\n");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getName() + " isimli kampanya baþarýlý bir þekilde silinmiþtir");
		
	}

	
}
