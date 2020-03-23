package game;
import java.util.Scanner;

public class GameStart {
	Scanner sc = new Scanner(System.in);
	String name;
static	int hp = 100;
static	int attack = (int)(Math.random() *15) + 5;
static	int t = 0;
static	int h = 0;
	String[] m = { "보통좀비","강한좀비","미친좀비","호구좀비" };
	int h1 =(int)(Math.random()* 40)+15;
	int zbatk = (int)(Math.random()* 20) + 2;
	
	int b= 60; //보통 빵
	

	
	void gamestrat () throws InterruptedException {
		System.out.println();
		System.out.println("당신은 어제 과제로 인해 늦게 잠을 잤습니다.");
		System.out.println("깨어나보니 창문 밖은 온통 불바다에 시민들의 비명만 들린다...");
		System.out.println("혼란 스러운 그때 ,마침 TV 소리엔 좀비바이러스가 퍼져 ");
		System.out.println("밖은 위험하니 집에서 대기하라는 뉴스가 나온다");
		System.out.println("정부의 말을 불신하는 당신 ! 서울을 탈출하기로 마음 먹는데....");
		Thread.sleep(1000);
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■ 운빨 좀비 탈출 게임■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■");	
		gamestart2();
		
}
	String gamestart2() { //선택창?
		 System.out.println("이름을 입력해주세요");	
		name = sc.nextLine();
		
		gamestart4();
		return name;
		
	}
	void gamestart3() {	
		
		System.out.println("이름 : " +name);
		System.out.println("---능 력 치---");
		System.out.println("♥ :"+ hp);
		System.out.println("공격력 :"+ attack);
		System.out.println("피로도 :"+ t);
		System.out.println("배고픔 :" +h);
		
		
		
		
	}

	void gamestart4() {
			gamestart3();
		System.out.println("이동경로를 선택하시오");
		System.out.println("[1] 집에서 머물기 [2] 밖으로 나가기");
		String a = sc.nextLine();
		if(a.equals("1")) {
			System.out.println("...집에서 머물면 답도 없어 다시 생각해보자");
			System.out.println();
			gamestart4();
		}else if(a.equals("2")){
			gamestart5();
		}
	}
	
	void gamestart5() {
		for(int i=0; i<2; i++) {
			System.out.println();
		}
		System.out.println(name+ " 집밖의 풍경은 어두선하고 시민들의 괴성만 들렸다...");
		System.out.println("이동경로를 선택하시오 ");
		System.out.println("[1] 마트 이동 [2] 경찰서 이동 [3] 집 으로 돌아가기" );
		 String b = sc.nextLine();
		if(b.equals("1")) {
			System.out.println("마트에서 당신은 좀비를 만났습니다!!");
		t+= (int)(Math.random() *30) + 1;
		h+= (int)(Math.random() *30) + 1;
		System.out.println("피곤함이 "+t+" 증가하였습니다");
		System.out.println("배고픔이 "+h+ " 증가하였습니다");
		gamestart6();
		}
		if(b.equals("2")) {
			gamestart8();
		}
		if(b.equals("3")) {
			gamestart4();
		}
	}
	void gamestart6(){
		 
		System.out.println("!!!");
		 
		 System.out.println("심장이 급격히 뛰기 시작했습니다. 현재 HP"+hp);
		 System.out.println("[TIP] 주먹보단 발차기가 더 쌘가?");
		 System.out.println("좀비가 당신을 보기 시작했습니다 전투를 준비하세요");
		 gamestart7();
		 }
	
	void gamestart7(){
		System.out.println("************************************");
		String zombie = m[(int)(Math.random()*4)+1]; //랜덤 좀비이름 넣기
		
		 for(int i=10; i>0; i-- ) {
			 System.out.println(" [1] 맨손 어택 [2] 발차기");
				String atkk = sc.nextLine();
				h1= h1-attack+ 1;
				hp= hp-zbatk;
				System.out.println("좀비를 "+attack+ " 만큼 공격 했다." );
				System.out.println("좀비에게 공격당했다 현재체력 : "+hp);
		 if(h1< 1) {
			 System.out.println(zombie + "를 죽였다");
			 	break;
		 }else {
			 System.out.println("현재 " +zombie+" 체력은"+ h1 + " 이다"); 
		 }if(hp<0) {
			 System.out.println(name+"은 처참하게 좀비의 먹잇감이 되었다.");
			 gamestart10();
		 }}
		 System.out.println("이름 : " +name);
			gamestart3();
			System.out.println("좀비에게 승리했습니다");
 System.out.println("이동경로를 말해주세요");
		 System.out.println("[1] 마트 상품코너 가기 [2] 나가기");
		String move1 = sc.nextLine();
		if(move1.equals("2")){
			gamestart5();
		}else{
			mart();
		}
		
	}
	void gamestart8() {
		System.out.println("당신은 경찰서에 도착했습니다.");
		System.out.println("총을 발견했습니다!! ");
		attack = 100;
		System.out.println("좀비들 사냥하시겠습니까?");
		System.out.println("[1] 사냥한다. [2]  총소리가 너무 커 돌아가자");
		
	}
	void gamestart10(){
		System.out.println("좀비 처절하게 싸운 당신... 안타깝게 사망");
		System.out.println("다시하겠습니까? ");
		System.out.println("[1]. YES [2]. NO");
		String zx = sc.nextLine();
		if(zx.equals("1")) {
			gamestart2();
		}else {
			System.out.println("THE END");
		}
		
	}
	void mart(){
		gamestart3();
		System.out.println("마트 안에는 다행히도 빵이 있었습니다 드시겠습니까?");
		System.out.println("[1] 먹는다 [2]. 안먹는다" );
		String ab = sc.nextLine();
		if(ab.equals("1")){
			System.out.println("생명력이 회복했습니다.");
			hp+=60;
			h-= 20;
			gamestart3();	
		}
		else{
			System.out.println(name+ "은 혹시 바이러스에 감염될까 애써 배고픔을 억누르며 지나간다...");
			t+= (int)(Math.random() *30) + 1;
			h+= (int)(Math.random() *30) + 1;
			System.out.println("피곤함이 "+t+" 증가하였습니다");
			System.out.println("배고픔이 "+h+ " 증가하였습니다");
			
			System.out.println("[피곤함 OR 배고픔 이 100이 되면 죽습니다.]");
			gamestart3();
			
			
		 ending();
		}
	}
	void ending(){
		System.out.println("당신은 배고픔과 정신이 아득해지는걸 느낀순간");
		System.out.println("마트 앞 대문에서 쾅쾅 소리가 났습니다....");
		System.out.println("두려움에 떨었던 그때....");
		System.out.println("문이 열리며 군인들이 나타났습니다 ");
		System.out.println(" 당신은 구출되었습니다");
		System.out.println("축하합니다 살아났습니다.");
	}
	
	void live(){
		
		System.out.println("현재 배고픔 : "+h);
		System.out.println("현재 피곤함 : "+t);
	}
}
	