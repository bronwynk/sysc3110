
public class BuddyInfo {
	private String name;
	private String address;
	public static void main(String[] args) {
		BuddyInfo info = new BuddyInfo();
		info.setName("Cat");
		System.out.print("Hello World! " + info.getName());

	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
