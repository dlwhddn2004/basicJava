package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String s =new String("ABCD");	//참조형 타입을 초기화하는 방법
		String str = "ABCD";	//String은 특별히 간단하게 초기화 가능!
		
		char [] charArray= str.toCharArray(); //String 클래스 내부에 문자배열을 가지고 있다.
		System.out.println(charArray); //문자 배열은 주소가 아니라 값이 나옴
		
		/*
		 * << String의 주요 메소드 >>
		 * 	equals() 	: 문자열의 내용이 같은지 확인한다.
		 * 
		 * 	length()	: 문자열의 길이를 반환한다.
		 * 
		 * 	charAt()	: 문자열에서 해당 위치에 있는 문자를 반환한다.
		 * 
		 * substring()	: 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * 
		 * indexOf()	: 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * 
		 * replace()	: 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
	
			for(int i= 0; i< str.length(); i++)
			{
				System.out.println(str.charAt(i)); //인덱스 번호 안에 있는 문자 1개 ~
			}
			
			
			String revStr= ""; //str을 거꾸로 담을 변수
			//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
			for(int i= str.length()-1; i>=0; i--)
			{
				revStr += str.charAt(i);
			}System.out.println(revStr);
			
			str ="0123456789";
			String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
			System.out.println(sub1);
			
			String sub2 =str.substring(5 , 8); //5번 인덱스부터 8번인덱스 전까지 잘라서 반환한다.  <8
			System.out.println(sub2);
			
			str ="치킨 피자 돈까스 떡볶이";
			
			int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다. 0 1 2 3
			System.out.println(idx);
			
			String[] menus = {
					"치킨 18000원",
					"피자 9900원",
					"돈까스 8000원",
					"떡볶이 500원"
			};
			
		for(int i = 0; i< menus.length; i++){
			String name =menus[i].substring(0, menus[i].indexOf(" "));
			System.out.println(name);
			
			
			//가격으로 분리해서 int 타입으로 저장
			int price = Integer.parseInt(menus[i].substring(menus[i].indexOf(" ")+1, menus[i].indexOf("원")));
			System.out.println(price);
		}
			
			
			str ="123456789";
			
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");
			System.out.println(str);
			
			String pn = "010-2363-3647"; //하이폰 (-)을 제거해서 출력해주세요.
			pn = pn.replace("-", " ");
			
			System.out.println(pn);
			
			//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
			//1,234,567
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하시오");
			String a = sc.nextLine(); 
			
			String reva="";
			String reva2= "";
			
			int count =0;
					
			for(int i=a.length()-1; i>=0; i--){
				reva += a.charAt(i);
						count ++;
						
						
				if(count%3 ==0 && count != a.length()){  // (count%33==0 && != i) 도 가능 같은의미
					reva+= ",";
				}
			}for(int i= reva.length()-1; i>=0; i--){
				reva2 += reva.charAt(i);
			}System.out.println(reva2);
					
	
//과제 자바의정석 468 471 한번씩 쳐보기	
				
//	String(char[] value) : 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
			char[] c = {'h','e','l','l','o'};
			String s1 = new String(c);
			System.out.println(s1);
// String (stringBuffer buf) : stringBuffer인스턴스가 갖고 있는 문자열과
// 같은 내용의 String인스턴스를 생성한다.
			StringBuffer sb = new StringBuffer("HEELO");
			String s2 = new String(sb);
			System.out.println(s2);
//char charAt(int index) : 지정된 위치(index)에 있는 문자를 알려준다. 
			String s3 = "Hello";
			String s4 = "heello";
			char c1 =s3.charAt(1); // c1 = 'e'

//int compareTo(String str) :문자열(str)과 사전순서로 비교한다. 같으면 0을 , 사전순으로 이전이면
//								음수를 , 이후면 양수를 반환
		int i1 = "aaa".compareTo("aaa"); // 0
		int i2 = "aaa".compareTo("bbb"); // -1
		int i3 = "bbb".compareTo("aaa"); // 1
		
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
