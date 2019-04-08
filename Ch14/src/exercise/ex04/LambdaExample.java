package exercise.ex04;

import java.util.function.IntSupplier;

public class LambdaExample {

	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			// x *= 10; 매개변수는 익명함수에서 final특성을 가져서 재정의 할수 없다.
			int result = x+y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	};
	
	public static void main(String[] args) {
		System.out.println(method(3,5));		
	}

}
