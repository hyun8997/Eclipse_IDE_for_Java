package d20201216;

// 1. 사람 관련 정보 클래스인데 갑자기 동물 관련 클래스가 생성이 된다면? (논리적 오류, 문법적으로는 통과됨)
//   : 논리적으로 맞지 않는 부분에 대해서 방지할 필요가 있으므로 generic을 통해 방지할 장치를 마련
//	 : extends - 확장 (자바 상속 개념과는 약간 다름)

// 3. 사람 관련 특성을 생성
interface Personable{};

// 5. 원하는 클래스에 상속
class Stu implements Personable{};

class Emp implements Personable{};

// 4. generic 객체에 상속
class Per<T extends Personable>{
	T info;
	
	public Per(T info) {
		this.info=info;
	}
}

class Ani{};


public class GenericEx05 {
	public static void main(String[] args) {
		Per<Stu> ps = new Per<Stu>(new Stu());
		System.out.println(ps);
		
		Per<Emp> pe = new Per<Emp>(new Emp());
		System.out.println(pe);
		
		/*
		Per<Ani> pa = new Per<Ani>(new Ani());	//Ani 객체가 T에 존재하지 않으므로 에러남
		System.out.println(pa);
		*/
		
		//==> 2. Per 대상으로 Stu, Emp (사람 관련 객체만 사용하고 싶음)
		
		
		
	}
}
