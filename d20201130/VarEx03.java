package d20201130;

// 3. 문자형 : char
// char는 ' ' 안에 한글자만 가능

public class VarEx03 {
	public static void main(String[] args) {
		// 콘솔에 JAVA 라는 글자를 출력
		char ch1 = 'J';
		char ch2 = 'A';
		char ch3 = 'V';
		char ch4 = 'A';
		
		System.out.println(ch1+ch2+ch3+ch4);		// ASCII 값 더한 숫자로 나옴
																					// println(" " + 변수); 로 해야 문자로 출력함을 인식
																					// 					이 + 는 덧셈이 아닌 연결 연산자이다.
		System.out.println(""+ch1+ch2+ch3+ch4);	// 문자로 JAVA 정상 출력됨
		
		String str = "JAVA";
		System.out.println("str : " + str);
		
		//자바는 unicode도 지원 - 변수명 한글 사용 가능 (단, 권장 하진 않음)
		String 한글 = "한글 잘 되나?";
		System.out.println("한글 : "+한글);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		char ch5 = 'A';			// 문자형
		char ch6 = 65;			// ASCII 코드 값
		char ch7 = '\u0063';	// unicode 코드 값
		char ch8 = 99;			// ASCII 코드 값
		
		// ctrl + alt + 아래방향키 :  선택된 행 복사&붙여넣기
		System.out.println("ch5 : "+ch5);
		System.out.println("ch6 : "+ch6);
		System.out.println("ch7 : "+ch7);
		System.out.println("ch8 : "+ch8);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// 특별한 의미를 갖는 문자 기능 수행 : \ (escape 문자)
		System.out.println("오늘은 \t월요일입니다. \n내일은 화요일입니다.");	
		// \t: 탭, \n: 줄넘기기, \b: backspace, \\: \
		
		
		
	}
}
