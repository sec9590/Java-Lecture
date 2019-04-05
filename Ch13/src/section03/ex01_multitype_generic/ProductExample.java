package section03.ex01_multitype_generic;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("스마트 Car");
		Car car = product2.getKind();
		String CarModel = product2.getModel();
	}

}
