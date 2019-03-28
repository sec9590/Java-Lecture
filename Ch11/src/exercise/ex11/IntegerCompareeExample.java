package exercise.ex11;

public class IntegerCompareeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
				
		System.out.println("언박싱한 == 결과 : " + (obj3.intValue() == obj4.intValue()));
		
	}

}
