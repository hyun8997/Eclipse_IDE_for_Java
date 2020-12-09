package d20201209;

/*
 * 고양이와 강아지의 공통속성을 추출해서 동물이라는 클래스를 생성
 * - 이 동물의 속성을 고양이와 강아지 객체에게 상속하기로 함.
 * 
 * - 출력
 * (고양이이름) 는 (물로기)를 먹는다. 살금살금 걷는다. 호흡한다.
 * (강아지이름) 는 (사료)를 먹는다. 터벅터벅 걷는다. 호흡한다.
 * 
 * - 변수 : name, food
 * - method명: walk, eat, breathe
 * 
 * - 데이터 전달 : 생성자
 * 
 */
public class ExtendsMain3 {
	public static void main(String[] args) {
		Cat c = new Cat("고양이","물고기");
		Dog d = new Dog("개","사료");
		
		c.eat();
		c.walk();
		c.breathe();
		
		System.out.println("---------------------------------");
		
		d.eat();
		d.walk();
		d.breathe();
		
		
		
		
		
	}
}
