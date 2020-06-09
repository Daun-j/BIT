package _0603;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}

class BoxFactory {

	static <T> Box<T> makeBox(T o) {
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
