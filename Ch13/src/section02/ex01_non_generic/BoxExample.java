package section02.ex01_non_generic;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String) box.getObject();
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
		
	}

}
