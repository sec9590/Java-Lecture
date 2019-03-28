package section13.ex01_mathclass;

public class MathRandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈 : " + num1);
		
		int num2 = (int) (Math.random()*45) + 1;
		System.out.println("로또 번호 : " + num2);
	}

}
