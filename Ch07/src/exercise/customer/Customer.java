package exercise.customer;

public class Customer {
	public String name;
	public String tel;
	public String address;
	
		
	public Customer(String name, String tel, String address) {	
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	

}
