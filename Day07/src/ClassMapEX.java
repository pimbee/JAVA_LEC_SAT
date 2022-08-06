import java.util.*;

public class ClassMapEX {
	public static void main(String[] args) {
		
		//재너락이 없으면 Map은 Object타입을 기본으로 데이터를 넣고 빼기 때문에
		//데이터 타입의 제한이 없었다
		//따라서 과거에는 캐스팅을 사용해야 했고.
		//각 객체를 확인 하려면, 객체를 하나씩 비교해야했고
		//Instance of 매서드로 하나씩 비교
		/*
		Map map = new HashMap();
		map.put("name", "홍길동");//맵에 값을 담는 작업 (key, value)
		
		((String)map.get("name")).length();
		"홍길동".length();
		*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name","홍길동");
		map.put("age", "45");
		map.put("addr", "서울 금천구");
		map.get("name").length();
		
		//Map을 값으로 가지는 List Collection을 선언해라.
		List<Map> list = new ArrayList<Map>();
		
		//Map<String, String> (키도String 값도String 맵)데이터 타입을
		//값으로 가지는 List Collection 선언해라(객체까지 생성)
		List<Map <String, String>> list2 = new ArrayList<Map <String, String>>();
		
		Map<String, String> data = new HashMap<String, String>();
		data.put("name","홍길동");
		data.put("age", "45");
		data.put("addr", "서울 금천구");
		list2.add(data); //0번추가
		
		data = new HashMap<String, String>();
		data.put("name","하악하악");
		data.put("age", "45");
		data.put("addr", "서울 관악구");
		list2.add(data); //1번추가
		
		System.out.println(data);
		System.out.println(list2);
		
	}
}
