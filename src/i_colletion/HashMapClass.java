package i_colletion;

import java.util.ArrayList;
import java.util.HashMap;

 

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 *  put() 	: 지정된 키와 값을 저장
		 *  get()	: 지정된 키의 값을 반환 (없으면 null)
		 *  remove(): 지정된 키로 저장된 값을 제거
		 *  keySet(): 지정된 모든 키를 Set으로 반환
		 *  
		 */
		HashMap<String, String> map = new HashMap<>(); // ctrl + shift + o
		
		map.put("title","제목입니다."); // HashMap put(key, value)
		map.put("content","내용입니다.");
		map.put("user","김승섭.");
		map.put("date","2020/02/20/ 14:48"); //순서가 저장되진않음
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동"); // 기존에 같은 키가 있을경우 값을 덮어씌움
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user"));
		
		
		
		for(String key : map.keySet()){ //향상된 for문
			String value = map.get(key);
			System.out.println(key+ " | " + value);
		}
		
		//두 사람의정보를 저장하고 있는 ArrayList<HashMap<String, String>> 을 만들어 주세요.
		//홍길동, 남자, 30,세 ,프로그래머
		//이순신, 남자, 40세 , 장군
		
		 ArrayList<HashMap<String,String>> a = new ArrayList<>();
		
		 HashMap<String, String> b = new HashMap<>(); //해쉬맵 객체 생성
		 b.put("이름", "홍길동");
		 b.put("성별", "남자");
		 b.put("나이", "30세");
		 b.put("직업", "프로그래머");
		 
		 a.add(b); // HashMap 객체를 생성한후 객체안에 값을 지정해준다음 ArrayList 안으로 들어간다.
		 			// ArrayList의 0번방으로저장
		 b = new HashMap<>(); 
		
		b.put("이름", "이순신");
		b.put("성별", "남자");
		b.put("나이", "40세");
		b.put("직업", "장군");
	
		a.add(b); // ArrayList의 0번방으로저장
		
		
		
		
		//HashMap을 파라미터로 받아 저장된 모든 값을 출력하는 메소드를 만들어 주세요.

		for(HashMap<String, String> i : a){
			hash(i);
		}
		
	}
	 static void hash(HashMap<String, String> b){
		for(String key : b.keySet()){
			String value = b.get(key);
			System.out.println(key + " |" + value);
		}
		
	}
	

}
