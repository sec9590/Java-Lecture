package openchallenge;

public class Question06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10000;
		int a = 0;
		int b = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				String mul = String.valueOf(i * j);
				String mulleft = mul.substring(0, 3);
				String mulright = reverse(mul.substring(3));
				if (mulleft.equals(mulright)) {
					if (max < Integer.parseInt(mul)) {
						max = Integer.parseInt(mul);
						a = i;
						b = j;
					}
				}
			}
		}

		System.out.println("대칭수 중 가장 큰 수 > " + a + " * " + b + " = " + max + " (" + b + " * " + a + " = " + max + ")");

	}

	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
