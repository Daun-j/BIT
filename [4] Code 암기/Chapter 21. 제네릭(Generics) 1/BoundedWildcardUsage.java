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
	엄마: Toy 자식: Car,Robot
	if ? = Car , Car(자식) extends Toy(부모)

	public static void outBox(Box<Car> boxCar) {
		Toy t = boxCar.get(); => 부모 = 자식 : 가능 O,
		System.out.println(t);
  
  		// boxCar.set(new Toy()); => 자식.set(부모);
  
  		=> class Box<Car>의 set 함수 :
  		=> public void set(Car o = new Toy()){ 자식 = 부모; } : 불가능 X
  	}
  
class Box<Car>{
	private Car ob;
	
	public void set(Car o) {ob = o;} => Car o = new Toy(); 불가능 X, 자식 = 부모
	public Car get() {return ob;}
	}
  
  
  
  
  	2) inBox method 
  	엄마 : Plastic 자식 : Toy
  	if ? = Plastic , Plastic(부모) super Toy(자식)
  
  	public static void inBox(Box<Plastic> boxPlastic, Toy n) {
  		boxPlastic.set(n); => 부모.set(자식);
  
  		=> class Box<Plastic> 의 set함수 :
  		=> public void set(Plastic o = n) { 부모 = 자식; } : 가능 O , n의 타입 Toy
  
  		// Toy myToy = boxPlastic.get(); => 불가능 X, 자식 = 부모, boxPlastic.get()의 리턴타입 : Plastic
  	}
  		 
class Box<Plastic>{
	private Plastic ob;
	
	public void set(Plastic o) {ob = o;} => Plastic o = n; 가능 O , 부모 = 자식
	public Plastic get() {return ob;}
}

*/