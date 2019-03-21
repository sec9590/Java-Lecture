package section07.child_instanceof;

public class InstanceOfExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) { //Child로 변환가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		//ClassCastException이 발생 가능성 있음
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		// method2(parentB);
	}

}
