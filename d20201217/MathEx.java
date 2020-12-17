package d20201217;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println("원주율 : "+ Math.PI);
		System.out.println("4의 제곱근 : "+ Math.sqrt(4));
		
		System.out.println("파이에 대한 육십분법 : "+ Math.toDegrees(Math.PI));
		
		//프로그래밍 언어에서는 라디언을 더 많이 씀
		System.out.println(Math.toRadians(45));
		
		double rad = Math.toRadians(45);
				
		System.out.println("싸인 45 : "+ Math.sin(rad));
		System.out.println("코싸인 45 : "+ Math.cos(rad));
		System.out.println("탄젠트 45 : "+ Math.tan(rad));
		
		//로그, 승
		System.out.println("로그 : "+ Math.log(90));
		System.out.println("승 : "+ Math.pow(2,4));
		
		
		
	}
}
