package i_colletion;

import java.util.ArrayList;

public class ArrayListClass {

	/*
	 * add()	: 마지막 위치에 객체를 추가
	 * get()	: 지정된 위치의 객체를 반환
	 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
	 * remove() : 지저된 위치의 객체를 제거
	 * size 	: 저장된 객체의 수 반환
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Object> list =new ArrayList<Object>();
		
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass());
		
		//한가지 타입만 지정하는게 좋음
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456"); //set(인덱스번호, 저장하거나 수정할 값)
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i)); //add 저장 , get 반
		}
		
		list2.remove(0); //0인덱스가 삭제되면 1번인덱스의 값이 0번인덱스로 채워진다 (동적배열)
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//Array list로 2차원 배열만들기 ->list안에 list를 만들면됨
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		
		list3.add(list4); // list3은 현재 인티저타입의 arraylist가 1개 들어가있음
		
		list4 = new ArrayList<>();
		list4.add(30);
		list4.add(40); 
		
		list3.add(list4); // list3은 현재 인티저타입의 arraylist가 2개 들어가있음
		
		//정수를 저장할 수 있는 ArrayList를 생성해 (1~100)랜덤한 값을 5번 저장해주세요.
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=0; i<5; i++ ){
			a.add((int)(Math.random()*100)+1);
			System.out.println(a.get(i));
		}
		
		//위에서 만든 ArrayList에 저장된 값들의 합계와 평균을 출력해주세요.
		int sum =0;
		int avg =0;
		
		for(int i=0; i<a.size(); i++){
			
			sum = a.get(i)+ sum;
			avg = sum / a.size();
		}System.out.println("합계는" + sum);
		System.out.println("평균은"+ avg);
		
		
		//위에서 만든 ArrayList에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
		int max=0;
		int min=a.get(0);
		for(int i=0; i<a.size(); i++){
			if(a.get(i)> max){
				max = a.get(i);
			}
			else if(a.get(i)<min){
				min = a.get(i);
			}
		}
		System.out.println("최소값"+ min);
		System.out.println("최대값"+ max);
		
	}

}
