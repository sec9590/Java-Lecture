package section04.ex01_generic_method;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
}
