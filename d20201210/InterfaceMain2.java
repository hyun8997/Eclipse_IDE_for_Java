package d20201210;

public class InterfaceMain2 {
	public static void main(String[] args) {
		InterfaceClass ifc =  new InterfaceClass();
		ifc.calculate();
		System.out.println(ifc.getStr());
		System.out.println(ifc.NUM);
		
		System.out.println("------------------------");
		//계산만 하고 싶다면?
		InterfaceEx01 ie1 = new InterfaceClass();	//상속 후 부모를 통해서 선언하면 쓰고싶은놈만 쓸 수 있다.
		ie1.calculate();
		
		System.out.println("------------------------");
		InterfaceEx02 ie2 = new InterfaceClass();
		System.out.println(ie2.getStr());
		
		
	}
}
