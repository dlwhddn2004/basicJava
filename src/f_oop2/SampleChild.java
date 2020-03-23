package f_oop2;

public class SampleChild extends SampleParent{

	void childMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var);  //상속받은 변수
		int result = method(7,13);	//상속받은 메소드
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// System.out.println(var); 아직 메모리에 올리지않아, 객체가 없으니 사용 불가 
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
	}
	
	//오버라이딩 : 상속받은 메소드이 내용을 재정의 하는 것.
	
	@Override //어노테이션 오버라이딩 실수했을때 표시해줌
	//오버라이딩을 할경우 부모클래스의 매소드를 덮어쒸움 (무시)
	//자식클래스의 메소드를 사용
	int method(int a, int b){
		return a * b;
	}
	
	int var; //부모클 같은 변수명
	
	void test(double var){
		System.out.println(var);//지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 맴버와 자식클래스의 맴버가 이름이 중복 될때 둘을 구분하기 위해 사용
		
		System.out.println(this.method(10, 20)); //오버라이딩한 메소드
		System.out.println(super.method(10, 20)); // 부모클래스 메소드
	}
	
	public SampleChild() {
		super(); //부모클래스의 생성자를 호출하면 부모클래스의 객체도 자동으로 호출된다.
		
		/*super()를 사용해 부모 클래스의 객체도 생성한다.
		super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.*/
		//만약 부모클래스 super() 를 호출할때 자식에 값을 너어주려면 super(피터미터값 ) 넣어주면됨
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
