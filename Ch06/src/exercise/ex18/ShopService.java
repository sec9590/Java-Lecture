package exercise.ex18;

public class ShopService {
	
	private static ShopService ShopService = new ShopService();

	private ShopService() {}

	static ShopService getInstance() {
		return ShopService;
	}
}
