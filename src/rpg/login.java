package rpg;

import java.util.Scanner;

public class login {

	Scanner sc = new Scanner(System.in);
	String id; String id2;
	String a; String b;
	String pw; String pw2;
	String num;
	boolean run = true;
	
	
	void Insert(){
		while(run){
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 나가기 ");
		
		num = sc.nextLine();
		if(num.equals("1")){
			
			if(id==null && pw ==null){
				System.out.println("아이디 : ");
				a = sc.nextLine();
				System.out.println("비밀번호 : ");
				b = sc.nextLine();
				System.out.println("가입된 아이디가 없습니다.");
				continue;
			}
			System.out.println("아이디 : ");
			id2 = sc.nextLine();
			System.out.println("비밀번호 : ");
			pw2 = sc.nextLine();
			if(id.equals(id2)&& pw.equals(pw2)){
				System.out.println("로그인 확인");
				break;
			}else{
				System.out.println("로그인 실패 다시 입력");
			}
		}else if(num.equals("2")){
			System.out.println("아이디 : ");
			id=sc.nextLine();
			System.out.println("비밀번호 :");
			pw=sc.nextLine();
			System.out.println("회원가입 되었습니다.");
		}else if(num.equals("3")){
			run= false;
			System.out.println("프로그램 종료");
			
				System.exit(0);
				
			//완전히 종료하는 메소드 추가
		}
	}
} }
