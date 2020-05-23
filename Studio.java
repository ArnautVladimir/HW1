package HomeWork2;

import java.util.Arrays;

public class Studio {

	private Clothes[] clothes;

	public Studio(Clothes[] clothes) {
		this.clothes = clothes;
	}

	public Clothes[] getClothes() {
		return clothes;
	}

	public void setClothes(Clothes[] clothes) {
		this.clothes = clothes;
	}

	@Override
	public String toString() {
		return "Studio [clothes=" + Arrays.toString(clothes) + "]";
	}
	
	public void maleChoice() {
		for (Clothes clothes2 : clothes) {
			if (clothes2 instanceof ManClothing) {
			System.out.println(clothes2);}
		}
	}
	
	public void femaleChoice() {
		for (Clothes clothes2 : clothes) {
			if (clothes2 instanceof WomenClothing) {
			System.out.println(clothes2);}
		}
	}
}
