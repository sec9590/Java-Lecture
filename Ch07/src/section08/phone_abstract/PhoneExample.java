package section08.phone_abstract;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone phone = new Phone(); 추상클래스 객체 선언 불가. 
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
