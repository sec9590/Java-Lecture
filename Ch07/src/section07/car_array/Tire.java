package section07.car_array;

public class Tire {
	public int maxRotaion;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotaion) {
		this.maxRotaion = maxRotaion;
		this.location = location;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotaion) {
			System.out.println(location + " Tire 수명 : " + (maxRotaion - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 *** ");
			return false;
		}
	}

}
