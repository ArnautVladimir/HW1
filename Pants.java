package HomeWork2;

public class Pants extends Clothes implements ManClothing, WomenClothing {

	@Override
	public void dressWomen() {
		System.out.println("Может носить женщина");
	}

	@Override
	public void dressMen() {
		System.out.println("Может носить мужчина");
	}

	public Pants(Size size, int price, String color) {
		super(size, price, color);
		
	}
	
	

}
