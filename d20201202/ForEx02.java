package d20201202;
// 반복문 중첩 - 다중 반복문

public class ForEx02 {
	public static void main(String[] args) {
		// 19단 출력
		int dan = 19;
		for(int i=1; i<=dan; i++) {
			for(int j=2; j<=dan; j++) {
				//System.out.print(j + " * " + i + " = " + (i*j) + "\t");			
				System.out.format( "%3d  *  %3d  =  %4d \t", j, i, (i*j) );	
			}//내부 for 문 end
			System.out.println("");
		}//외부 for 문 end
		
		
	}
}
