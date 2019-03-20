package section13.ex03_field_method.package1;

public class A { 
	//필드
	public int field1;
	int field2; //default
	private int field3;
	
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//같은 클래스에서 접근 가능
}
