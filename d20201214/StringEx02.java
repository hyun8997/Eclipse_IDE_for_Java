package d20201214;

public class StringEx02 {
	public static void main(String[] args) {
		String s = new String("Java Oracle");
		
		char temp = s.charAt(6);	//배열 순서 인덱스임, 공백도 인식
		
		System.out.println(temp);
		
		System.out.println("----------------------------------");
		
		String str1 = "Monday";
		
		//문자열 연결
		System.out.println(s+str1);
		System.out.println(s.concat(str1));
		
		String s1 ="오늘은";
		String s2 ="월요일";
		String s3 ="최강";
		String s4 ="한파";
		// 출력 : 오늘은월요일최강한파
		
		//System.out.println(s1.concat(s2.concat(s3.concat(s4))));
		
		// 메소드 체이닝(chaining)
		System.out.println(s1.concat(s2).concat(s3).concat(s4));
		
		System.out.println("----------------------------------");
		//내용 비교
		
		//포함 여부
		boolean result = s.contains("Java");
		System.out.println(result);
		
		//equals
		System.out.println(s.equals("JAVA ORACLE"));
		
		//equalsIgnoreCase : 대소문자 무시
		System.out.println(s.equalsIgnoreCase("JAVA ORACLE"));
		
		System.out.println("----------------------------------");
		//위치 반환
		int position = s.indexOf('r');
		System.out.println("r은 "+s+"의 "+position+" 번째 위치 글자 입니다.");
		
		//문자열 길이를 반환
		System.out.println(s.length());
		
		//2번째 글자부터 6번째 글자까지 추출
		System.out.println(s.substring(2,6));	//2이상 6미만
		
		//문자열을 char[] 반환
		char[] ch2 = s.toCharArray();
		System.out.println(ch2[2]);
		
		for(int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		//향상된 for문, 개선된 for문
		for(char c : ch2) {
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		//String 배열 가능
		String[] data = {"사과", "배", "포도", "딸기"};
		
		//for(자료형 변수명 : 원데이터)
		for(String str : data) {
			System.out.print(str+ " ");
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		
		// 아이디만 출력해보세요
		String email = "sidenoasfafafsasfaK@naver.com";
		int pos = email.indexOf('@');
		System.out.println(email.substring(0,pos));
		
		
		//문자열 비교 : compareTo()	- 배열간 차이를 사전적 방식으로 계산(비교)
		String str5 ="1";
		String str6 ="2";
		System.out.println(str5.compareTo(str6));	//-1로 나옴
		
		
	}
}
