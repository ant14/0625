class Person{
	String name;
	String id;
	public Person(String name) {
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String dep;
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Person person =  new Student("Mad");
		Student student =(Student)person;
		student.name="kim";
		student.dep="Com";
		System.out.println(student.name);
		System.out.println(student.dep);

	}

}
