package d20201215;

import java.util.HashSet;
import java.util.Iterator;

// Set = HashSet

public class CollectionEx03 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		System.out.println("hs : "+ hs);
		
		hs.add("집밥");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("고기");
		hs.add("소고기");
		hs.add("라면");
		
		System.out.println("hs : "+ hs);
		
		while(true) {
			hs.add((int)(Math.random()*50+1));
			if(hs.size()>10	) {
				break;
			}
		}
		System.out.println("hs : "+ hs);
		
		System.out.println("---------------------------------");
		
		//order by로 배열에 값을 넣지 않으므로 index를 고정할 수 없어서 getter가 존재하지 않음
		//Iterator 객체 사용
		
		//반복자
		Iterator it = hs.iterator();
		
		// hasNext(): 다음값이 존재하면 true, 존재하지 않으면 false
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		
		
	}
}
