package homniserv.selenium.moueza.peter.sololearn;

abstract class Shape {
	int width;

	abstract void area();
}

//your code goes here

public class Program {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int x = 5;// sc.nextInt();
		int y = 2;// sc.nextInt();

		Square a = new Square(x);
		Circle b = new Circle(y);
		a.area();
		b.area();
	}
}
