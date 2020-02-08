package c_statement;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		//숫자 야구 게임을 만들어 주세요
		
		  int a = (int)(Math.random() * 9) + 1;
		  int b = (int)(Math.random() * 9) + 1;
		  int c = (int)(Math.random() * 9) + 1;
						
			while(a==b || b==c || a==c){				//겹치지않게 숫자 설정 하기
				   a = (int)(Math.random() * 9) + 1;
				   b = (int)(Math.random() * 9) + 1;
				   c = (int)(Math.random() * 9) + 1;
			}
			Scanner sc = new Scanner(System.in);
			
			int num;
			
			int num1 =0;
			int num2 =0;
			int num3 =0;
			
			int s1=0;
			int b1;
			int o1;
			while(s1 !=3){ //야구게임 시작
				System.out.println("야구 게임 숫자 입력 3개");
				num = Integer.parseInt(sc.nextLine()); //컴퓨터상에서 입력한 숫자와 사용자가 입력한 숫자 마추기
				 num1 = num%10; 
				 num2 = (num/10)%10;
				 num3 = (num/100);
				 	 s1 =0;  b1=0;  o1=0;
				 	 
				 	 if(a==num1){
				 		 s1++;
				 	 }
				 	 if(b ==num1 || c == num1){
				 		 b1++;
				 	 }
				 	 if(b==num2){
				 		 s1++;
				 	 }
				 	 if(a ==num2|| c== num2){
				 		 b1++;
				 	 }
				 	 if(c == num3){
				 		 s1++;
				 	 }
				 	 if(a ==num3|| b== num3){
				 		 b1++;
				 	 }
			o1 = 3-(s1+b1);
			System.out.println("[s] : " +s1 +" [b] : "+b1+" [o]: "+o1 );
				
	  } 
	}
}
