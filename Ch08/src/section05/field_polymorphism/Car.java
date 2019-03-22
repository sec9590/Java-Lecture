package section05.field_polymorphism;

public class Car {

	Tire[] tires = { new HankookTIre(), new HankookTIre(), new HankookTIre(), new HankookTIre() };
	
	/*Tire frontLeftTire = new HankookTIre();
	Tire frontRightTire = new HankookTIre();
	Tire backLeftTire = new HankookTIre();
	Tire backRightTire = new HankookTIre();*/
	
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
			//this.roll()'
		}
	}
	
/*	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}*/
}
