class A{
	public A() {
		System.out.println("부모클래스");
	}
}
class B extends A{
	public B() {
		System.out.println("하위클래스");
	}
}
public class TypeTest {

	public static void main(String[] args) {
		A a=new B();

	}

}

