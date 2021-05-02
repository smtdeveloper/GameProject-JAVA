package entity;

public class Gamer {

	private int id;
	private int money;
	private String firstName;
	private String lastName;
	private String tc;
	private String dateOfBirth;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, int money, String firstName, String lastName, String tc, String dateOfBirth ) {
		super();
		this.id = id;
		this.money = money;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tc = tc;
		this.dateOfBirth = dateOfBirth;
	}
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
