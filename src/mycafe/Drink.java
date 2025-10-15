package mycafe;

public class Drink extends MenuItem {
	private boolean isHot;
	
	public Drink(String name, int price, boolean isHot, String text) {
		super(name, price, text);
		this.isHot = isHot;	
	}

	@Override
	public String getDetails() {
		return getName() + "(" + (isHot ? "Hot" : "ice") + ") - " + getPrice() + "円";
		}
	
}
