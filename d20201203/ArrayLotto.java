package d20201203;

public class ArrayLotto {
	public static void main(String[] args) {
		// 로또번호 45개 중 6개를 랜덤하게 추출
		int[] rnd = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		int r;
		// r = (int) ( Math.random() * 45);	//Math.random() :  double 값  0.0~1.0
		
		//System.out.println(r);
		
		//중복을 제거하면서 최종 6개 추출
		int i=0;
		int r_a[] = new int[6];
		
//		while(i<6) {
//			r =  (int) ( Math.random() * 44+1);				//6번 중복체크하면서 뽑기
//			for(int j=0; j<6; j++) {
//				if(r_a[j]==r) {
//					i--; 
//					break;
//				}
//			}
//			r_a[i]=r;
//			i++;
//		}
		
		for(int o=0; o<1000; o++) {
			int first = (int)(Math.random()*45);
			int second = (int)(Math.random()*45);
			
			int temp=0;
			
			temp = rnd[first];
			rnd[first] = rnd[second];		//1000번 셔플로 랜덤 6 구현
			rnd[second] = temp;

		}
		
		
		//for(int k=0;k<6;k++)
		//	System.out.println(r_a[k]);
		for(int k=0;k<6;k++)
			System.out.println(rnd[k]);
		
	}
}
