package section03.ex02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해 String값 저장하는 Hashmap 생성
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 저장
		hashmap.put(new Key(1), "홍길동");
		
		//식별키 new Key로 홍길동 읽어옴
		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}

}
