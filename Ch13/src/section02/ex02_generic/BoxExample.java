package section02.ex02_generic;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<String>();
		box1.setT("hellow");
		String str = box1.getT(); 
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
		
	}

}
