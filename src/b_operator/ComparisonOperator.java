package b_operator;

public class ComparisonOperator {
	public static void main(String[] args) {
	/*
	 * <<비교 연산자>>
	 * < : 작다
	 * > : 크다
	 * <= : 작거나 같다
	 * >= : 크거나 같다
	 * == : 같다
	 * != : 같지 않다.
	 */
	boolean b= 10 < 20;
	System.out.println(b);
	
	b = 10 <= 20 - 15;
	System.out.println(b);
	
	//float 과 double을 비교할때는 형변환에 주의해야한다.
	b= 10.0f == 10.0;
	System.out.println(b);
	
	b = 10.1f == 10.1; //실수는 값을 정확하게 표현하지 못한다(값에 근접하긴함), 그래서 논리가 거짓으로 나옴
	System.out.println(b);//float은 7자리 까지 정확히 표현 ,double 15자리까지 정확히 표현
	
	System.out.printf("%22.20f%n", 10.1f);
	System.out.printf("%22.20f%n", 10.1);
	
	//double을 float으로 형변환해야 정확하게 비교 가능
	b = 10.1f == (float)10.1;
	System.out.println(b);
	
	//문자열 비교
	b = "abc" == "abc";
	System.out.println(b); //같은 스트링 리터럴은 같은 주소를 갖는다. 
	
	b = "abc" == new String("abc"); // 참조형타입(String)은 저장된 메모리 주소를 비교하기 때문에
	System.out.println(b);			//String은 등가비교 연산자로 내용을 비교할 수 없다.
	
	//String의 내용을 비교하기 위해서는 equals() 메소드를 사용한다.
	b = "abc".equals(new String("abc"));
	System.out.println(b);
	b =!"abc".equals("ABC");
	System.out.println(b);
	
	//다음의 문장들을 코드로 작성해주세요.
	//1보다 2가 큰가?
	b = 1<2;
	 System.out.println(b);
	// 0은 100보다 작거나 같은가?
	b = 0 <=100;
	System.out.println(b);
	//3.14f와 3.14는 다른가?
	b =3.14f != 3.14;
	System.out.println(b);
	//"남자"와 "여자"는 다른가?
	b= !"남자".equals("여자");
	System.out.println(b);
	}
	
}
