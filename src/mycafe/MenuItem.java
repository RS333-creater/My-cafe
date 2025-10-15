package mycafe;

public abstract class MenuItem {
	private String name;
	private int price;
	private String text;
	
	public MenuItem(String name, int price ,String text) {
		this.name = name;
		this.price = price;
		this.text = text;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getText() {
		return text;
	}
	
	public abstract String getDetails(); 
}
