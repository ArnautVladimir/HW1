package HomeWork2;

public class Main {

	public static void main(String[] args) {
		Clothes[] clothes = new Clothes[4];
		
		 
		
		clothes[0] = new Tshirt(Size.S, 300, "green");
		clothes[1] = new Pants(Size.L, 600, "black");
		clothes[2] = new Dress(Size.XXS, 200, "red");
		clothes[3] = new Tie(Size.M, 100, "silver");
		Studio studio = new Studio(clothes);
		
		
		
		
		studio.maleChoice();
		studio.femaleChoice();
		
		Clothes[] clothes1 = new Clothes[4];
		
		clothes1[0] = new Tshirt(Size.M, 300, "sdfsdf");
		clothes1[1] = new Pants(Size.XS, 600, "black");
		clothes1[2] = new Dress(Size.S, 200, "red");
		clothes1[3] = new Tie(Size.XXS, 100, "silver");
		Studio studio1 = new Studio(clothes1);
		
		studio1.maleChoice();
		studio1.femaleChoice();
	}

}
