package d20201215;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map - HashMap

public class CollectionEx04 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		System.out.println("hm : "+ hm);
		
		//		key, value	=> 순서x, key로 찾아간다.
		hm.put("실","바늘");
		hm.put("햄버거","콜라");
		hm.put("햄버거","밀크쉐이크");
		hm.put("라멘",9000);
		hm.put("구내식당",5500);
		
		System.out.println("hm : "+ hm);
		
		System.out.println(hm.get("라멘"));	//key로 get할수 있다. get(key);
		
		System.out.println("-------------------------------------");
		
		if(hm.containsKey("실")) {
			System.out.println("키 실 존재함");
		}
		
		if(hm.containsValue("밀크쉐이크")) {
			System.out.println("벨류 밀크쉐이크 존재함");
		}
		
		System.out.println("-------------------------------------");
		
		//현재 key들의 첫번째 문자만 콘솔에 모두 출력해보세요 - Reference Documentation 참조

		Set s = hm.keySet();	//set 리턴
		System.out.println("s : "+ s);
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {					//set에서 다음값이 존재할때 까지
			String str = (String) it.next();
			System.out.print(str.substring(0,1)+" ");	//첫글짜만
		}
		

	}
}
