package d20201214;

// StringBuffer ,	StringBuilder
// 	  1.0		,		1.5
// 	  안정		,	불안전 (thread 사용시)
//	본 데이터 보호	,	그냥 함


public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.append("AA");
		System.out.println(sb);
		
		sb.insert(1, 4);
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		String str = "PaulBassett";
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
	}
}
