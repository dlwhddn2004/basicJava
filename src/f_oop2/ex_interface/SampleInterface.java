package f_oop2.ex_interface;

public interface SampleInterface {

	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1= 1;
	//모든 멤버변수의 제어가 같기 때문에 생략 가능하다.
	int NUM2= 2;
	
	
	//인터페이스의 모든 메소드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	//모든메소드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
}

//인터페이스를 상속받는 클래스 //?인터페이스클래스는 여러개의 인터페이스를 상속받을수 있음
class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		System.out.println(SampleInterface.NUM2);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
}



interface SampleInterface2{
	void method1();
	void method3();
}
