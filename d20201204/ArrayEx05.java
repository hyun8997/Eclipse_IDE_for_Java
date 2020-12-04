package d20201204;

public class ArrayEx05 {
	public static void main(String[] args) {
		//2차 배열
		
		int [][] m = new int  [3][2];													//m[3][2] 선언
		
		System.out.println("m : "+ m);										//m출력: 스택 영역의 3칸 첫 주소 반환
		System.out.println("m.length : "+ m.length);				//m.length: 스택영역의 3칸, 길이 3
		System.out.println("m[1] : " + m[1]);								//m[1] 출력: 힙 영역의 m[1][0] 첫 주소 반환
		System.out.println("m[1].length : " + m[1].length);	//m[0].length: 힙 영역 m[0] 자리가면 2칸 있을테니 2
		System.out.println("m[2][0] : " + m[2][0]);					//m[2][0] 출력: 힙 영역 m[2][0] 안의 데이터 반환
		
		System.out.println("-------------------------------------------------");
		
		int [][] arr = {{2,7}, {5,10}, {12,7}};
		System.out.println(arr[0][0]+ " ,  " + arr[0][1]);
		System.out.println(arr[1][0]+ " ,  " + arr[1][1]);
		System.out.println(arr[2][0]+ " ,  " + arr[2][1]);
		
		System.out.println("-------------------------------------------------");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print("arr["+i+"]["+j+"] : "+arr[i][j] + "   ");
			}
			System.out.println();
		}
		
		
	}
}
