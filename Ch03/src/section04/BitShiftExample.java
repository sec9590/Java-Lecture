package section04;

public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		System.out.println();
		
		System.out.println("-8 : " + toBinaryString(-8));
		System.out.print(">> 3 : ");
		System.out.println(toBinaryString(-8 >> 3));
		System.out.print(">>> 3 : ");
		System.out.println(toBinaryString(-8 >>> 3));
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
