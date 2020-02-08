package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * << if문 >>
		 * - if 	: 조건식의 결과가 true이면 불럭안의 문장을 수행한다.
		 * else if 	: 다수의 조건이 필요할때 if 뒤에 추가한다.
		 * else 	: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 *
		 */

		int a = 10;
		if(a < 100 ){
			System.out.println("조건식의 연산결과 true 이면 수행된다.");
		}
		
		if(a <10 )
			System.out.println("조건식의 연산결과가 flase이면 수행되지 않는다.");
			int regNO=1 ; //주빈등록증 첫자리
			String gender = null; //성명
			
			if(regNO == 1){
				gender = "남자";
			}else if(regNO == 2 ){
				gender = "여자";
			}else if(regNO == 3){
				gender = "남자";
			}else if(regNO ==4 ){
				gender = "여자";
			}else{	//true인 조건식 이 하나도 없을때 수행한다.
				gender = "확인불가";
								}
			System.out.println("당신의 성별은"+ gender + "입니다");
			
			regNO = 1;
			gender = null;
			//수행할 내용이 동일한 경우 논리 연산자를 사용해 조건식을 결합할 수 있다.
			if(regNO == 1 || regNO ==3) //수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender = "남자";
			
					else if(regNO ==2 || regNO ==4 )
					gender = "여자";
			
							else
							gender = "확인불가";
			
			System.out.println("당신의 성별은" +gender + "입니다");
			
			//성적에 등급을 부여하는 프로그램
			int score = 88;
			String grade = null;
			
			if(90 <= score){
				grade = "A";
			}else if(80 <= score && score < 90){
				grade = "B";
			}else if(70 <= score){
				grade = "C";
			}else if(60<=score){
				grade = "D";
			}else if(50<=score){
				grade = "E";
			}else{
				grade ="F";
			}
			System.out.println("당신의 성적은"+grade + "입니다");
			
			
			score = 70;
			grade = null;
			if(90 <= score){
				grade = "A";
				if(97 <= score){
					grade += "+";
				}else if(score <= 93){
					grade += "-";
				}
			}
				
			else if(80<= score){
				grade = "B";
				if(87 <=score){
					grade+= "+";
				}else if(score <=83){
					grade+= "-";
				}
			}
			else if(70<= score){
				grade = "C";
				if(77 <=score){
					grade+= "+";
				}else if(score <=73){
					grade+= "-";
				}
			}else if(60<= score){
				grade = "D";
				if(67 <=score){
					grade+= "+";
				}else if(score <=63){
					grade+= "-";
				}
			}else{
				grade = "F";
			}
			
			
			System.out.println(grade);
			
			/*
			 *  <<switch 문 >>
			 *  - 조건식과 일치하는 case 문 이후의 문장을 수행한다.
			 *  - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
			 */
			regNO = 543;
			gender = null;
			switch(regNO){ //조건식에는 정수와 문자열만!
			case 1 : case 3 :
				gender = "남자";
				break; //break를 만나면 switch문을 빠져나간다.
			case 2 : case 4 : // 이렇게 묶을 수 있다!!
				gender = "여자";
				break;
			default : // if문의 else 역활을 한다.
				gender = "확인불가";
			}
			System.out.println("당신의 성별은"+ gender+ "입니다.");
			
			score = 100;
			grade = null;
			switch(score / 10){
			case 9 : case 10 :	
				grade = "A";
				break;
			case 7 : case 8 :
				grade ="B";
				break;
			case 5 : case 6 :
				grade ="C";
				break;
			case 3 : case 4 :
				grade = "D";
				break;
			default :
				grade = "F";
			}
			System.out.println("너의 성적은 "+grade);
			
			
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		Scanner abc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int korea = Integer.parseInt(abc.nextLine());
		if(korea == 0){
			System.out.println("숫자가 0 입니다");
		}else
			System.out.println("숫자가 0이 아닙니다");
		
		
		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		System.out.println("숫자를 입력하시오");
		int qwe = Integer.parseInt(abc.nextLine());
		if(qwe%2 == 1){
			System.out.println("홀수입니다.");
		}else
			System.out.println("짝수입니다.");
		
		//두 개의 숫자를 입력받아 더 큰 숫자를 출력해주세요. 
		System.out.println("숫자를 입력하시오");
		int a1 = Integer.parseInt(abc.nextLine());
		System.out.println("숫자를 다시한번 입력하시오");
		int a2 = Integer.parseInt(abc.nextLine());
		
		if(a1 > a2){
			System.out.println("더 큰 숫자는 "+ a1 +"입니다");
		}else if(a1 == a2)
			System.out.println("같은 숫자입니다");
		else
			System.out.println("더 큰 숫자는 "+ a2+"입니다");
		
		//세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
		System.out.println("숫자 입력해라");
		int b1 = Integer.parseInt(abc.nextLine());
		System.out.println("숫자를 한번더 입력하셈");
		int b2 = Integer.parseInt(abc.nextLine());
		System.out.println("마지막으로 한번더 입력해줘");
		int b3 = Integer.parseInt(abc.nextLine());
		if(b1>b2 && b1> b2){
			System.out.println("가장 큰 숫자는 "+b1);
		}else if(b2 >b3 && b2>b1)
			System.out.println("가장 큰 숫자는 "+b2);
		else if(b3 >b2 && b3>b2)
		System.out.println("가장 큰 숫자는 "+b3);
		else 
			System.out.println("세 숫자 모두 같습니다.");
		
		
		
		
	}
}
	
