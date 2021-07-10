class Animal{
	public void Sound() {
		System.out.println("匡澜家府");
	}
}
class Dog extends Animal{
	public void Sound() {
		System.out.println("港~港~");
	}
}
class Cat extends Animal{
	public void Sound() {
		System.out.println("具克~!");
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
