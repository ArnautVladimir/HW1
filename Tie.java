package HomeWork2;

public class Tie extends Clothes implements ManClothing {

	@Override
	public void dressMen() {
		System.out.println("Может носить мужчина");		
	}

	public Tie(Size size, int price, String color) {
		super(size, price, color);
	}
	
	
	
	

}
