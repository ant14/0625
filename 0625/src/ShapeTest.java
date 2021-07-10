class Shape1{
	public void draw() {
		System.out.println("Shape1 draw");
	}
}
class Rectangle extends Shape1{
	public void draw() {
		System.out.println("Rectangle draw");
	}
}
class Triangle extends Shape1{
	public void draw() {
		System.out.println("Triangle draw");
	}
}
class Circle1 extends Shape1{
	public void draw() {
		System.out.println("Circle draw");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape1 s1,s2,s3,s4;
		s1=new Shape1();
		s2=new Rectangle();
		s3=new Triangle();
		s4=new Circle1();
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();

	}

}
