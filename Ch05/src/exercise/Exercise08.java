package exercise;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		double var = 0.0;
		int count = 0;
		int max = 0;
		int min = array[0][0];

		// sum과 avg구하기
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;

		// max와 min구하기
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j])
					max = array[i][j];
				if (min > array[i][j])
					min = array[i][j];
			}
		}

		// 분산 구하기
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				var += Math.pow((array[i][j] - avg), 2);
			}
		}
		var /= count;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("var : " + var);
	}

}
