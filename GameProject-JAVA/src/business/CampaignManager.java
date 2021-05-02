package business;

import entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " i�in ge�erli " +	" %" + campaign.getCampaignRate()
		+ " oran�nda kampanya eklenmi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id numaras�na sahip kampanya bilgileri g�ncellenmi�tir.");
		System.out.println("*********************");
		System.out.println("Kampanya ad�: " + campaign.getName() + "\n" + "Kampanya oran�: %"
				+ campaign.getCampaignRate() + "\n");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getName() + " isimli kampanya ba�ar�l� bir �ekilde silinmi�tir");
		
	}

	
}
