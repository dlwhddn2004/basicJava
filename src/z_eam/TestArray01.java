package z_eam;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray01 {

	public static void main(String[] args) {

		//문제 1
				int [] arr ={10,20,30,40,50};
				int sum = 0;
				for(int i=0; i<arr.length; i++){
					sum += arr[i];
				}System.out.println(sum);
				
		//문제2
			 
				String a [] = new String[5];
				Scanner sc = new Scanner(System.in);
				
				
				
			for(int i=0; i<a.length; i++){
				a[i] = sc.nextLine();
				
			}
	

	
	//문제3
	
		int [] score ={79,88,91,33,100,55,95};
		int max =score[0];
		int min =score[0];
		
		
		for(int i=0; i<score.length; i++){
			if(score[i]>max){
				max = score[i];
				
			}
			if(score[i]< min){
				min = score[i];
			}
		}
		System.out.println(max+","+min);
		
		//문제 4
		
		int[][] arr2 = {
			    {5,5,5,5,5},
			    {10,10,10,10,10},
			    {20,20,20,20,20},
			    {30,30,30,30,30}
			 };

			int sum1[] = new int[arr2.length];
			double avg[] = new double[arr2.length];
			
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2[i].length; j++){
				
				sum1[i]+= arr2[i][j];
			}
			 avg[i] = (double)sum1[i] / arr2[i].length;
		} System.out.println(Arrays.toString(avg));
		
		
		//문제 5

int[] answer= {4,3,2,5,2,4,3,1};
int[] counter = new int[4];

	for(int i=0; i<answer.length; i++){
		counter[answer[i]-1]++;
	}
		for(int i=0; i<counter.length; i++){
			System.out.println(counter);
			for(int j=0; j<counter[i]; j++){
				System.out.print("*");
			}System.out.println();
		}
	//문제 6번

String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
// menu배열에서 메뉴이름과 가격중 메뉴이름을 추출하는 프로그램을 작성하세요.

		for(int i=0; i<menu.length; i++){
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			
			
		}
		
		//문제 7번
		String str="i Love Java";
		
		String sr1 = str.substring(str.indexOf("J"),11);
		
		System.out.println(sr1);
		
		
	}	
}
