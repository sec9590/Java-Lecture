package section08.ex02_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//첫번째 방법
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //변수주고 포문으로 넘기기!
		for(int i=0; i<countTokens; i++){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//두번째 방법
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
