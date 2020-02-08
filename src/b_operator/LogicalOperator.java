package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * <<논리 연산자>>
		 *  &&(AND)	: 피연산자 둘다 true이면 true를 얻는다.
		 *  ||(OR)	: 피연산자 중 하나라도 true 이면 true를 얻는다.
		 *  !(NOT)	: 피연산자가 true이면 false를 , false이면 ture를 결과로 얻는다.
		 *  피연산자로 boolean만 허용한다.
		 */
		
		int a = 6;
		
		// a가 0보다 크다.
		boolean b1 = 0 <a;
		
		//a가 10보다 작거나 같다.
		boolean b2 = a <=10;
		
		//a가 0보다 크고 10보다 작거나 같다.
		boolean b = b1 && b2;
		b = 0 < a && a <= 10;
		
		//a가 2의 배수이거나 3의 배수인가? [나눴을때 나머지가 0일 경우 2의배수 3의배수가 되잖아~]
		b = a % 2 == 0 || a % 3 ==0;
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수이고 10이하인가?	 //우선순위는 AND > OR	
		b= (a%2 ==0 || a%3 ==0) && a <= 10;
		System.out.println(b);
		
		char c = 'l'; //소문자 l 임
		//c는 숫자인가?
		b = 0 <= c && c <= 9;
		System.out.println(b);
		
		//c는 영문 숫자인가?
		b = 'a' <= c && c<='z';
		System.out.println(b);
		
		//논리 연산자는 효율적인 계산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;
		b = true && false;
		b = false && true; //노란줄 가까이 대면 DAED CODE라고 나오는데 실행되지 않는 코드다
		b = false && false;
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		int d = 10;
		b = d< 10 && 0< d++; // 논리연산 일 경우 왼쪽의 피연산자 결과를 정해놨기 때문에 오른쪽 값을 수행하지 않는다.
								// d++ 수행 X 
		System.out.println(d);
		
		b = !b;
		b = !(10 < 20); // 연산에 !(NOT) 을 붙일 경우 괄호를 해주어야함.
		int x = 1, y = 2;
		b= x+3*y > y-2 || x<3 && y>=5; // 산술연산 > 비교연산 > 논리연산 순으로 우선순위가 높다.
		
		//다음의 문장들을 코드로 장석해주세요.
		
		//x가 0보다 크거나 같고 10보다 작다.
		  boolean r;
		 r = x >= 0 && x <10;
		 System.out.println(r);
		//x가 2의 배수이거나 3의 배수이고 20 이하이다.
		r = (x % 2 == 0 || x % 3 == 0) && x<= 20;
		System.out.println(r);
		
	}
	

}
