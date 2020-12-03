package d20201203;

public class ArrayEx04 {
	public static void main(String[] args) {
		// char 배열 10칸 변수 ch
		// 이 변수에 JavaWorld 글자 대입 후 출력
		
		char[] ch = new char[10];		// 'J' 문자형 
		
		String CH = "JavaWorld";	// 문자열
		
		System.out.println(CH);		// string 출력
		
		ch = CH.toCharArray();			// string char 배열로 변환
		
		for(int i=0; i<ch.length; i++) {		// 배열 출력
			System.out.print(ch[i]);
		}
		System.out.println("\n" + ch.length);			//string에 맞게 길이 9개로 바뀜
	}
}
