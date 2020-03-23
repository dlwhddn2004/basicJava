package e.oop;

public class JVM_Memory {

	
	/*
	 *  << JVM (Java Virtual Machine) >>
	 *  - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 *  
	 *  - 운영체제 -> JVM -> 자바 프로그램
	 * 
	 *  - 장점 : 운영체제에 상관없이 실행할 수 있다.
	 *  - 단점 : 속도가 느리다.
	 *  
	 *  << JVM 메모리 구조 >>
	 *  - MEthod Area : 클래스가 저장된다
	 *  - Call Stack : 현재 호출되어 있는 메소드가 저장된다.
	 *  - Heap : 객체가 저장된다.
	 */
	
	
	/* 23행을 시작으로
	 * << Method Area >>
	 *  ClassMember : ClassVar, ClassMethod()  [class 변수와 class 메소드가 같이 저장]
	 *  System : out (시스템이라는클래스 안에 아웃이라는 변수)
	 *  PrintStream : println() (PrintsTream 클래스 안에 println 이라는 매소드가 올라감)
	 *  
	 * << Call Stack >>
	 * println(cm1.instanceVar) : 실행 후 삭제
	 * instanceMethod() : 실행 후 삭제
	 * Println(cm1.classVar) :실행 후 삭제
	 * ClassMethod : 실행 후 삭제
	 * 
	 * 
	 * << Heap >>
	 * cm1 = new ClassMember() : instanceVar, instanceMethod() [인스턴스 변수와 인스턴스 메소드가 저장]
	 * cm2 = new ClassMember() : instanceVar, instanceMethod()  //두번째 객체 생성
 	 * 
	 */
	
}
