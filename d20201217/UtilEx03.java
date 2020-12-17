package d20201217;

import java.util.StringTokenizer;

/*
 * ex) "10:02" 이런 시간 정보가 있을 때
 * 시와 분을 나눠서 사용하고 싶다면?
 * 
 * 1):찾기
 * 2)나눠지는 문자열 정보 담아 사용 => 토큰
 * 
 * -문자열을 조건에 따라 나눌 수 있게 해주는 클래스가 존재
 */




public class UtilEx03 {
	public static void main(String[] args) {
		String str = "11:22:33:44:55:66";
		
//		char[] ch = str.toCharArray();
//		
//		for(char c : ch) {
//			System.out.print(c+" ");
//		}
		
		
		StringTokenizer stk = new StringTokenizer(str, ":");
		
		//System.out.println(stk.countTokens());
		
		while(stk.hasMoreTokens()) {
			System.out.print(stk.nextToken()+ " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		String phoneNumber = "Tel 010-1111-2222";
		
		StringTokenizer stk2 = new StringTokenizer(phoneNumber);
		
		//구분자를 지정하지 않으면 default는 공백을 구분자로 사용
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		System.out.println("---------------------------");
		
		//구분자는 둘 이상도 가능
		StringTokenizer stk3 = new StringTokenizer(phoneNumber," -");	
		while(stk3.hasMoreTokens()) {
			System.out.println(stk3.nextToken());
		}
		
		System.out.println("---------------------------");
		String code = "num += 1";
		
		//구분자를 토큰으로 간주할지 말지를 결정 - t/f
		StringTokenizer stk4 = new StringTokenizer(code,"+=",true);
		while(stk4.hasMoreTokens()) {
			System.out.println(stk4.nextToken());
		}
		
		
		
		
		
	}
}
