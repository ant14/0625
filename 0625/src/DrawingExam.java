class Shape{
	public void draw() {
		System.out.println("�����׸���");
	}
}
class Circle extends Shape {
	private String type="��";
	public void draw() {
		System.out.println(type+"�׸���");
	}
	public void painting() {
		System.out.println("�� ĥ�ϱ�");
	}
}
public class DrawingExam {

	public static void main(String[] args) {
		Circle e = new Circle();
		e.draw();
		//e.painting();
		Shape s = e;
		e.draw();
		//s.painting();

	}

}
