package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	void method(){
		
	}

	// 추상 메소드 : 선언부만 있고 구현부는 없는 메소드
	abstract void abstractMethod(); // 앞에 abstract 라는 제어자를 붙여주고, 추상메소드는 추상클래스 안에 들어가있음
	
}

class SampleAbstractChild extends SampleAbstractParent{
											//선택 2개 child가 추상클래스가 될지, 추상메소드를 오버라이딩 할지
	@Override
	void abstractMethod() {
		
		
	}
	
}