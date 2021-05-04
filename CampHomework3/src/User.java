
public class User {
	private int id;
	private String name;
	private String lastName;
	
	public User() {
		
	}

	public User(int id, String name, String lastName) {	
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

}
