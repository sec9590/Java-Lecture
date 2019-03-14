package sec03;

public class FromIntToDouble { 

	public static void main(String[] args) {
		//정수타입을 실수타입으로 변환할 때 정밀도 손실을 피함
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; //손실없이 변환 가능 double이 기본 실수
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(num1 + ", " + num2);
		System.out.println(result);

	}

}
