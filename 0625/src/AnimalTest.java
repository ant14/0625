class Animal{
	public void Sound() {
		System.out.println("�����Ҹ�");
	}
}
class Dog extends Animal{
	public void Sound() {
		System.out.println("��~��~");
	}
}
class Cat extends Animal{
	public void Sound() {
		System.out.println("�߿�~!");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Animal dog,cat;
		dog=new Dog();
		cat=new Cat();
		dog.Sound();
		cat.Sound();

	}

}
