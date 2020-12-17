package HW201216;

import java.util.Random;

public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			prt();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void prt() throws ArrayIndexOutOfBoundsException{
		int num[] = new int[3];
        Random rnd  = new Random();
        int index = rnd.nextInt(10);
        num[index] = rnd.nextInt(500);
        System.out.println("index : " + index
                  + "num[ " + index + "] : "
                  +num[index]);
		
		
	}
}
