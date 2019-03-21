package section05.final_method;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final메소드 이므로 오버라이딩 할 수 없음
/*	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
*/
}
