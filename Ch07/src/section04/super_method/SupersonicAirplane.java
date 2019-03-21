package section04.super_method;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			// Airplane의 메소드 호출
			super.fly();
		}
	}
}
