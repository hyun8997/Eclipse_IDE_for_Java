package d20201202;

public class ForEx04 {
	public static void main(String[] args) {
		// 1. 구구단 모두 출력
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {		//단
				System.out.format( "%3d  *  %3d  =  %4d \t", j, i, (i*j) );	
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		// 2. 구구단 짝수단만 출력
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j+=2) {		//단
				System.out.format( "%3d  *  %3d  =  %4d \t", j, i, (i*j) );	
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		// 3. 2단은 2*2까지, 4단은 4*4까지, 6단은 6*6까지, 8단은 8*8까지 출력		
		for(int i=2; i<=9; i+=2) {		//단
			for(int j=1; j<=i; j++) {
				//System.out.println(i+" * "+j+" = "+i*j);
				System.out.format( "%3d  *  %3d  =  %4d \t", i, j, (i*j) );
			}
			System.out.println();
		}
//		for(int i=2; i<=9; i++) {		//단
//			for(int j=1; j<=9; j++) {
//				if(i%2==0 && i>=j) {
//					System.out.format( "%3d  *  %3d  =  %4d \t", i, j, (i*j) );
//				}
//			}
//			System.out.println();
//		}
		
	}
}
