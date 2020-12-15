package d20201215;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] a = new int [10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*20);
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		Arrays.sort(a);		//sort 기능
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		
	}
}
