package h_useful;

public class MathClass {

	public static void main(String[] args) {
	
		/*
		 *  round() 	: 반올림
		 *    ceil		: 올림
		 *    floor()	: 내림
		 *    abs()		: 절대값
		 *  random()	: duble 난수 발생(0.0 ~ 1.0미만)
		 */
		
		double d1 = 0.5;
		double d2 = -0.5;
		
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
		
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));		
		
		System.out.println(Math.random());
		System.out.println(Math.random());
	//한줄 복사 : ctrl + alt + 방향키 (위/아래)
	//한줄 이동 : ALT + 방향키(위/아래)
	
		for(int i=0; i<28; i++){
			int random =getRandom(5, 10);
			System.out.println(random + " ");
		}
		
	}

	static int getRandom(int from, int to){
		return (int)(Math.random()* (Math.abs(to- from)+1)) + Math.min(from, to); //math.min 은 파라미터 중 더 작은값을 리턴해주는 메소드
		
	}
	
}
