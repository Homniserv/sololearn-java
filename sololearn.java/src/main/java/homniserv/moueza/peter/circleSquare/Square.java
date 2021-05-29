package homniserv.moueza.peter.circleSquare;

public class Square extends Shape {

	public Square(int x) {
		width = x;
	}

	// @Override
	void area() {
		System.out.println(width * width);
	}

}
