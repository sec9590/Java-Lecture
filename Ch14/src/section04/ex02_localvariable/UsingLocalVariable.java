package section04.ex02_localvariable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		//arg와 localVar은 final특성 가짐
		//arg = 31;
		//localVar = 41;
		MyFunctionInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
