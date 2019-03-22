package section05.field_polymorphism;

public class HankookTIre implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}
