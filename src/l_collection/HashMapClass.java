package l_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
	/*
	 * 
	 * put()	: 지정된 키와 값을 저장
	 * get()	: 지정된 키의 값을 반환(없으면 null)
	 * remove()	: 지정된 키로 저장된 값을 제거
	 * keySet() : 저장된 모든 키를 Set으로 반환
	 * 
	 * */
		
	HashMap<String, String> map = new HashMap<>();
	
	map.put("title", "제목입니다....");
	map.put("content", "내용입니다....");
	map.put("user", "김승섭");
	map.put("date", "2020-02-20 14:48");
	
	System.out.println(map.get("title"));
	System.out.println(map.get("content"));
	System.out.println(map.get("user"));
	System.out.println(map.get("date"));
	
	map.put("user", "홍길동");
	System.out.println(map.get("user"));
	
	map.remove("user");
	System.out.println(map.get("user"));
	
	for(String key : map.keySet()){
		String value = map.get(key);
		System.out.println(key + " : " + value);
	}
		
		//두 사람의 정보를 저장하고 있는 ArrayList<HashMap<String, String>>을 만들어주세요.
		//홍길동, 남자, 30세, 프로그래머
		//이순신, 남자, 40세, 장군
	ArrayList<HashMap<String, String>> list1 = new ArrayList<>();
	
	HashMap<String, String> p1 = new HashMap<>();
	HashMap<String, String> p2 = new HashMap<>();
	
	p1.put("이름","홍길동");
	p1.put("성별","남자");
	p1.put("나이","30세");
	p1.put("직업","프로그래머");
	
	p2.put("이름","이순신");
	p2.put("성별","남자");
	p2.put("나이","40세");
	p2.put("직업","장군");
	
	list1.add(p1);
	list1.add(p2);
	
	
	print(p1);
	
	//선생님
		for(HashMap<String, String> m : list1){
			print(m);
		}
		
	}
	
	//HashMap을 파라미터로 받아 저장된 모든 값을 출력하는 메소드를 만들어주세요.
	
	static void print (HashMap<String, String> p){
		
		for(String key : p.keySet()){
			String value = p.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
	
	
}
