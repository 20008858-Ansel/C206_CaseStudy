
public class field {
	private String type;
	private int size;
	private String name;
	private int number;
	private String email;
	private double budget;
	private String date;
	private String renoType;
	private int rooms;
	private int toilet;
	
	
	public String getType() {
		return type;
	}


	public int getSize() {
		return size;
	}


	public String getName() {
		return name;
	}


	public int getNumber() {
		return number;
	}


	public String getEmail() {
		return email;
	}


	public double getBudget() {
		return budget;
	}


	public String getDate() {
		return date;
	}


	public String getRenoType() {
		return renoType;
	}


	public int getRooms() {
		return rooms;
	}


	public int getToilet() {
		return toilet;
	}


	public field(String type, int size, String name, int number, String email, double budget, String date,
			String renoType, int rooms, int toilet) {
		super();
		this.type = type;
		this.size = size;
		this.name = name;
		this.number = number;
		this.email = email;
		this.budget = budget;
		this.date = date;
		this.renoType = renoType;
		this.rooms = rooms;
		this.toilet = toilet;
	}
}
