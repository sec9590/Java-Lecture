package section05.field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("------------------------");
		
		/*myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();*/
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
