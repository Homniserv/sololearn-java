package homniserv.selenium.moueza.peter.sololearn;

public class Circle extends Shape {

	public Circle(int y) {
		width = y;
	}

    //@Override
	void area() {
		System.out.println(Math.PI * width * width);
	}

}
