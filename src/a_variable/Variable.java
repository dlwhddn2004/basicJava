package a_variable;

import java.util.Scanner; //Ctrl + Shift + O 스캐너 유틸 블러오기



public class Variable {

	int a; //전역 변수 (메소드밖에 있는 변수)
	
	public static void main(String[] args) {
	/*
		<<변수>>
		하나의 데이터를 저장할수 있는 메모리상의 공간
		타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 있다.

		<<사용 가능한 기본형 데이터의 종류>>
		정수 : byte(1byte), short(2byte) int(4byte) long(8byte)
		실수 : float(4byte), double(8byte)
		문자 : char(2byte)
		논리 :boolean(1byte)
		
		<< 명명규칙 >>
		- 블럭안에서 변수명은 중복 될 수 없다.
		-영문 대소문자, 한글, 숫자, 특수문자('-','$')를 사용할 수 있다.(한글 사용은 자제하자)
		-대소문자가 구분되며 길이에 제한이 없다.
		-숫자로 시작할 수 없다.
		-예악어는 사용할 수 없다.
		-[기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		-[여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		-[클래스명의 첫글자는 대문자로 한다.]
		-[패키지명은 모두 소문자로 한다.]
		*/
	
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte _byte;
		char _char;

		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		int _int;
		long _long;
		short _short;
		float _float;
		double _double;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
//		System.out.println(_byte); //컴파일 에러 발생 ( 문법이 틀렸기 때문)
		
		//  = (대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다. (오른쪽 먼저 연산)
		_byte = 10; //타입에 맞는 값을 저장해야 함.
		_short = 20;
		_int = 30;
		_long = 40L; 	// long 접미사 : L
		_float = 3.14f; // float 접미사 : f
		_double = 3.14; //double 접미사 : d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것
	
	System.out.println(_int);
	//Ctrl + F11 : 프로그램 실행
		   //F11 : 디버그 실행
	
	_int = 100;
	System.out.println(_int); 
	_int = 100 + 200;
	System.out.println(_int);
	
	//위에서 초기화한 변수에 새로운값을 저장하고 출력해주세요.
	
	_byte = 55;
		System.out.println(_byte);
	_short = 98;
		System.out.println(_short);
	_long = 55L;
		System.out.println(_long);
	_float = 2.24f;
		System.out.println(_float);
	_double = 5.56;
		System.out.println(_double);
	_char = '호';
		System.out.println(_char);
			_boolean = false;
			System.out.println(_boolean);
	
			//String : 여러개의 문자를 편리하게 사용하기 위한 클래스 
			//문자열 : ""(큰따옴표)로 감싸진 글자
			
			String _String = new String("KOREA");
			System.out.println(_String);
			
			_String = "1234"; //초기화할떈 간편하게
			System.out.println(_String);
			
			/*
			 * << 리터럴의 종류 >> 
			 * 숫자 : 0, 10, -5, 3.14
			 * 문자 : '가', 'a'. '0', ' ' (공백이여도 한문자를 나타나는 뛰어쓰기가 있어야함)
			 * 문자열 : "가나다", "abc", "123", "  ",""
			 * 그외 : true, false, null
			 *
			 * << 참조 형 타입 >>
			 * -기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
			 * - ex) String, AboutClass, Variable
			 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
			 * - 변수의 크기는 4byte 이다. 
			 */
			
			//기본 값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
			_byte = 0;
			_short = 0;
			_int = 0;
			_long = 0L;
			_float = 0.0f;
			_double = 0.0d;
			_char = '\u0000'; //' '  유니코드
			_boolean = false;
			_String = null;
			// 경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
			_byte = 127;
			_int = 128;
			_byte = (byte)_int; //형변환 : 데이터 타입을 변환하는 것
			System.out.println(_byte); // 128 -> -128 이런 현상 (오버플로우)
			//byte는 -128~ 127 까지 표현이 가능한데 범위를 초과 했기 때문에 127 다음 -128로 간다
										
			
			_byte = -128;
			_int = -129;
			_byte =(byte)_int;
			System.out.println(_byte); // -129 -> 127 (언더플로우)
			//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터 손실 될 수 있다.
			
			
			_double = 3.14;
			_int =(int)_double;
			System.out.println(_int);
			//인트는 정수 타입, 더블은 실수 타입이라 더블값이 인트로 들어간다 하여도 정수로만 나타난다 (3.14 -> 3)
			
			//표현범위가 작은 타입에서 큰 타입으로 형변활 할 경우 데이터 손실될 염려가 없다.
			//그러므로 형변환을 생략 할 수 있다. 큰쪽에서 작은쪽 생략 X, 작은쪽에서 큰 쪽 생략 O
		
			
			//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요
			_int = _byte;
			_long = _int;
			_double = _int;
			_double = _float;
			_long = _short;
			_long = _short;
			
			//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요. //long < float
			_byte = (byte)_int;
			_int = (int)_long;
			_short = (short)_double;
			_float = (float)_double;
			_short = (short)_int;
			_short = (short)_long;
			
			/*
			 * << 상수 >> 알수있게 하기 위해 대문자로 씀
			 * -값을 한번 저장하면 변경할 수 없는 저장공간
			 * -final int MAX_NUMBER;
			 * -리터널에 의미를 부여하기 위해 사용
			 * 
			 */
			
			final int MAX_NUMBER;
			MAX_NUMBER = 10;
			// MAX_NUMBER = 100; 값을 한번더 지정하면 오류가 뜸
			
			//콘솔창에서 입력받는 방법
		/*	Scanner s = new Scanner(System.in);
			
			System.out.println("문자열을 입력해주세요");
			String input1 = s.nextLine(); 
			//nestLine 메소드는 사용자가 입력할때 까지 기다리고 사용자가 입력한 값을 진행
			System.out.println("입력받은 문자열 :"+input1);
			
			System.out.println("숫자를 입력 해라");			
			int input2 = Integer.parseInt(s.nextLine());
			//String 타입의 값을 int 타입으로 바꿔줌 => Integer.parseInt
			System.out.println("입력받은 숫자 : "+input2+"입니다");*/
			
			//문자열을 입력받고 입력받은 문자열을 출력해 주세요.
			//Scanner a = new Scanner(System.in);
			/*System.out.println("문자를 입력하시오");
			String input1 = a.nextLine();
			System.out.println("입력받을 문자열 :"+input1 );
			
			//숫자를 입력받고 입력받은 숫자를 출력해 주세요.
			System.out.println("숫자를 입력하셈");
			int input2 = Integer.parseInt(a.nextLine());
			System.out.println("입력받은 숫자는"+input2);
			
			//위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
			System.out.println("입력받은 문자열과 숫자 :"+input1+","+input2);
			*/
			//3개의 숫자를 입력받고 그 숫자들을 더한 결과를 출력하시오
			/*
			System.out.println("숫자를 3개 입력하시오");
			int input3 = Integer.parseInt(a.nextLine());
			int input4 = Integer.parseInt(a.nextLine());
			int input5 = Integer.parseInt(a.nextLine());
			
			System.out.println(input3+input4+input5);
			*/
			//아이디 비밀번호 이름 전화번호 이메일을 입력받고 마지막에 입력받은 내용 전체를 출력해주세요.
			Scanner a = new Scanner(System.in);
			System.out.println("아이디 입력");
			String id = a.nextLine();
			System.out.println("이름 입력");
			String name = a.nextLine();
			System.out.println("전화 번호 입력");
			String phone = a.nextLine();
			System.out.println("이메일 입력");
			String email = a.nextLine();
			
			System.out.println("입력받은 내용 전체 출력"+id+name+phone+email);
			
			
	}			
	
}










