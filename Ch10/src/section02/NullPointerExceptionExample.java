package section02;

public class NullPointerExceptionExample {
	public static void main(String args[]) {
		String data = null; //참조값이 null일경우 객체 사용했을 때 예외발생
		System.out.println(data.toString());
	}
}
