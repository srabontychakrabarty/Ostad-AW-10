package root;

public class Application {

	public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        Square square = new Square(4.0);
        square.draw();
        System.out.println("Area: " + square.calculateArea());

        Triangle triangle = new Triangle(3.0, 4.0);
        triangle.draw();
        System.out.println("Area: " + triangle.calculateArea());
    }
}
