import java.util.HashMap;
import java.util.Map;


public class AddressBook {
	private Map<String, String> book;
	
	public AddressBook(){
		this.book = new HashMap<String, String>();
	}
	public Map<String, String> getBook() {
		return book;
	}
	public void setBook(Map<String, String> book) {
		this.book = book;
	}
	
	public void addBuddy(BuddyInfo info){
		book.put(info.getName(), info.getAddress());
	}
	public void removeBuddy(BuddyInfo info){
		book.remove(info.getName());
	}
	public static void main(String[] args) {
		System.out.print("Hello World! ");
		BuddyInfo info = new BuddyInfo();
		info.setAddress("Home");
		info.setName("Cat");
		AddressBook address = new AddressBook();
		address.addBuddy(info);
		System.out.print(address.getBook().get(info.getName()));
		address.removeBuddy(info);
	}
}