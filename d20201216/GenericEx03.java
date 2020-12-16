package d20201216;

/*
 * Generic Type
 * : 다양한 자료형을 하나의 클래스로 처리
 * : 형태 -  생성한 클래스 뒤에 <T> -> 'T'는 일반화 시킨 객체(변수)
 * => 구현 클래스에서 필요한 자료형을 대입하여 사용
 * 
 * 
 */

class Student{
	int grade;
	
	public Student(int grade) {
		this.grade = grade;
	}
}

class Employee{
	int rank;
	
	public Employee(int rank) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
	}
}

class Person{
	Object info;
	
	public Person(Object info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
}


public class GenericEx03 {
	public static void main(String[] args) {
		Person p1 = new Person(new Student(1));
		Person p2 = new Person(new Employee(3));
		
		//student, employee 정보 확인
		
		Student st = (Student)p1.info;	//casting
		System.out.println(st.grade);	//1출력됨
		
		Employee ep = (Employee)p2.info;
		System.out.println(ep.rank);
		
		/*
		Student st2 = (Student)p2.info;	//상관없는 오브잭트를 받아들임
		System.out.println(st2.grade);
		
		Exception in thread "main" java.lang.ClassCastException: d20201216.
		Employee cannot be cast to d20201216.Student
		at d20201216.GenericEx03.main(GenericEx03.java:53)
		
		컴파일 전에는 에러가 발견이 안됨 => 컴파일 후에 에러가 있다고 나옴
		
		=> 큰 문제가 될 가능성이 농후
		
		=> GenericEx04.java 에서 위 오류를 사전에 방지해보세요		// setter, getter를 사용하는건가?
		*/
		
		
	}
}
