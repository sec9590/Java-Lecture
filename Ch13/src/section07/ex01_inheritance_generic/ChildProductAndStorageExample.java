package section07.ex01_inheritance_generic;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("SAMSUNG");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
