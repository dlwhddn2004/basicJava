package a_variable;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1, c2, c3; // 난수

		int h1, h2, h3; // 입력하는 부분

		int s, b, o; // 스트라이크, 볼

		int count = 0; // ~번만에 맞추셨습니다. 계속 증가하니까 초기값을 입력.



		c1 = (int) (Math.random() * 10)+1;

		do {

			c2 = (int) (Math.random() * 10)+1;

		} while (c2 == c1);

		do {

			c3 = (int) (Math.random() * 10)+1;

		} while (c3 == c1 || c3 == c2); // 겹치지 않도록 반복문으로 걸러준다.



		Scanner sc = new Scanner(System.in);

		do {

			s = b = 0;

			System.out.print("0-9사이의 중복되지 않은 숫자 3개 입력 ex. 1 2 3 > ");

			h1 = sc.nextInt();

			h2 = sc.nextInt();

			h3 = sc.nextInt();



			if (h1 == c1) {

				s++;

			} else if (h1 == c2 || h1 == c3) {

				b++;

			}



			if (h2 == c2) {

				s++;

			} else if (h2 == c1 || h2 == c3) {

				b++;

			}



			if (h3 == c3) {

				s++;

			} else if (h3 == c1 || h3 == c2) {

				b++;

			}	
			o= 3-(s + b);
			

			System.out.println("["+s+"S "+b+"B]"+o+"B]");

			count++;

		} while (s != 3); // s는 3이 아니다. s < 3

		

		System.out.println("축하합니다. "+count+"번 만에 맞추셨습니다.");
		
		           
	}
	}


