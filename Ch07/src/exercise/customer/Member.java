package exercise.customer;

public class Member extends Customer {
	String number;
	int point;

	public Member(String name, String tel, String address, String number, int point) {
		super(name, tel, address);
		this.number = number;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [name = " + name + ", tel = " + tel + ", address = " + address + ", number = " + number + ", point = " + point +"p]";
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}

}
