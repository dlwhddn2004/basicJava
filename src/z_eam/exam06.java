package z_eam;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 문제 1 답
public class SutdaCard {
	int num ;
	boolean isKawnag ;
	}
*/
	//문제 2
	//설명들으셈 어렵
		
	//문제 3
/*		public class Student{
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			}
		*/	

	//문제 4
/*
 * int getTotal(){
		
		return kor+eng+math; --합
	}

	
	float getAverage(){         --나누기
		return (int)(getTotal() / 3f *10 +0.5 )/ 10f;
	}
 * 
 * 
 */
	//문제 5
		/*SutdaCard(String name, int ban , int no , int kor, int eng , int math){
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor =kor;
			this.eng = eng;
			this.math = math;
		
		}
		String info(){
		return	name
				+','+ban
				+','+no
				+','+kor
				+','+eng
				+','+math
				+','+getTotal()
				+','+getAverage();*/
		
		
		//문제 6
		/*
		 *		 static double getDistance(int x, int y, int x1, int y1){ 
		
				double a = Math.sqrt((x -x1)*(x -x1) + (y-y1)*(y-y1));
 						return a;
	
		 *  
		 * 문제 7
		 * 
		 * 	
	 	double getDistance1(int x1, int y1){ 
		return Math.sqrt((x -x1)*(x -x1) + (y-y1)*(y-y1));
		}
		 * 
		 * 
		 * 
		 */
		
		/*
		 * 문제 8
		 *  클래스 변수 : int width , int height
		 * 인스턴스 변수 : int kind , int num  
		 * 지역 변수 : int k int n , card args
		 * 
		 * 
		 * 
		 * 문제 9
		 * 
		 * 		weapon , armor, void armorUp, void weaponUp()
		 *  모든 병사의 공격력과 방어력이 같아야 한다는건 결국
		 * 병사 한명뿐만아니라 모두가 공유된 공격력과 방어력을 가져야한다
		 * 그로므로 공유하고 그 값이 고정되어있지 않은 static을 선언해줘야함
		 *  void WeaponUp , void weaponUp(
		 *  void armorUp
		 *  
		 *  
		 *  문제 10
		 *   b , e 
		 *   생성자는 객체를 생성하기 위해서가 아니라 다른 생성자를 호출 할때 쓴다
		 *   생성자도 오버로딩 가능 여러개의 생성자를 만들수 있으나 
		 *   타입이나 매개변수 개수가 달라야함
		 *   
		 *  문제 11  
		 *   b
		 *  
		 *  this는 인스턴스 자신의 주소를 저장하고 있고 모든 인스턴스 
		 *  메서드에 숨겨진채로 존재하는 지역변수. 그래서 this는 인스턴스
		 *  메서드 내에서만 사용할 수 있다.
		 *  클래스는 매서드는 객체 생성하기 전에 올라와져있다
		 *  
		 *  
		 *  
		 *  12번 c ,d
		 *  		 *  c  => 반환 타입은 오버로딩을 구현하는데 영향 X 
		 *   오버로딩된 메서드들은 매개변수에 의해서만 구현 됨
		 *   매개변수 이름이 같아야 한다.
		 *   
		 *   
		 *   13번 b , c , d 
		 *   매서드의 이름이 같아야 하고 매개변수의 개수 또는 타입이 달라야함
		 *   리턴타입은 상관없다.
		 *   
		 *   
		 *   14번 c e 
		 *   맴버 변수는 자동 초기화 됨 값 참조 가능
		 *   지역변수는 사용하기 전에 반드시 초기화
		 *   초기화 블럭이 먼저 수행 (초기화 > 생성자)
		 *   명시적 초기화를 우선적으로 고려
		 *   클래스 변수가 먼저 초기화 후 인스턴스 변수 초기화
		 *   
		 *   
		 *   15번 a 
		 *   변수의 초기화 시기와 순서는 
		 *   클래스 변수 의 초기화 기본값 > 명시적 초기화 > 클래스 초기화 블럭  
		 *   인스턴스 변수의 초기화 시점 기본값 > 명시적 초기화 > 인스턴스 초기화 블럭 > 생성자
		 *   
		 *   16번 
		 *   a , e
		 *   지역변수는 자동 초기화 되지 않기 때문에 반드시 적절한 값으로 초기화
		 *   힙 영역에서는 인스턴스변수가 생성, 지역변수는 호출스택이 생성 
		 *  
		 *   17번
		 *   b 
		 *   호출스택의 제일 위에 있는 메서드가 현재 수행중인 메서드이며
		 *   호출스탤 안의 나머지 메서드들은 대기상태이다.
		 *   후입선출 LIFO 모형!
		 *   
		 *   
		 *   
		 *   18번
		 *    a, b ,d
		 *    static변수의 초기화에 인스턴스 변수를 사용 할 수 없다.
		 *    꼭 사용하려면 객체
		 *    static 메소드에 인스턴스 변수를 사용할수 없다
		 *    staitc 메소드에는 인스턴스 메서드를 사용할수 없다.
		 *    
		 *    19번 설명 한번 들어보기
		 *    스택으로 설명 
		 *    string은 추가할수 없고 새로운 객체를 생성해서
		 *    다른 주소를 받는 abc123456 이 생성~
		 *    str+456 을 출력하는 참조변수가 없어서 가비지컬렉터에 의해 삭제됨
		 *    그래서 ABC123이 출력
		 *    
		 *    
		 *    20 문제
		 *    
	 static int[] shuffle (int arr[]){
		int a = (int)(Math.random()*9)+1;
		
		for(int i=0; i<arr.length; i++){
			int temp=0;
			temp = arr[i];
			arr[i] = arr[a];
			arr[a] = temp;
			
			
		}	return arr;
			
			
		 *    
		 *    
		 *    
		 *    
		 *    
		 */
			
	}	
	}
	
/*		class Exercise6_22{
			
		 static	boolean isNumber(String str){
				if(str == null || str.equals("")){
					return false;
				}
				for(int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				if(0>ch && ch>9){
					return false;
					}
				}
				return true;
			}
			
			public static void main(String[] args) 
			{ String str = "123";
			System.out.println(str+"는 숫자입니까 ? "+isNumber(str)); 
			
			str = "1234o";
			 System.out.println(str+" 는 숫자입니까 ? "+isNumber(str));
				}
		}
		
		class Exercise6_23{ 
		
	static	int max(int[]arr){ 
			if(arr == null || arr.length ==0){
				return -999999;
			}
				int max = arr[0];
				for(int i=1; i<arr.length; i++){
					
					if(arr[i]> max){
						max = arr[i];
						} 
				} return max;
			
		}
			
		
		
public static void main(String[] args) { 
	int[] data = {3,2,9,4,7}; 
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값  :"+max(data));
	System.out.println("최대값  :"+max(null));
	 System.out.println(" 최대값 크기가 인 배열 :"+max(new int[]{})); 
	 // 0 }
	}
		}
		
		class Exercise6_24 {
		public static int abs(int value){
			
			if(value > 0){
				return value;
			}else{
				
				return value*(-1);
			}
		}
			
			public static void main(String[] args) { 
				int value = 5; 
				System.out.println(value+"의 절대값  :"+abs(value));
				value = -10;
				System.out.println(value+"의 절대값  :"+abs(value)); }
	
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
	
