package section07.ex03_car;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}	
	
	Car(String model){
		this.model = model;
		//this(model, null, 0)
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		//this(model,color,0)
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	
//	public String toString(int number) {
//		return "Car" + number + " [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
//	}
	
	
	
	
	
}
