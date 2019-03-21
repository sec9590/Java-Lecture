package section07.child_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자식 객체가 부모객체로 변함
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*parent.field2 = "data2";
		parent.method3();*/
		
		//다시 자식클래스 이용하려면 강제 변환.
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
