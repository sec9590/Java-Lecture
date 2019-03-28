package section08.ex02_stringtokenizer;

import java.util.StringTokenizer;

public class getEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getenv("Path");
		StringTokenizer st = new StringTokenizer(path, ";");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
