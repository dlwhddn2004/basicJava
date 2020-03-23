package e.oop;

public class ClassMaker {

	//전역 변수 하나를 선언 및 초기화 해주세요.
	String park = "abcd";
	
	
	
	//리턴타입과 파라미터가 없는 메소드 하나를 만들어 주세요.
	//메소드 안에서 전역변수를 출력해주세요.
	void lee(){
		System.out.println(park);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 피라미터는 없는 메소드 하나를 만들어 주세요.
	String jong(){
		return park;
	}
	
	//리턴타입은 없고 파라미터가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 파라미터를 출력해주세요.
	void woo(int x){
		System.out.println(x);
	}
	
	//int 타입의 리턴타입과 int 타입의 파라미터 두개가 있는 메소드 하나를 만들어주세요
	int good(int a, int b){
		return a * b;
	}
	
}
