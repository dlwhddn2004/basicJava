package z_eam;

public class Exam04 {

	public static void main(String[] args) {
	/*
	 * 4.1
	 * 	1. 	(x>10 && x<20)
	 * 	2. !(ch == ' ' || ch '\t')
	 * 	3. ch == 'x' || ch == 'X'
	 * 	4.  '0'<= ch && ch<='9'
	 *  5. ('a'<=ch && ch <='z') || ('A'<=ch && ch<='Z')
	 *  6. year%400 == 0 || year%4 == 0 && year%100!=0
	 *  7. powerOn ==false
	 *  8.  str.equals("yes")  
	 *  
	 *  [4-2] 부터 까지의 정수 중에서 또는 의 배수가 아닌 수의 총합을 구하시오 
	 *   
	 * 			int sum = 0;
				for(int i=1; i<=20; i++)
				{
					if(i%2 != 0 && i%3 !=0 )
					{
						sum+=i;
						System.out.println(sum); 답 73
					}
				}
		[4-3] 의 결과를 계산하시오 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)계산하시오.
				sum = 0;
				
			for(int i=1; i<=10; i++)
		{
			sum = sum +i;
			}
			System.out.println();
		           답 : 220
		
	 *  
	 *  
	 * [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 1+(-2)+3+(-4)+...
	 *    , 이상이 되는지 구하시오 
	 *  int sum=0;
		int i= 0;
		
		while(sum<100){
			i++;
			if(i%2==1){
				sum = sum + i;
			}else{
				sum = sum -i;
			}			
		}
		System.out.println(i);
	 *  답 199
	 *  
	 *  [4-5] 다음의 for문을 while문으로 변경하시오
	 *  
	 *	  int i=0;
	 *		while(i<=10){
	 *		int j= 0;
	 *		while(j<=i){
	 *			System.out.print("*");
	 *			j++;
	 *		}
	 *		System.out.println();
	 *		i++;
	 *	}
	 *	[4-6] 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력	
	 *  	for(int i =1; i<=6; i++){
	 *  		for(int j=1; j<=6; j++){
	 *  			if(i+j ==6){
	 *  			System.out.println(i+","+j);	
	 *  		}
	 *  	}
	 *  }
	 *  
	 *  [4-7] -
	 *  int value = (int)(Math.random()* 6)+1; -> 답 : (int)(Math.random()*6)+1;
		System.out.println("value:"+value); 		
	 *  
	 *  [4-8]
	 *  for(int x=0; x<=10; x++){
	 *  for(int y=0; y<=10; y++){
	 *  	if((2*x)+(4*y)==10){
	 *  		System.out.println("X=" + x +","+ "y" + y)
	 *  	}
	 *    }
	 * }
	 * [4-10]
	 * 		while(0<num){
					 sum = sum + num%10;
					num = num/10;	 
				}
				System.out.println(sum);
	 * 
	 * [4-11]
	 * 	int num1 = 1;
		int num2 = 1;
		int num3 = 0;
				System.out.print(num1 + ","+num2);
		
		for(int i=0; i<8; i++){
			 num3 = num1 + num2;
			 System.out.print(","+ num3); 
			 num1 = num2;
			 num2 = num3;
			 
	 * 
	 * [4-14]
	 * 	int answer = (int)(Math.random()* 100) +1;
	 * 
	 *  if(input > answer){
				System.out.println("더 작은 수를 입력하시오");
			}else if(input < answer){
				System.out.println("더 큰수 수를 입력하시오");
			}else{
				System.out.println("맞췄습니다");
				System.out.println("시도 횟수는"+count);
				break;
				
		[4-15]
		int number = 12321; 
		int tmp = number;
		int result =0; 
		while(tmp !=0) {
			result = result *10 +tmp%10;
			tmp = tmp/10;
			 } 
		if(number == result){
			System.out.println( number + "  는 회문수 입니다.");
		}else {
			System.out.println( number + "는 회문수가 아닙니다 ."); 
		}
		답 reult =reult *10 + tmp %10;
			tmp= tmp/10;
	 */ 
		/*
		int sum=0;
		int i= 0;
		
		while(sum<100){
			i++;
			if(i%2==1){
				sum = sum + i;
			}else{
				sum = sum -i;
			}			
		}
		System.out.println(i);
		*/
		
		
		
		
		/*int sum = 0;
		for(int i=1; i<=20; i++)
		{
			if(i%2 != 0 && i%3 !=0 )
			{
				sum+=i;
				System.out.println(sum);
			}
		} 
		sum = 0;
		int ty = 0;
		for(int i=1; i<=10; i++)
		{
			sum = sum +i;
			ty+= sum;
			System.out.println(ty);
		}
		
		for(int i=1; i<=100; i++)
		{
			if(sum =100){
				
			}
		}*/

		 // end of main } // end of class
/*		
	int a =0;
	while(a<=10){
		b1=0;
		while(b1<=a)
		{
		System.out.println("*");
		b1++;	
		}
		System.out.println();
		a++;
		}
	*/
	/*	for(int i=1; i<=6; i++){
			
			for(int j=1; j<=6; j++){
				if(i+j==6){
					System.out.println(i+","+j);
			}
		}
		
	}*//*
		int value = (int)(Math.random()* 6)+1; 
		System.out.println("value:"+value);
*/
	/*	
		for(int x=0; x<=10; x++){
			
			for(int y=0; y<=10; y++){
				if((2*x)+(4*y)==10)
				{
					System.out.println("X ="+x+ "y="+y);
				}
			}
		}	
			int num =12345;
			int sum = 0;
			int temp = 0;
			for(int i=0; num%10 !=0; i++){
				temp =num%10;
				num/=10;
				sum+=temp;
				
				while(0<num){
					 sum = sum + num%10;
					num = num/10;	 
				}
				System.out.println(sum);*/
		
		/*int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ","+num2);
		for(int i=0; i<8; i++){
			 num3 = num1 + num2;
			 System.out.print(","+ num3); 
			 num1 = num2;
			 num2 = num3;
			 
		int answer = (int)(Math.random()* 100) +1;
		int input = 0;
		int count = 0;
		java.util.Scanner s = new java.util.Scanner(System.in); 
		do{
			count++;
			System.out.println("1과 100사이의 값을 입력해라:");
			input = s.nextInt();
			if(input > answer){
				System.out.println("더 작은 수를 입력하시오");
			}else if(input < answer){
				System.out.println("더 큰수 수를 입력하시오");
			}else{
				System.out.println("맞췄습니다");
				System.out.println("시도 횟수는"+count);
				break;
			}
		}while(true);*/
		/*int number = 12321; 
		int tmp = number;
		int result =0; 
		while(tmp !=0) {
			result = result *10 +tmp%10;
			tmp = tmp/10;
			 } 
		if(number == result){
			System.out.println( number + "  는 회문수 입니다.");
		}else {
			System.out.println( number + "는 회문수가 아닙니다 ."); 
		}*/
			}
		}

