package d20201216;

public class GenericEx01 {
	public static void main(String[] args) {
		TypeClass<Integer> ti = new TypeClass<Integer>();
		
		ti.setValue(100);
		System.out.println(ti.getValue());
		
		
		System.out.println("-----------------------------");
		
		TypeClass<String> ts = new TypeClass<String>();
		
		ts.setValue("Generic");
		System.out.println(ts.getValue());
		
		
		System.out.println("-----------------------------");
		
		TypeClass<Float> tf = new TypeClass<Float>();
		
		tf.setValue(3.14f);
		System.out.println(tf.getValue());
		
		
		System.out.println("-----------------------------");
		
		TypeClass<Double> td = new TypeClass<Double>();
		
		td.setValue(3.14);
		System.out.println(td.getValue());
		
		
		System.out.println("-----------------------------");
		
		
		
		
		
		
		
		
	}
}
