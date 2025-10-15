package mycafe;

public class Food extends MenuItem {
	
	public Food (String name, int price, String text) {
		super(name,price,text);
	}

	@Override
	public String getDetails() {
		return getName() +" "+ getPrice() + "円" +" "+ getText();
	}

}
