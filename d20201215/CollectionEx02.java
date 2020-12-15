package d20201215;

import java.util.ArrayList;

// Vector : 동적 성장형 Object 배열
// ArrayList : 비동기적 성장형 Object 배열

public class CollectionEx02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		System.out.println("al : "+al);
		
		al.add("오늘은");	//object를 넣게 되어있음
		al.add("화요일");
		al.add("딸기");
		al.add("바나나");
		al.add("오렌지");
		al.add("체리");
		al.add("키위");
		al.add("포도");
		al.add("귤");
		al.add("토마토");
		al.add(10);
		
		System.out.println("al : "+ al);
		
		System.out.println(al.get(2));
		
		// 바나나는 몇 번째 위치에 있을까요?
//		if(al.contains("바나나")) {
//			for(int i=0; i<al.size(); i++) {
//				String str = (String)al.get(i);	//int가 있어서 오류가 남	java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//				if(str.contentEquals("바나나")) {
//					System.out.println(i);
//				}
//			}
//		}
		
		System.out.println(al.indexOf("바나나"));	//위의 알고리즘처럼 바로 구해짐
		
		
		
		
		
		
		
		
		
	}
}
