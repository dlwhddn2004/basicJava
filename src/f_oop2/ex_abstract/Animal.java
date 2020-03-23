package f_oop2.ex_abstract;

public abstract class Animal {
		
	void run(){
		System.out.println("달려나 허니~~~~");
	}
	
	//행동은 똑같지만 결과가 다를 경우 추상 메소드를 만든다.
	abstract void bark();
	
}

class Dog extends Animal{
	@Override
	void bark() {
		System.out.println("멍멍!!");
		
	}
}

class Park extends Animal{
	@Override
	void bark() {
		System.out.println("끼요요요요요요욧~!");
		
	}
}

class Tiger extends Animal{
	@Override
	void bark() {
		System.out.println("엏흥");
		
	}
}