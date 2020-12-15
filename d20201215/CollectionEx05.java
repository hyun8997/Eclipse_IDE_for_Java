package d20201215;

import java.util.ArrayList;

public class CollectionEx05 {	
	public static void main(String[] args) {
		String[] str = {"커피", "콩", "빨간 약병", "파란 약병", "두부", "딸기", "포도"};
		
		//str[] 을 ArrayList에 담아서 하나씩 꺼내서 사용하고 싶음
		//ArrayList는 object 배열이므로 어떤 자료형이든 다 수용 가능
		//이 ArrayList에 String만 쓰고 싶음.
		//JCF 뒤에 <E>를 붙임 => generic
		
		ArrayList al = new ArrayList();
		
		for(int i=0; i<str.length; i++) {
			// str[] => al[]
			al.add(str[i]);
		}
		
		al.add("키위");
		
		int num = 100;
		al.add(num);
		
		System.out.println("al : "+ al);
		
		System.out.println("--------------------");
		
		//ArrayList 안의 데이터 첫글자만 출력
		for(int i=0; i<al.size(); i++) {
			String str1 = (String)al.get(i);
			System.out.print(str1.subSequence(0, 1)+ " ");
		}
		
		
		
		
	}

}
