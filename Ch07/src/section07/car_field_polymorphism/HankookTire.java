package section07.car_field_polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotaion) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotaion - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 *** ");
			return false;
		}
	}
}
