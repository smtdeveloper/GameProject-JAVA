package entity;

public class Campaign {

	private int id;
	private int campaignRate;
	private String name;
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int campaignRate, String name) {
		super();
		this.id = id;
		this.campaignRate = campaignRate;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
