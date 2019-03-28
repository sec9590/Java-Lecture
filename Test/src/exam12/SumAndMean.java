package exam12;

public class SumAndMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {
				{95, 86, 88},
				{88, 92, 96, 85},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int count = 0;
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				sum += intArray[i][j];
				count++;
			}
		}
		
		double avg = (double) sum / count;
		
		System.out.println("배열의 합 : " + sum);
		System.out.println("배열의 평균 : " + avg);
	}

}
