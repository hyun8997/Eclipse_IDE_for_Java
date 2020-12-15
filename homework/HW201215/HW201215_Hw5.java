package HW201215;

import java.util.ArrayList;

public class HW201215_Hw5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		int[] num = new int[100];
		int temp=0;
		
		for(int i=0; i<100; i++) {
			num[i]=i+1;
		}
		
		for(int i=0; i<1000; i++) {
			int r1 = (int)(Math.random()*100);
			int r2 = (int)(Math.random()*100);
			
			temp = num[r1];
			num[r1] = num[r2];
			num[r2] = temp;
		}
		
		for(int i=0; i<num.length; i++) {
			al.add(num[i]);
		}

		System.out.println("al : "+ al);
		
	}
}
