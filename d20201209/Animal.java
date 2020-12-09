package d20201209;

public class Animal {
	private String food;
	private String name;
	
	Animal(String name, String food){
		this.food=food;
		this.name=name;
	}
	
	public void eat() {
		System.out.println(this.name+"는(은) "+this.food+"를(을) 먹는다.");
	}
	
	public void walk(String str) {
		 System.out.println(str+" 걷는다.");
	 }
	
	public void breathe() {
		System.out.println("호흡한다.");
	}
	
}
