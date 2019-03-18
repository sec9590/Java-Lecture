package section06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); //시작인덱스->0
		//String[] newStrArray = Arrays.copyOf(oldStrArray, 5) 복사하면서 크기를 5로 늘리기
		
		System.out.println(Arrays.toString(newStrArray));
	}
}
