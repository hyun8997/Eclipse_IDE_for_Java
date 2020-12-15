package d20201215;

import java.util.Vector;

public class CollectionEx01 {
	public static void main(String[] args) {
		//Vector
		
		Vector v = new Vector();
		
		System.out.println("v : "+v);
		System.out.println("v.capacity() : "+v.capacity());	// 기본 배열 10칸
		System.out.println("v.size() : "+ v.size());
		
		String s1 = "Java";
		Object obj = s1;
		
		v.add(obj);
		
		v.add("오늘은");
		v.add("화요일");
		v.add("날씨가");
		v.add("한파");
		v.add("와우");
		v.add("춥다");
		v.add("딸기");
		v.add("바나나");
		v.add("오렌지");
		v.add("체리");
		
		System.out.println("v : "+v);
		System.out.println("v.capacity() : "+v.capacity());	// 기본 배열 10칸+10칸씩 증가함
		System.out.println("v.size() : "+ v.size());	//: 11
		
		//일반 배열은 참조값이 들어있어서 System.out.println("v : "+v); 처럼 출력하면 주소값을 준다.
		//벡터는 add로 수를 늘리면 일반 배열과 달리 오류없이 계속 늘릴 수 있다.\
		
		//Vector 값 추출
		
		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i));
			
			//한 단어씩 추출해서 첫번째 문자만 출력해보세요
			//System.out.println(((String) v.get(i)).substring(0,1));
			Object obj1 = v.get(i);
			
			String str = (String)obj1;
			
			System.out.println(str.substring(0,1));
			
			//딸기의 위치
			//System.out.println(str.indexOf("딸기"));

		}
		System.out.println("-------------------------------");
		
		//딸기의 위치 찾기
		if(v.contains("딸기")) {
			//System.out.println("딸기 존재");
			for(int i=0; i<v.size(); i++) {
				String s =(String)v.get(i);
				if(s.equals("딸기")) {
					System.out.println(i);
				}
			}
			
		}else {
			System.out.println("딸기 존재X");
		}
		
		System.out.println("-------------------------------");
		
		Object[] o = {"커피", "콩", "빨간 약병", "파란 약병", "두부", "딸기", "포도"};
		
		//딸기가 몇번째 위치에 있나요
		
		System.out.println("o : "+o);
		for(int i=0; i<o.length; i++) {
			String str = (String)o[i];
			if(str.equals("딸기")) {
				System.out.println(i+1);	//사용자는 배열의 5가 아닌 6번째일 것.
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
