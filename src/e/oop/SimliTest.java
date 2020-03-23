package e.oop;

import java.util.Scanner;

public class SimliTest {
	Scanner sc = new Scanner(System.in);
	 

void Siml1(){
	 System.out.println("나는 금사 빠다 yes or no");
	 String input = sc.next();
	 if(input.equals("yes")){
		 siml2();
	 }else{
		 siml3();
		 
	 }
	
	
}

	
void siml2(){
	System.out.println("연애할 때 끌려다니는 타입입니까? yes or no");
	 String input = sc.next();
	 if(input.equals("yes")){
		 siml4();
	 }else{
		 siml9();
		 
	 }
	
	
}

void siml3(){
System.out.println("감정기복이 크지 않다? yes or no");
String input = sc.next();
if(input.equals("no")){
	 siml4();
}else{
	 siml7();
	 
}
	

}


	void siml4(){
	System.out.println("감정표현이 솔직한 편이다? yes or no");
	String input = sc.next();
	if(input.equals("yes")){
		 siml5();
	}else{
		 siml8();	
}
	
	}

	void siml5(){
	System.out.println(" 이성 친구는 존재 할수 없다? yes or no");
	String input = sc.next();
	if(input.equals("yes")){
		 siml6();
	}else{
		 System.out.println("당신은 B 타입");
	}
		
}

		void siml6(){
	System.out.println(" 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다 ?yes or no");
	String input = sc.next();
	if(input.equals("yes")){
		 System.out.println("당신은 D 타입");
	}else{
		 System.out.println("당신은 C 타입");
	}
	 
}

	void siml7(){
		System.out.println(" 연락이 없이 기다리는 타입이다?yes or no");
		String input = sc.next();
		if(input.equals("yes")){
			 System.out.println("당신은 A 타입");
		}else{
			 siml5();
		}
		 	
		}


void siml8(){
	System.out.println(" 활동적인 데이트가 좋다 ?yes or no");
	String input = sc.next();
	if(input.equals("yes")){
		 siml5();
	}else{
		 siml6();
	}
	 

}


void siml9(){
	System.out.println(" 데이트 코스는 미리 짜는게 편하다 ?yes or no");
	String input = sc.next();
	if(input.equals("yes")){
		 siml8();
	}else{
		 siml4();
	}
	 

}


		}

