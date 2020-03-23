package f_oop2;

//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들 간에 객체를 공유하기 위해 사용한다.
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){ //처음에는 값이 null이니까 if로 들어오고 값을 공유하기떄문에 2번째부터는 그냥 바로 return 하는구조
			instance = new Singleton();
		}
		return instance;
		
	}
}
