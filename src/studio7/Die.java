package studio7;

public class Die {
	
	private int sides; //instance variable
	
	
	public Die(int initSides) { //constructor
		sides = initSides;
	}
	
	public int rollDie() { //method to roll die
		return (int) (Math.floor(Math.random() * sides) + 1);
	}

	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.rollDie());
	}

}
