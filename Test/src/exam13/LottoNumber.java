package exam13;

import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}
	
	static int[] getLottoNumber() {
		int array[] = new int[6];
		for(int i=0; i<6; i++) {
			array[i] = (int) (Math.random()*45)+1;
		}
		return array;
	}

}
