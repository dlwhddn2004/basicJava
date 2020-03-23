package f_oop2;

public class SampleParent extends Object{
	//아무것도 상속 안받을경우 컴파일러가 자동적으로 오브젝트를 상속받게 해 줌
	
	 String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = " 생성자도 물려주지 않는다.";
	}
	
	int method(int a,int b){
		return a +b;
	}
}
