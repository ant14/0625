class Car{
	String name ="��";
	String print() {
		return "[���� "+name+"�̴�.]";
	}
}
class Bus extends Car{
	String name ="����";
	String print() {
		return "[���� "+name+"�̴�.]";
	}
}
class Truck extends Car{
	String name ="Ʈ��";
	String print() {
		return "[���� "+name+"�̴�.]";
	}
}
public class CastingExam {

	public static void main(String[] args) {
	Car mycar, yourcar;
	Bus mybus, yourbus;
	Truck mytruck, yourtruck;
	mycar=new Car();
	mybus=new Bus();
	mytruck=new Truck();
	System.out.println("["+mycar.print()+"]");
	System.out.println("["+mybus.print()+"]");
	System.out.println("["+mytruck.print()+"]");
	yourcar=mybus;
	yourbus=(Bus) yourcar;
	System.out.println("["+yourbus.print()+"]");
	yourcar=mytruck;
	yourtruck =(Truck) yourcar;
	System.out.println("["+yourtruck.print()+"]");
	

	}

}
