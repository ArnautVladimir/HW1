package HomeWork2;

public class Tshirt extends Clothes implements ManClothing, WomenClothing {

	@Override
	public void dressWomen() {
		System.out.println("����� ������ �������");
	}

	@Override
	public void dressMen() {
		System.out.println("����� ������ �������");
	}

	public Tshirt(Size size, int price, String color) {
		super(size, price, color);
		
	}

	
	
	
	

}
