package z_eam;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
	
		
/*
 * 
 *[5-1] 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 . 하시오. 
 *a. int[] arr[]; 			2차원 배열을 선언할때 배열방이 타입 앞에 , 변수 앞에 넣을수있음
 * b. int[] arr = {1,2,3,};  		배열을 선언하고 배열안에 동시에 값을 넣을수 있다
 * c. int[] arr = new int[5]; 	배열을 선언하고 배열방의 크기를 나타낼수 있음
 * d. int[] arr = new int[5]{1,2,3,4,5};  d : new int[] 타입 뒤에{1,3,4,5} 를 넣어줘서 []안에 숫자를 넣을수 없다
 * e. int arr[5]; 						  e : 배열을 선언할때 배열의 크기를 정할순 없다.
 * f. int[] arr[] = new int[3][];
 * 
 * 
 * [5-2] 다음과 같은 배열이 있을 때 의 값은 얼마인가 , arr[3].length ?
int[][] arr = { { 5, 5, 5, 5, 5}, { 10, 10, 10}, { 20, 20, 20, 20}, { 30, 30} };
		답은 2 
		해설 : 2차원 배열은 배열안에 배열을 넣어주는 것이므로 arr[0] 에서 0은 값이 5개 있는 다른 배열 주소를 나타낸다
				arr[0].length = 5 , arr[1].length =3, arr[2].length =4 , arr[3].length =2   
 */
/*
 * 
 * [5-3] { public static void main(String[] args) 
 * { int[] arr = {10, 20, 30, 40, 50}; 
 * 
 * int sum = 0;
 *	/? for(int i=0; i<arr.length; i++){   //sum 의 총합
 * 		sum += arr[i];
 *
 * 
 *  System.out.println("sum="+sum);
/*
알맞은 코드를 넣어 완성하시오 (1) .
*///
/*
 * 		5-4 
 /*	int[][] arr = { { 5, 5, 5, 5, 5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30} }; 
				int total=0;
				float average= 0;
				
				for(int i=0; i<=arr.length;i++){
					for(int j=0; j<=arr[i].length; j++){
						
						total = total+ arr[i][j]; // 2중 for문 안에 있는 total 은 2차원 배열 각각의 방안에
													들어가 있는 값들을 합해준것 (arr[i][j]) i 번째 배열방 안에 있는 
													다른 배열 값들 합해줌
						
					}
					
				}average = (float)total / arr.length * arr[1].length; / i=0 인 for문으로 나온다음 평균을 구해야 한다
																	만약 j=0인 for문으로 들어가면 총합의 평균을 구하는게 아니라
																		배열방안의 합치지 않는 값들의 평균을 구함
				System.out.println(total);
				System.out.println(average);
				
/*
 * 
 */
				
		//5-5		
		/*int[] ballarr = {1,2,3,4,5,6,7,8,9}; 
		int[] ball3 = new int[3];
		 for(int i=0; i< ballarr.length;i++) 
		 { int j = (int)(Math.random() * ballarr.length); //랜덤수 설정
		 int temp = 0;
		 	
		 temp = ballarr[0];  					 변수 temp를 사용 하여 
		 ballarr[0] = ballarr[j];					겹치지 않게 썩어주는 방
		 ballarr[j] = temp; 						temp 값에 ballarr[0] 을 넣어주고
		  											ballarr[i] 값에 ballarr[j] 값을 넣어준다음
		 }											temp 안에 있는 [ballarr[0] 값을 ballarr[j] 갚에 넣어줌
		  
		 for(int i=0; i<ball3.length; i++){
			 ball3[i] =ballarr[i];
		 
		 
		 }
		  for(int i=0;i<ball3.length;i++) {
			 
			  
			  System.out.print(ball3[i]); 
		  }*/
		  
		
		/*
		 * 
		 * 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다 
		 * 변 . 수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 
		 * 계산해서 출력하라 단 가능한 한 적은 수의 동전으로 거슬러 주어야한다
		 * (1) 에 알맞은 코드를 넣어서 프로그램을 완성하시오.
[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
연습문제 [ ]/ch5/Exercise5_6.java class Exercise5_6 {
 public static void main(String args[])
  					{ 큰 금액의 동전을 우선적으로 거슬러 줘야한다 //
   					. int[] coinUnit = {500, 100, 50, 10}; 
   					
   						int money = 2680;
   					
   					 System.out.println("money="+money);
   					 
    				for(int i=0;i<coinUnit.length;i++) 
    			{ /* 알맞은 코드를 넣어 완성하시오 (1) . */  // 코드 안에는 int money의 값을 500으로 먼저 나누고
// main 
/* 																	100, 50, 10으로 순차적으로 나눈다음 
																	사용한 동전들의 수를 나타내서 출력하는 코드다
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 5-23 예제
		 * 
		 * String [][] words = { 
		 * 						{"chair", "의자"},
		 * 						{"computer", "컴퓨터"},
		 * 						{"integer", "정수"}};
		 * 
		 * 		Scanner.scanner = new Scanner(System.in);
		 * 
		 * for(int i=0; i<words.length; i++){
		 * 		System.out.printf("Q%d.	%s의 뜻은?", i+1,words[i][0]);
		 * 
		 * 		String tmp = scanner.nextLine();
		 * 
		 * 		if(tmp.equals(words[i][1])) {
		 * 
		 * 				System.out.printf("정답입니다.%n%n");
		 * 				}else {
		 * 					System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
		 * 			}
		 * 				
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
	//연습문제 7
	if(args.length!=1) { System.out.println("USAGE: java Exercise5_7 3120");
	System.exit(0); }
	
	int money = Integer.parseInt(args[0]);
	System.out.println("money="+money); 
	int[] coinUnit = {500, 100, 50, 10 }; //동전의 단위
	int[] coin = {5, 5, 5, 5};				//단위별 동전의 개수
	
	for(int i=0;i<coinUnit.length;i++) { 
		int coinNum = 0;
	coinNum	= money / coinUnit[i];										// 1. 금액 money를 동전단위로 나눠서 필요한 개수를 (coinNUM)를 구함
		if(coin[i] > coinNum){
			coin[i]= coin[i] - coinNum;// 								2. 배열coin  에서 coinNum 만큼의 동전을 뺀다 
																	//(만일 충분한 동전이 없다면 배열(coin)에 있는 만큼만 뺀다
		}else{
			coinNum = coin[i];
			coin[i] = 0;
		}
		money = money - (coinNum * coinUnit[i]);									// 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
		
	
	
	
	 System.out.println(coinUnit[i]+" 원: "+coinNum);
	} 

if(money > 0) {
	 System.out.println(" 거스름돈이 부족합니다 ."); 
	 System.exit(0); 
	}
	 System.out.println("=남은 동전의 개수 ="); {
		 
	
		 
		 
		 
		//연습문제 8 
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2} ;
		int[] counter = new int[4];
		
		for(int i= 0; i<answer.length; i++){
			counter[answer[i]-1]++;
			
		}
		
		for(int i=0; i<counter.length; i++){
			System.out.println(counter);
			for(int j=0; j<counter[i]; j++){
				System.out.print("*");
			}System.out.println();
		}
		 

// 연습문제 9
		
		char[] abcCode = { '`','~','!','@','#','$','%',
				'^','&','*', '(',')','-','_','+',',','=',
				'|','[',']','{', '}',';',':',',','.','/'};
									// 0 1 2 3 4 5 6 7 8 9 
				char[] numCode = {'q','w','e','r','t','y','u','i','o','p'}; 
		String src = "abc123";
		String result = "";
		//문자열 의 문자를 으로 하나씩 읽어서 변환 후 result에 저장 
		for(int i=0; i < src.length();i++) { 
			char ch = src.charAt(i);
			
			
			
			if('a'<= ch && ch<='z' )
			{
				result = result + abcCode[ch-'a'];
			}else if('1'<ch && ch<='9'){
				result = result + numCode[ch -'0'];
			}
		
		
		} 
		System.out.println("src:"+src); 
		System.out.println("result:"+result); 
		
		
		
		
		//문제 1
		int [] arr ={10,20,30,40,50};
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	}
	}
}