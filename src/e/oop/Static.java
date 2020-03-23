package e.oop;

public class Static {
	public static void main(String[] args) {
		/*
		 * <<static >>
		 * - 객체 생성 없이 변수나 메소드를 사용하기 위해 붙인다.
		 * - 객체들 간에 변수의 값을 공유하기 위해 붙인다.
		 * - static이 붙은 것 : 클래스 맴버(클래스 변수, 클래스 메소드)
		 * - 클래스 맴버 : 메모리에 클래스가 저장될 때 같이 저장된다.
		 * - static이 붙지 않는 것 : 인스턴스 맴버 (인스턴스 변수, 인스턴스 메소드)
		 * 
		 *  전역변수 -> 클래스 변수 OR 인스턴스 변수 로 나눈다
		 */
			
		//static이 붙은 메소드
		Math.random(); 	//객체 생성없이 만듬 ==> static이 붙어있음 , 클래스명 + '.'  호출 ;
		System.out.println();
		
		System.out.println(ClassMember.ClassVar);
		ClassMember.classMethod();
		
		
		//static이 안붙은 애들은 객체를 생성해줘야함
		 ClassMember cm1 = new ClassMember();
		 System.out.println(cm1.instanceVar);
		 cm1.instanceMethod();
		 
		 System.out.println(cm1.ClassVar);
		 cm1.classMethod();
		 //객체를 통해서 클래스 맴버에 접근할 수 있지만 좋은 방법은 아니다.
		
		 // 인스턴스 변수  : 값을 공유하지안고 고유의 독립성이 보장
		 ClassMember cm2 = new ClassMember();
		 
		 System.out.println("번경 전");
		 System.out.println("cm1 : " + cm1.instanceVar);
		 System.out.println("cm2 : " + cm2.instanceVar);
		 
		 cm2.instanceVar = "인스턴스 변수 변경";
		 
		 System.out.println("번경 후");
		 System.out.println("cm1 : " + cm1.instanceVar);
		 System.out.println("cm2 : " + cm2.instanceVar);
		 
		 //클래스 변수  : 값을 공유 ,값이 바뀌면 그 클래스 변수 값은 변한다.
		 System.out.println("번경 전");
		 System.out.println("cm1 : " + cm1.ClassVar);
		 System.out.println("cm2 : " + cm2.ClassVar);
		 
		 cm2.ClassVar = "클래스 변수 변경";
		 
		 System.out.println("번경 후");
		 System.out.println("cm1 : " + cm1.ClassVar);
		 System.out.println("cm2 : " + cm2.ClassVar);
		 
		 
		 
		 
	}
}
