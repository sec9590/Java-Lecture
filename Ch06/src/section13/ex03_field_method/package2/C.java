package section13.ex03_field_method.package2;

import section13.ex03_field_method.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		/*a.field2 = 1; -> default/private 접근 불가
		a.field3 = 1;*/ 
		
		a.method1();
		/*a.method2(); -> default/private 접근 불가
		a.method3();*/
	}
}
