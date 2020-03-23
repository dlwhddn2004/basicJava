package f_oop2.access_test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		
	AccessModifier am = new AccessModifier();
	
	System.out.println(am.publicVar);
		am.pulicMethod();
		
	/*System.out.println(am.protectedVar);protected는 접근 안됨 
		am.protectedMethod(); 		같은 패키지거나 상속을 받아야함으로

*/
		// 아래는  다른 패키지에있는 AccessModifier 상속을 받음
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.pulicMethod();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
	/*	System.out.println(at.defaultVar); 접근제한 됨
		at.defaultVar();
		System.out.println(at.privateVar); 접근제한 됨
		at.privateVar();*/
	}

}
