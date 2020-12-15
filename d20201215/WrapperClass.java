package d20201215;

import java.util.ArrayList;

//primitive type(int, float,...) 들을 객체로 만들어 주는 클래스

public class WrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		//int, float ==> Integerm Float, ...
		Integer num = new Integer(3);
		System.out.println("num : "+ num);
		
		showData(7);	//primitive type
		
//		Integer num2 = new Integer(7);
//		showData(num2);
		
		showData(new Integer(7));	//reference type
		
		System.out.println("------------------------------");
		
		//WeapperClass 기본 기능
		//1. Boxing 기능
		Integer ival = new Integer(10);	//무조건 값을 채워줘야 함, 참조값이지만 주소말고 값이 나온다.
		Double dval = new Double(3.14);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("------------------------------");
		
		//2. Unboxing 기능
		ival = new Integer(ival.intValue()+10);	//언박싱하고 다시 박싱함
		dval = new Double(dval.doubleValue()+10.11);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("------------------------------");
		
		//WrapperClass 기본 기능 사용시 코드가 길어지고 불편
		//=> AutoBoxing, AutoUnBoxing
		
		//1. AutoBoxing
		Integer ivalue = 100;
		Double dvalue = 3.14;
		
		String sValue = "Java";	//원래 String이 WrapperClass였던 것이다.
		
		System.out.println(ivalue);
		System.out.println(dvalue);		
		System.out.println(sValue);		
		
		System.out.println("------------------------------");
		
		//2. AutoUnBoxing
		int iresult = ivalue + 10;
		double dresult = dvalue +10.11;
		
		System.out.println(iresult);
		System.out.println(dresult);	
		
		System.out.println("------------------------------");
		
		ArrayList list = new ArrayList();
		
		list.add("딸기");
		list.add("포도");
		
		int a = 300;
		
		Integer it = new Integer(a);		//Boxing
		list.add(it);
		
		Integer it2 = a;					//AutoBoxing
		list.add(it2);
		
		Object abj = it;					//Casting(형변환) Integer to Object
		list.add(it);		
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		//WrapperClass 형변환 : parse~
		String str = "01011112222";
		
		//int value = (int)str;	//큰거 작은거 관계없이 primitive라서 불가능
		
		int value = Integer.parseInt(str);	//String => Integer => int
		System.out.println("value : "+ value);	//value : 1011112222
		
		double d = Double.parseDouble(str);
		System.out.println("d : "+ d);		//d : 1.011112222E9
		
		//list의 첫번째 문자들만 출력해보세요
		//String : parse(x) - API 참조
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
