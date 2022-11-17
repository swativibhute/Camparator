
public class Student {

	int id;
	String name;
	String Address;
	int zip;
	public Student(int id, String name, String address, int zip) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + ", zip=" + zip + "]";
	}
	
	
}
