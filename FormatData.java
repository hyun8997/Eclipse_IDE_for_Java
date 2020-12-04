package homework;

// HW201204의 4번에 필요한 class임

public class FormatData {
	void print(int i) {
		System.out.println(i);
	}
	
	void print(int[] num) {
		System.out.print("[");
		for(int i=0; i<num.length; i++) {
			System.out.print(" "+num[i]);
		}
		System.out.println(" ]");
	}
	
	void print(float f) {
		//System.out.format("%.1f",f);
		System.out.println(f);
	}
	
}
