package d20201214;

public class StringEx01 {
	public static void main(String[] args) {
		String str1 = new String("Java");		//new라는 키워드를 써서 만들었기 때문에 무조건 다른 객체이다.
		String str2 = new String("Java");
		
		System.out.println("str1 : "+str1);		//원래 참조 변수는 주소값이 나와야 하지만 내용이 나온다.
		
		//아주 예외적으로 String 클래스만  new를 생략하여 
		//primitive type 처럼 쓰도록 허용
		
		String str3 = "Java";					//new 생략 가능
		System.out.println("str3 : "+str3);
		
		System.out.println("----------------------------");
		
		System.out.println("str1.toString(): "+ str1.toString());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());				//hashCode는 같은데 다른 객체이다.
		//hashCode() : 해당 객체의 고유한 값을 return 하는 method
		//			 : 일반적으로 객체 내부 주소를 정수값(16진수)로 변환해서 return
		
		System.out.println("str1 : "+
						str1.getClass().getName() + '@' +		//이름
						Integer.toHexString(str1.hashCode())	//주소
						);
		
		System.out.println("----------------------------");
		
		if(str1 == str2) {						//String 비교는 함수로 하지 이렇게하면 당연히 다른 객체라서 false이다.
			System.out.println("동일 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("----------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("동일 내용");
		}else {
			System.out.println("다른 내용");
		}
		
		System.out.println("----------------------------");
		
		/*
		 * 							Object				String
		 * 
		 * 	toString()				참조값				자기 자신 문자열
		 * 	equals()				주소동일여부			내용 비교
		 * 
		 * 
		 */
		System.out.println("----------------------------");
		
		String str4 = "Java";		//new를 안썼고, 내용도 같으니 동일한 메모리상에 만들어버린다.
		String str5 = "Java";
		
		// 내용이 같으면 같은 메모리를 쓰자, 성능 개선을 위해, 메모리 최적화
		if(str4 == str5) {	//비교연산자는 객체 동일 여부 확인
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		
		
	}
}
