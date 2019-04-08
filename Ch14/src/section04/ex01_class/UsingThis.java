package section04.ex01_class;

public class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			MyFunctionInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n"); //바깥객체의 참조를 얻기 위해 클래스명.this참조

				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
