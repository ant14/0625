class A{
	public A() {
		System.out.println("�θ�Ŭ����");
	}
}
class B extends A{
	public B() {
		System.out.println("����Ŭ����");
	}
}
public class TypeTest {

	public static void main(String[] args) {
		A a=new B();

	}

}

