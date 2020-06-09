package test0609;

/*
//1. Box
class Box {
	private Object obj;

	// Getter method
	public Object getObj() {
		return obj;
	}
	// Setter method
	public void setObj(Object obj) {
		this.obj = obj;
	}

}
*/

//2. 1의 Object를 T로 다 바꿔 ~
class Box<T> {
	private T ob;
	
	// Getter method
	public T get() {
		return ob;
	}
	// Setter method
	public void set(T ob) {
		this.ob = ob;
	}

}

class BoxFactory {

	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.set(o);
		return box;
	}
}

public class GenericMethodTest {

	public static void main(String[] args) {

		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(sBox.get());
		System.out.println(dBox.get());

	}

}


