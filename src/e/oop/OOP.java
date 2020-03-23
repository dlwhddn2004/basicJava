package e.oop;

public class OOP {
	public static void main(String[] args) {
		/*
		 * << OOP (Object Oriented Programming) : 객체지향 프로그래밍 >>
		 * 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체 생성(인스턴스화)>>
		 * 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 * new 클래스 명(); -> 객체가저장된 메모리 주소 반환
		 * 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 * 프로그램을 효율적으로 만드는~~  
		 */
		
		SampleClass sc = new SampleClass(); //객체 생성~
		
		sc.method1(); //객체를 저장한 변수 뒤에 (.)을 넣고 메소드를 불러온다.
		
		sc.method2(5); //컨트롤 + 스페이스에서 void가 있다는건 리턴타입이 없다는것~
		
		String returnString = sc.method3(); //3번 메소드가 String 타입이므로 타입에 맞는 변수를 설정하고 넣어준다.
											// 실행 결과 : String returns = "명령 수행후 결과물을 돌려주는 메소드";
		System.out.println(returnString);
		
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		
		sc.flowTest1(); //호출 했을때 출력되는 문장에 번호를 붙어주세요.
		
		
		//------------------------------------------------------
	
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메소드들을 호출해주세요.
		//피라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고 ,
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해주세요.
		
		ClassMaker a = new ClassMaker();
		a.lee();
		String abc = a.jong();
		System.out.println(abc);
		
		a.woo(6);
		
		int ab = a.good(4, 5);
		System.out.println(ab);
		
		//----------------------------------------------------
		
		//다음을한줄씩 계산하여 최종결과값을 출력해주세요.
		//1.	 123456 + 654321
		//2.	 1번의 결과값 * 123456
		//3.	 2번의 결과값 / 123456
		//4.	 3번의 결과값 - 654321
		//5.	 4번의 결과값 % 123456
		
	Calculator cal = new Calculator();
	
	
	int number = cal.plus(123456, 654321);
	double number1= cal.multiply(number, 123456);
	double number2= cal.division(number1, 123456);
	double number3 = cal.minus(number2, 654321);
	double number4 = cal.remainder(number3, 123456);
	System.out.println(number4);
		
		
	//--------------------------------------------------------
	
	SimliTest siml = new SimliTest();
	siml.Siml1();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
