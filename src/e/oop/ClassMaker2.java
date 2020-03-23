package e.oop;

public class ClassMaker2 {

		//전역 변수 하나를 선언하고 명시적으로 초기화 해주세요.
	static int a = 100;
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요
	static {
		for(int i=0; i <=200; i++)
		{
			a+=i;
					}
	}
	//위에서 선언한 전역변수를 생성자의 피라미터를 사용해 초기화 해주세요
	
	ClassMaker2(int a){
		for(int i=0; i<=300; i++){
			this.a+= i;	
		}
	}
	// 위에서 선언한 전역변수를 생성자를 하나더 만들어서 초기화 해주세요
	ClassMaker2(){
		this(400);
	}
	
	//초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자 
	//생성자에는 static이 붙을수 없고 초기화를 안하는게 좋다.
}
