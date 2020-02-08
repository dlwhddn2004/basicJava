package z_eam;

import java.util.Scanner;

public class ArrayBaseboll {

	public static void main(String[] args) {
		
		
		
		int num[] = new int[3];
		
		
		//겹치지 않게 해주기
	while(num[0]==num[1] || num[1] == num[2] || num[0]==num[2]){
		
			for(int i=0; i<num.length; i++){
				num[i] = (int)(Math.random()*9)+1;
			}
	}
		
		Scanner sc = new Scanner(System.in);
		
		int num2[] = new int[3];
		
	int num1 =0;
		
		 while(true){
			 System.out.println("야구 게임 숫자 입력 3개");
			 num1 = Integer.parseInt(sc.nextLine());
			 
			 int s=0 , b=0, o=0;
			 
			 for(int i =0; i<num2.length; i++ ){
			 
				 num2[i] = num1%10;
				 num1= num1/10;
			 }
				 if(num[0] == num2[2]){
					 s++;
				 }
				 if(num[1] == num2[1]){
					 s++;
				 }
				 if(num[2] == num2[0]){
					 s++;
				 }if(num[0] == num2[0] || num[0]== num2[1]){
					b++;
				}if(num[1] == num2[2] || num[1]==num2[0]){
					b++;
				}if(num[2]==num2[2] || num[2] ==num2[1]){
					b++;
				}
				o= 3-(s+b);
				
				System.out.println("[s] :"+ s + "[b] : "+b+ "[o] :"+ o );
							/*		for(int i= 0; i< answer.length; i++){
									for(int j=0; j< input.length; j++){
									if(answer[i]== input[j]){
											strike++;
										}else{
											ball++;					*/
						
					
				
				
				if(s == 3){
					System.out.println("정답입니다`!"); //실패
					break;
				}
				 }
		 


		 
			}
		
		
		
		 
		 }
		
		
		
		
	

