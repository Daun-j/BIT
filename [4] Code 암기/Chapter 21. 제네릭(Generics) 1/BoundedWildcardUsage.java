package _0609;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class Plastic {}

class Toy extends Plastic {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class Car extends Toy {}

class Robot extends Toy {}

//class Toy extends Plastic{}

class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);

		// box.set(new Toy()); // X
	}

	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);

		// Toy myToy = box.get(); // X
	}
}

public class BoundedWildcardUsage {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

	}

	}
/**
	1)outBox method
	����: Toy �ڽ�: Car,Robot
	if ? = Car , Car(�ڽ�) extends Toy(�θ�)

	public static void outBox(Box<Car> boxCar) {
		Toy t = boxCar.get(); => �θ� = �ڽ� : ���� O,
		System.out.println(t);
  
  		// boxCar.set(new Toy()); => �ڽ�.set(�θ�);
  
  		=> class Box<Car>�� set �Լ� :
  		=> public void set(Car o = new Toy()){ �ڽ� = �θ�; } : �Ұ��� X
  	}
  
class Box<Car>{
	private Car ob;
	
	public void set(Car o) {ob = o;} => Car o = new Toy(); �Ұ��� X, �ڽ� = �θ�
	public Car get() {return ob;}
	}
  
  
  
  
  	2) inBox method 
  	���� : Plastic �ڽ� : Toy
  	if ? = Plastic , Plastic(�θ�) super Toy(�ڽ�)
  
  	public static void inBox(Box<Plastic> boxPlastic, Toy n) {
  		boxPlastic.set(n); => �θ�.set(�ڽ�);
  
  		=> class Box<Plastic> �� set�Լ� :
  		=> public void set(Plastic o = n) { �θ� = �ڽ�; } : ���� O , n�� Ÿ�� Toy
  
  		// Toy myToy = boxPlastic.get(); => �Ұ��� X, �ڽ� = �θ�, boxPlastic.get()�� ����Ÿ�� : Plastic
  	}
  		 
class Box<Plastic>{
	private Plastic ob;
	
	public void set(Plastic o) {ob = o;} => Plastic o = n; ���� O , �θ� = �ڽ�
	public Plastic get() {return ob;}
}

*/