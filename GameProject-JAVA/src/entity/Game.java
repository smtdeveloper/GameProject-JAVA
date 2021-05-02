package entity;

public class Game {

	private int id;
	private int price;
	private String name;
	private	String category;
	
	public Game() {
		
	}
	
	public Game
	(int id, int price, String name, String category ) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.category = category;
		
	}
	

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
