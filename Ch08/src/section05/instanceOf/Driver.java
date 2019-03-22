package section05.instanceOf;

import section05.casting.Bus;
import section05.casting.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} 
		vehicle.run();
	}
}
