package homework;

import java.util.Scanner;

//	1. 캡슐화란?  (책 보고 공부해서 정의적인 표현으로 정리하세요)
//			클래스에 담는 내용중 중요한 데이터나 기능을 외부에서 접근하지 못하게하기 위해 사용

//2. 캡슐화
//class HandPhone{
//    private String productName;
//    private String productType;
//    private int price;
//    private int phoneNumber;
//}

//3. Method Overloading과 Overriding의 의미와 특징?
//overloading은 기본 생성자에 다른 데이터를 덮어씌우면서 생성하는것
//overriding은 상속되어있는 자식 클래스에서 부모 클래스의 메소드를 재정의 하는 것

//4. this, this(), super, super() ?
//		this : 객체 내부의 필드를 가리키는 참조변수
//		this() : 객체 기본 생성자
//		super : 상속 받아온 부모를 가리키는 참조변수
//		super(): 상속 받은 부모 기본 생성자

//5. 상속이란? (교재를 통해 정의적인 표현을 찾아쓰세요)
//		상위 클래스의 모든 멤버를 하위 클래스가 물려 받는 것.
//		상속 키워드 : extends

//6. method를 호출하는 방법 3가지를 쓰고 예들어 설명하시오.
//	call by name		void, 함수 이름으로 기능 호출
//	call by value		자료형 변수(int, boolean, etc)를 넣어줌, 복사해서 사용-변경 X
//	call by reference		자료의 주소를 넣어줌, 그대로 변경됨(x.value = y.value)

//7. 다음의 코드를 보고 Animal 클래스의 생성자를
//작성해보고  setter와 getter도 추가하시오
//public class HW201209 {
//	public static void main(String[] args){
//        Animal a1 = new Animal("원숭이",26);
//        a1.show();
//    }
//	
//	
//}
//
//class Animal{
//    private String name;
//    private int age;
//    
//    Animal(String name, int age){
//    	this.name = name;
//    	this.age = age;
//    }
//    
//    public void show(){
//        System.out.println(this.name + "님은 " + this.age + "살 입니다");
//    }
//    
//    public void setter(String name, int age) {
//    	this.name = name;
//    	this.age = age;
//    }
//    
//    public String get_name() {
//    	return this.name;
//    }
//    
//    public int get_age() {
//    	return this.age;
//    }
//
//}

//8. 로또번호 추출하기 [도전과제]
//	    public class hw8{
//	        public static void main(String[] args){
//	            // 3 일때 3개 출력 , 5일때는 5개 출력
//	            Lotto lt = new Lotto(3);
//	            lt.select();
//	            lt.print();
//	        }   
//	    }
//
//	    출력 결과 ----------------------------------
//
//	    [  2 ,   5,   3 ,   11 ,   35,    39 ]
//	    [  7 ,   15,   23 ,   31 ,   40,    41 ]
//	    [  5 ,   11,   12 ,   36 ,   37,    44 ]

//public class HW201209{
//	public static void main(String[] args){
//	    // 3 일때 3개 출력 , 5일때는 5개 출력
//	    Lotto lt = new Lotto(3);
//	    lt.select();
//	    lt.print();
//	}  
//}
//
//class Lotto{
//	private int num;
//	int[][] lotto ;
//	
//	Lotto(int num){
//		this.num = num;
//		lotto = new int [num][6];
//	}
//	
//	public void select() {
//		
//		for(int i=0; i<num; i++) {							//행
//			for(int j=0; j<6; j++) {								//렬													
//					lotto[i][j] = (int)(Math.random()*44+1);				//1~45 랜덤 뽑기					
//					if(j>0) {
//						for(int k=1; k<=j; k++) {										//이전에 뽑은 랜덤 숫자랑 비교하기 위함
//							if(lotto[i][j] == lotto[i][j-k]) {
//								j--;																		//비교해서 같으면 다시 뽑게함
//							}
//						}
//					}
//				}//for렬
//		}//for 행
//	}
//	
//	public void print() {
//		for(int i=0; i<num; i++) {							//행
//			System.out.print("[");
//			for(int j=0; j<6; j++) {			//렬													
//					System.out.print("\t"+lotto[i][j]);										
//			}
//			System.out.print("\t]\n");
//		}
//	}
//}
		
	
//9. 사용자로부터 금액을 입금받아서 잔돈을
//바꿔주는 프로그램을 작성하고자한다.
//
//
//public class hw10{
//    public static void main(String[] args){
//    System.out.print("금액을 입력하세요:");
//        Scanner sc = new Scanner(System.in);
//    int money = sc.nextInt();
//
//    Exchange ec = new Exchange();
//        ec.chage(money);
//    }
//}
//
//
//실행
//------------------------
//금액을 입력하세요: 2970
//500원 : 5
//100원 : 4
//50원 : 1
//10원 : 2

//public class HW201209{
//	public static void main(String[] args){
//		System.out.print("금액을 입력하세요:");
//		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//
//		Exchange ec = new Exchange();
//		ec.charge(money);
//		ec.print_m();
//  }
//}
//
//class Exchange{
//	private int m_500;
//	private int m_100;
//	private int m_50;
//	private int m_10;
//	
//	Exchange(){
//		m_500=0;
//		m_100=0;
//		m_50=0;
//		m_10=0;
//	}
//	
//	public void charge(int m) {
//		m_500 += m/500;
//		m_100 += (m%500)/100;
//		m_50 += (m%100)/50;
//		m_10 += (m%50)/10;
//	}
//	
//	public void print_m() {
//		System.out.println("500원 : "+m_500);
//		System.out.println("100원 : "+m_100);
//		System.out.println("50원 : "+m_50);
//		System.out.println("10원 : "+m_10);
//	}
//}

//10.  CellPhone, SmartPhone 2개의 클래스를 작성하고
//두 클래스의 공통요소를 모아 Phone이라는 상위클래스를 작성하시오.
class Phone{
	String number;		//번호
	int loc_x, loc_y;		//위치
	String service;			//요금제
	
	Phone(){
		this.number = "010-4345-8977";
		this.loc_x = 0;
		this.loc_y = 0;
		this.service = "5G";
	}
	
	public void sendCall() {
		System.out.println("전화걺");
	}
	public void receiveCall() {
		System.out.println("전화받음");
	}
	
	public void sendMessage() {
		System.out.println("문자 보냄");
	}
	public void receiveMessage() {
		System.out.println("문자 받음");
	}
}

class CellPhone extends Phone{
	
	
	CellPhone(){
		super();
		super.number = "011-4345-8977";
		super.service = "LTE";
	}
}

class SmartPhone extends Phone{
	
	
	SmartPhone(){
		super();
	}
	
	public void using_app() {
		System.out.println("youtube 실행");
	}
	
}























