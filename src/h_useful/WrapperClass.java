package h_useful;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class WrapperClass {
	
	public static void main(String[] args) {
	
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean 	: Boolean
		 * char	   	: Character
		 * byte		: Byte
		 * short 	: Short
		 * int		: Integer
		 * long		: Long
		 * float	: Float
		 * double	: Double
		 */
		
		int i= 10;
		Integer iw = new Integer(20);
		
		System.out.println(i +iw); //기본형타입과 탐조형 타입의 연산이 됨
		
		System.out.println(Integer.MIN_VALUE+ "~"+ Integer.MAX_VALUE); //int타입이 표현할수 있는 가장 작은 타입과 큰타입을 상수로 가지고 있음
		
		System.out.println(i + Integer.parseInt("20")); //문자열 -> 숫자열로 바꿔주는 메쏘드~ Integer.parseInt("20") -> 20
		System.out.println(i + String.valueOf(20)); // 숫자열 -> 문자열로 바꿔주는 메소드 String.valueOf(20) -> "20"
		
		System.out.println(i + Integer.valueOf("20")); //문자열 -> 숫자열로 바꿔줌 Integer.valueOf("20") ->20
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList --> 길이가 유동적으로 움직이는 배열
		
		list.add(new Integer(10)); //현재 ArrayList가 Integer타입인데 int는 오토박싱으로 list에 넣을수 있음
		list.add(10); // 오토박싱 : 기본형 타입이 wrapper클래스로 자동 변환
		
		Integer integer = list.get(0);
		int i2 = list.get(0); // 언박싱 : wrapper 클래스가 기본형타입으로 자동 변환
	}
	

}
