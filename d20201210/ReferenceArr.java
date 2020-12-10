package d20201210;

public class ReferenceArr {
	public static void main(String[] args) {
		토끼 r = new 토끼();
		고래 w = new 고래();
		고래  w2 = new 고래();
		
		/*
		 * primitive 배열
		 * 
		 * int[] m =new int[3];
		 * 
		 */
		
		//reference type
//		포유류[] moList = new 포유류[3];
//		
//		moList[0] = r;
//		moList[1] = w;
//		moList[2] = w2;
		
		포유류[] moList = {w,r,w2};
		
		
		//System.out.println("moList : "+ moList);
		
		for(int i=0; i<moList.length;i++){
			moList[i].먹기();
			moList[i].자기();
		}
		
		System.out.println("-------------------------------------");
		
		//참조변수의 원객체 여부를 확인하고 싶을 때 : instanceof (t/f)
		System.out.println(r instanceof 토끼);
		
	}
}
