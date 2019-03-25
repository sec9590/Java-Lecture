package section02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {		
		
		//매개값이 할당되지않아 오류
	/*	String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);*/
		
		
		//조건문을통해 실행방법 알려주기
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
	}

}
