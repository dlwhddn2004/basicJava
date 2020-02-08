package e.oop; 		//package = 현재 클래스의 위치를 알려준다.

import java.util.*; //import = 다른 패키지에 있는 클래스의 위치를 알려준다.
					//import 단축키 (ctrl + shift + O)
				   //import는 반드시 패키지와 클래스 사이에 위치해야함


public class SampleClass {
	
	int fiield = 10; //전역변수 : 클래스 전체 영역에서 사용하는 변수(매소드 밖에 있음)
	
	/*
	 *  메소드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 *  리턴타입 메소드 명 (피라미터){}
	 *  
	 *  리턴타입(반환타입) : 실행후 돌려줘야하는 결과물
	 *  파라미터 (매개변수) : 실행에 필요한 정보
	 */
	
	//method 앞엔 타입이 필요하다! (void 는 리턴값이 없을때 적용),	
	void method1(){
		System.out.println("파라미터도 리턴타입도 없는 메소드");
	
	
	}
	// method1() = () 안에는 파라미터가 들어감
	void method2(int parameter){
		System.out.println(parameter + "를 사용해 명령을 수행하는 메소드");
	}
	
	String method3(){
		return "명령 수행 후 결과물을 돌려주는 메소드";
		//return : 메소드를 종료시키고 결과물을 돌려준다.
		//리턴타입이 없는 메소드에서는 메소드를 종료시킨다.
	}
	
	int method4(int a, int b){
		System.out.println(a+ ","+ b+ "를 사용해 명령을 수행하고 결과물을 돌려주는 메소드");
		return a + b;
	}
	
	
	void flowTest1(){
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2(){
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3(){
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	
	
	
}
