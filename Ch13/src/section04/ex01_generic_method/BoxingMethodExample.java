package section04.ex01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.getT();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.getT();
	}

}
