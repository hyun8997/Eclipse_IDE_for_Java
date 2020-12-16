package d20201216;

class Student2{
	int grade;
	
	public Student2(int grade) {
		this.grade = grade;
	}
}

class Employee2{
	int rank;
	
	public Employee2(int rank) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
	}
}

class Person2 <T>{
	T info;
	
	public Person2(T info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
}


public class GenericEx04 {
	public static void main(String[] args) {
		Student2 st2 = new Student2(1);
		Person2<Integer> p1 = new Person2<Integer>(st2.grade);
		System.out.println(p1.info);
		
		System.out.println("-----------------------");
		
		Person2<Employee2> p2 = new Person2<Employee2>(new Employee2(2));
		//Person2<Employee2> p3 = new Person2<Employee2>(new Student2(2));
		
		System.out.println(p2.info.rank);
		
		
		
	}
}
