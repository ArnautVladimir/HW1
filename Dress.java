package HomeWork2;

public class Dress extends Clothes implements WomenClothing {

	public Dress(Size size, int price, String color) {
		super(size, price, color);
		
	}

	@Override
	public void dressWomen() {
		System.out.println("Может носить женщина");	
	}
	
	

}
