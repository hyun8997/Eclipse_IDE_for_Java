package d20201203;

public class ArrayEx03 {
	public static void main(String[] args) {
		// int 배열 3칸짜리 a, b, c
		
		// a, b 각 배열에 임의값을 대입
		// c 배열에는 a 배열의 값과 b 배열의 값을 더한 후 대입
		
		int[] a= {10,20,30};
		int[] b= {21,31,41};
		
		int[] c= new int [3];
		
		for(int i=0; i<3; i++) {
			c[i] = a[i] + b[i];
			System.out.println("a["+i+"] + b["+i+"] = "+c[i]);
		}
		
		// 배열을 각각 가져와서도 연산 가능

	}
}
