package section04;

public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // a100은 숫자로 변환x
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { //동일하게 처리
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");		
		} catch (Exception e) {
			System.out.println("알 수 없는 예외발생");
		} finally {
			System.out.println("다시실행하세요.");
		}
	}

}
