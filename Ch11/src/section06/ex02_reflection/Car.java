package section06.ex02_reflection;

public class Car {
	public String model;

	public Car(String model) {
		this.model = model;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	
	
}
