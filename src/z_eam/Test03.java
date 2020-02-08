package z_eam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
	static int strike, ball, out;
	 
    final static int chances = 7;
    
	public static void main(String[] args) {
		
	 
	   
	        Random r = new Random();
	        Scanner sc = new Scanner(System.in);
	        int ranNum;
	 
	        while (true) {
	            System.out.println("[야구 게임 시작!!]");
	            ArrayList<Integer> computer = new ArrayList<Integer>();
	            ArrayList<Integer> user = new ArrayList<Integer>();
	            boolean[] check = new boolean[10];
	 
	            // System.out.println(ranNum);
	            for (int i = 0; i < 3; i++) {
	                do {
	                    ranNum = r.nextInt(10);
	                } while (check[ranNum] == true);
	 
	                check[ranNum] = true;
	                computer.add(ranNum);
	            }
	            try {
	                for (int chance = 1; chance <= chances; chance++) {
	                    strike = ball = out = 0;
	                    
	                    System.out.println("\n<" + chance + "번째 시도>" );
	                    System.out.print("숫자 3개 입력 : ");
	 
	                    for (int i = 0; i < 3; i++)
	                        user.add(sc.nextInt());
	 
	                    Iterator<Integer> it = computer.iterator();
	                    Iterator<Integer> it2 = user.iterator();
	 
	                    while (it.hasNext()) {
	                        int comNum = it.next();
	                        int userNum = it2.next();
	 
	                        if (comNum == userNum)
	                            strike++;
	                        else {
	                            if (user.contains(comNum) == true)
	                                ball++;
	                            else
	                                out++;
	                        }
	                    }
	 
	                    if (strike == 3) {
	                        System.out.println("정답입니다.");
	                        break;
	                    } else
	                        System.out.println(strike + " strike  " + ball + " ball  " + out + " out");
	 
	                    System.out.printf("남은 기회 : %d\n", chances-chance);
	                    user.clear();
	                }
	 
	                System.out.println("정답 : " + computer.toString());
	                System.out.println("1. 게임 재시작");
	                System.out.println("2. 게임 종료");
	 
	                int select = sc.nextInt();
	 
	                if (select == 1)
	                    continue;
	                else if (select == 2)
	                    System.exit(0);
	 
	            } catch (InputMismatchException ex) {
	                System.out.println("input error!");
	                sc.nextLine(); // 버퍼 비우는 작업
	                System.exit(0);
	                continue;
	            }
	        }


	

	}

	}

