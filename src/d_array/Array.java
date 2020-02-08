package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 /*
		  * << 배열 >>
		  * - int[] number = new int [5];  <<대표적인 배열모습
		  * - int[] number = new int[]{10, 20, 30, 40, 50}
		  * - int[] number = {10, 20, 30, 40, 50}
		  * 배열의 길이가 한번 정해지면 길이는 줄이거나 늘릴수 없음
		  */ 
		
		// 배열은 참조형 타입
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int [5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int 를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이저장된다. int 타입의 기본값은 0이잖냐
		
		System.out.println(array);//배열의 주소가 나타남
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대크기는 int의 최대갑 (약 20억)이다.
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int []{1, 2, 3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //  선언과 초기화를 동시에 해야함
		int[] iArray3; 
			/*iArray3 = {1, 2, 3}; //컴파일 에러 발생
			*/
			
		 array[0] = 10; //인덱스는 0부터 시작
		 array[1] = 20;
		 array[2] = 30;
		 array[3] = 40;
		 array[4] = 50;
		 //array[5] = 50; //배열의 범위를 벗어나면 오류가 발생. ArrayIndexOutOfBoundsException 발생
		 
		 //정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		 int abc[] = new int[10];
		 
		 
		 //모든 인덱스에 있는 값을 변경해주세요.
		 abc[0] =1;
		 abc[1] =2;
		 abc[2] =3;
		 abc[3] =4;
		 abc[4] =5;
		 abc[5] =6;
		 abc[6] =7;
		 abc[7] =8;
		 abc[8] =9;
		 abc[9] =10;
		 //모든 인덱스에 있는 값을 더해주세요.
		 int sum=0;
		 for(int i=0; i<10; i++ ){
			 abc[i]= i;
			 sum+=abc[i];
		 }System.out.println(sum);
		 

		//index는 1씩 증가하는 규칙이 있어 for문과 함게 사용한다.
		  for(int i=0; i<abc.length; i++){
			  System.out.println(abc[i]);
		  }
			
		  for(int i=0; i<abc.length; i++){
			  abc[i] = i+1;
		  }System.out.println(Arrays.toString(abc));
			
		  
		  
		  //배열에 숫자를 저장하고 합계와 평균을 구해보자.
		  sum = 0;
		  double avg= 0;
		  
		  int[] numbers = new int[10];
		  
		  for(int i= 0; i<numbers.length; i++){
			  numbers[i] = (int)(Math.random()*100) +1;
			sum= sum +numbers[i];
			if(i == numbers.length -1){
				
			avg = (double)sum/numbers.length;
			}
		  }System.out.println(Arrays.toString(numbers));
		  System.out.println("합계"+sum +"평균"+avg);
		
		  
		  //향상된 for문
		  for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다. for(변수 : 배열) 배열에 있던 값이 변수에 넣어져서 출력이 되는 모습
			  System.out.println(number);  //배열의 타입에 맞게 변수를 설정해주자  str 변수 : str 배열 // int 변수 : int 배열
		  }												//향상된 for문은 배열을 읽을 때만 사용가능하다.
		  
		  
		  for(int number : numbers){
			  number = 0; //numbers의 값은 변경되지 않는다.
			  System.out.println(number);
		  }
		 System.out.println(Arrays.toString(numbers));
		  
		  
		  //배열의 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		  
		 int max =numbers[0];
		 int min =numbers[0];
		 
		  for(int i= 0; i<numbers.length; i++){
			  if(numbers[i]> max)
			  {
				  max = numbers[i];
			  }else if(numbers[i]<min)
			  {
				  min =numbers[i];
			  }
		  }
	System.out.println("최대값" + max +" | 최소값" +  min);
	
	
	//섞기
	int[] shuffle =new int[30];
	for(int i =0; i<shuffle.length; i++)
	{
	 shuffle[i] = i +1;	
	}System.out.println(Arrays.toString(shuffle));
	
	
	
	for(int i=0; i<shuffle.length; i++){
		int	a1 =(int)(Math.random() * 29);
		int temp= 0;
		temp = shuffle[0];
		shuffle[0] = shuffle[a1]; 
		shuffle[a1] = temp;
		
		
	}System.out.println(Arrays.toString(shuffle));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("최소 값 입력하세요");
	int z = Integer.parseInt(sc.nextLine());
	System.out.println("최대 값 입력하세요");
	int x = Integer.parseInt(sc.nextLine());
	System.out.println("반복횟수를 입력하세요");
	int y = Integer.parseInt(sc.nextLine());
	
	
	
	
	//1~10 사이의 난수를 500번 생성하고 각 숫자가 생성된 횟수를 출력해주세요.
	int[] counts = new int [10];
	
	for(int i= 0; i<500; i++){
		int random= (int)(Math.random()*10) +1;
		counts[random -1]++;
	}
	for(int i= 0; i<counts.length; i++){
		System.out.println(i+1+" : "+ counts[i]);
	}
	
	
	int c[] = new int[x-z+1];
	for(int i=0; i<y; i++){
		
		int b= (int)(Math.random()* (x-z+1)) +z;
		  c[b-z]++; 
		 
	}System.out.println(Arrays.toString(c)); 
	
	for(int i=0; i<c.length; i++){
		System.out.println(z++ +"횟수는"+c[i]+"번");
	}
	
	//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.

		
	

	
	
	
	}
	
}
	
	
		  
	
	

