package section10.ex01_calculator;

public class Calculator {
	
	//객체마다 다른 변수 인스턴스 변수
	String color;
	
	//공통된 변수
	static double pi = 3.14159;
	
	//정적메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	//인스턴스 메소드
	void setcolor(String color) {
		this.color = color;
	}
	
}
