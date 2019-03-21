package section07.child_method_polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
	}

}
