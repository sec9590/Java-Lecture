package section07.ex01_inheritance_generic;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);

}
