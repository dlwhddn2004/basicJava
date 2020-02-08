package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 *  << 다차원 배열 >>
		 * 	배열안에 배열이 저장되어 있는 형태이다.
		 * 
		 */
		
		int [][] numbers = new int[2][3]; //2칸짜리 배열 안에 칸마다 3칸짜리 배열이 생성된다.
		int nubmers2[][] = new int[][]{ {1,2,3}, {4,5,6} }; //값의 개수로 배열의 길이가 정해진다.
		int []number3[] = {{1,2,3}
					      ,{4,5,6}
						  ,{7,8,9}};
		
		int[][]numbers4 = new int[3][];//가변 배열
		numbers[0] = new int [3];
		numbers[1] = new int [4];
		//numbers[2] = new int [10]; //길이를 다르게 지정할수 있다.
		
		//numbers[0] = 10; 1차원에 값을 저장 할수 없다. 
		numbers[0] = new int[5]; //1차원에 배열을 저장 할 수 있다.
		numbers[0][0] = 10; 	 // 2차원에 값을 저장 할 수 있다.
		numbers[0][1] = 20;
		numbers[1][0] = 100;
		
		//numbers 배열에 저장된 값의 모양을 적어주시오.
		//{{10,20,0,0,0} ,{ 100,0,0,0 }}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));
		}
	 
		for(int i=0; i< numbers.length; i++){ //2차원 배열의 모든 인덱스에 접근
			for(int j =0; j<numbers[i].length; j++){
				numbers[i][j] = (int)(Math.random()*100) +1;
				System.out.println(numbers[i][j]);
			}
		} 
		
		//1차원의 길이는 3이고 2차원의길이는 5인  배열을 만들고 모든 인덱스에 1~100 사이의 랜덤수
		
		int [][]korea = new int[3][5];  //ctrl +1 하면 변수 이름 바꾸기 가능
		
		for(int i=0; i<korea.length; i++){
			for(int j=0; j<korea[i].length; j++){
				korea[i][j] = (int)(Math.random()*100) +1;
				
			}System.out.println(Arrays.toString(korea[i]));
		}
		
		
		
int [][]park = new int[3][5];  //ctrl +1 하면 변수 이름 바꾸기 가능

int [] sum = new int[park.length];
double [] avg = new double[park.length];

for(int i=0; i<park.length; i++){
	for(int j=0; j<park[i].length; j++){
		park[i][j] = (int)(Math.random()*100) +1;
		sum[i]+= park[i][j];
		
	
	}avg[i] = (double)sum[i] / park[i].length;
	System.out.println(Arrays.toString(park[i]));
}
System.out.println(Arrays.toString(sum));
System.out.println(Arrays.toString(avg));
	
		
		
	}

}
