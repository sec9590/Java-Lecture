package openchallenge.ex04;

import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		
		for(int i=0; i<=1000; i++) {
			if(i<10)
				num[i]++;
			else if(i>=10 && i<100) {
				num[i%10]++;
				num[i/10]++;
			} else if(i>=100 && i<1000) {
				num[i%10]++;
				num[(i%100)/10]++;
				num[i/100]++;
			} else {
				num[i%10]++;			
				num[(i%100)/10]++;
				num[(i%1000)/100]++;
				num[i/1000]++;				
			}
				
		}
		
		System.out.println("각 숫자의 개수 " + Arrays.toString(num));
		
	}

}
