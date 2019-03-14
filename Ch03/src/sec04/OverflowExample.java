package sec04;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		System.out.println();
		System.out.println("오버플로우 해결 -> long타입");
		
		long lx = 1000000l;
		long ly = 1000000l;
		long lz = lx * ly;
		System.out.println(lz);
	}

}
