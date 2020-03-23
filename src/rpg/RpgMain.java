package rpg;

import java.util.Scanner;

import rpg.map.PotionStore;
import rpg.map.WeaponStore;

public class RpgMain {

	public static void main(String[] args) {
		System.out.print("Loading");
		  for (int i = 0; i < 30; i++) {
		   System.out.print("▶");
		   dsa1(); //쓰레드 슬립 하게해주는 메소드
		  }
		  System.out.println();
		  System.out.println();	
		  
		  login log = new login();
		  log.Insert();
		  
	System.out.println("■■■■■■■■■■■■■■■■■");
	dsa();
	System.out.println("■□□□□■□□□□■□□□□□■");
	dsa();
	System.out.println("■□■■□■□■■□■□■■■□■");
	dsa();
	System.out.println("■□■■□■□■■□■□■■■■■");
	dsa();
	System.out.println("■□□□■■□□□□■□■□□□■");
	dsa();
	System.out.println("■□■■□■□■■■■□■■■□■");	
	dsa();
	System.out.println("■□■■□■□■■■■□□□□□■");
	dsa();
	System.out.println("■■■■■■■■■■■■■■■■■");
	
	System.out.println("┌──────────────┐");
	System.out.println("│1. 전사                     │");
	System.out.println("│2. 궁수                     │");
	System.out.println("│3. 마법사                   │");
	System.out.println("│4. 도적	              │");
	System.out.println("│직업을 선택 하세요          │");
	System.out.println("└──────────────┘");
	Scanner sc = new Scanner(System.in);
	 Hero hero = new Hero();
	
	int number = sc.nextInt();
	
	if(number ==1){
		System.out.println("전사가 선택되었습니다.");
		  hero = new Warrior();
		hero.hp = 150;
		hero.level =1;
		hero.defense = 10;
		hero.mp = 25;
		hero.STR = 20;
		hero.DEX = 10;
		hero.WIS = 5;
		hero.power = (hero.STR + hero.DEX + hero.WIS /3)+(hero.level*3);
		
		}
	
	if(number == 2){
		System.out.println("궁수가 선택되었습니다.");
		 hero = new Archer();
		hero.hp = 120;
		hero.level =1;
		hero.defense = 15;
		hero.mp = 50;
		hero.STR = 10;
		hero.DEX = 15;
		hero.WIS = 10;
		hero.power = (hero.STR + hero.DEX + hero.WIS /3)+(hero.level*3);
		}
	
	if(number == 3){
		System.out.println("마법사가 선택되었습니다.");
		 hero = new Magician();
		hero.hp = 100;
		hero.level =1;
		hero.defense = 5;
		hero.mp = 150;
		hero.STR = 5;
		hero.DEX = 5;
		hero.WIS = 25;
		hero.power = (hero.STR + hero.DEX + hero.WIS /2)+(hero.level*3);
	}
	System.out.println("영웅의 이름을 입력하세요");
	Scanner sc1 = new Scanner(System.in);
	hero.name = sc1.nextLine();
	System.out.println("이름 입력 완료");
	System.out.println(" 게 임 S T A R T");
	
	while(true){
		hero.money= hero.money+5000000; //돈넣어주는거
		//능력치
		System.out.println("┌──────────────┐");
		System.out.println(" 영웅 이름 : "+hero.name);
		System.out.println("    lv     : "+hero.level);
		System.out.println("    hp     : "+hero.hp);
		System.out.println("    mp     : "+hero.mp);
		System.out.println("    힘     : "+hero.STR);
		System.out.println("    민첩   : "+hero.DEX);
		System.out.println("    지능   : "+hero.WIS);
		System.out.println(" 공 격 력  : "+hero.power);
		System.out.println(" 방 어 력  : "+hero.defense);
		System.out.println(" 보유 금화 : "+hero.money);
		System.out.println(" 경 험 치  : "+hero.experince);
		System.out.println("└──────────────┘");
		
		choice(); //이동경로
		
		number= sc.nextInt();
		if(number==1){
			Monster monster = new Monster();
			
			monster.ht();
			number= sc.nextInt();
			if(number ==1){
				String[] wolf = {"흰늑대","거치늑대","일반늑대"};
				monster = new Wolf();
				monster.name = wolf[(int)(Math.random()*4)];
				monster.level = (int)(Math.random()*10)+1;
				monster.power = monster.level+25;
				monster.hp = monster.level * 10 + (int)(Math.random()*60)+40;
				monster.defense = monster.level *3 + 10;
				monster.mp = 40;									
			}
			if(number ==2){
				String[] pig = {"흰멧돼지","거친멧돼지","일반멧돼지"};
				monster = new Wildpig();
				monster.name = pig[(int)(Math.random()*4)];
				monster.level = (int)(Math.random()*20)+11;
				monster.power = monster.level+40;
				monster.hp = monster.level * 10 + (int)(Math.random()*100)+50;
				monster.defense = monster.level *3 + 30;
				monster.mp = 100;									
			}
			if(number ==3){
				String[] tiger1 = {"흰색호랑이","굶주린호랑이","호돌이"};
				monster = new tiger();
				monster.name = tiger1[(int)(Math.random()*4)];
				monster.level = (int)(Math.random()*30)+21;
				monster.power = monster.level+60;
				monster.hp = monster.level * 10 + (int)(Math.random()*120)+100;
				monster.defense = monster.level *3 + 50;
				monster.mp = 150;								
			}
			//전투시작
			while(true){
			System.out.println("당신의 선공입니다.");
			
			
						
				if(monster.hp<=0){ //몬스터 죽음
					hero.money = hero.money+ monster.money;
					hero.experince = hero.experince + monster.experiance;
					System.out.println("몬스터가 처치되었다.");
					System.out.println("골드가"+monster.money+ "만큼 증가했습니다.");
					System.out.println("경험치가 "+monster.experiance+"만큼 증가했습니다.");
					break;
				}
				System.out.println("몬스터의 공격입니다.");
			
				//영웅 죽음
				if(hero.hp<=0){
					System.out.println(hero.name+"이 죽었습니다.");
					hero.hp= 10;
					System.out.println("체력이10상태로 부활했습니다.");
					hero.experince= hero.experince -hero.experince/5;
					System.out.println("경험치가 20% 줄어들었습니다.");
					break;
				}
			}
		}
		else if(number ==2){ 
			WeaponStore wea = new WeaponStore();
			System.out.println("┌――――――――――――――――――――――――――┐");
			System.out.println("무기상점입니다. 무엇을 도와드릴까요?");
			System.out.println("[1] 일반 무기  가격 2500원 ");
			System.out.println("[2] 레어 무기  가격 5000원 ");
			System.out.println("[3] 유니크 무기 가격 5000원 ");
			System.out.println("[4] 전설 무기   가격 99999원 ");
			System.out.println("[5] 일반 방어구 가격 2500원 ");
			System.out.println("[6] 레어 방어구 가격 5000원 ");
			System.out.println("[7] 유니크 방어구 가격 10000원 ");
			System.out.println("[8] 전설 방어구  가격 99999원 ");
			System.out.println("[9] 나가기");
			System.out.println("└――――――――――――――――――――――――――┘");
			number = sc.nextInt();
			int temp = hero.money;
			if((hero.money =wea.ShowWs(hero.money, number))!= -1){
				
				System.out.println("구입이 완료 되었습니다.");
				if(number ==1){
					hero.power+= 10;
				}
				if(number ==2){
					hero.power+= 70;
				}
				if(number ==3){
					hero.power+= 300;
				}
				if(number ==4){
					hero.power+= 9999;
				}
				if(number ==5){
					hero.defense+= 10;
				}
				if(number ==6){
					hero.defense+= 70;
				}
				if(number ==7){
					hero.defense+= 300;
				}
				if(number ==8){
					hero.defense+= 9999;
				}
				}else{
					System.out.println("돈이 부족합니다");
					hero.money = temp;
				}     
		}
			//포션상점
			else if(number ==3){
				PotionStore pt = new PotionStore();
				System.out.println("┌――――――――――――――――――――――――――┐");
				System.out.println("포션상점입니다. 무엇을 도와드릴까요?");
				System.out.println("[1] 파워 포션 , 가격 200원 ");
				System.out.println("[2] 방어 포션 , 가격 150원 ");
				System.out.println("[3]  힘  포션 , 가격 100원 ");
				System.out.println("[4] 민첩 포션 , 가격 100원 ");
				System.out.println("[5] 지능 포션 , 가격 100원 ");
				System.out.println("[6] 체력 증가 포션, 가격 200원 ");
				System.out.println("[7] 마나 증가 포션, 가격 200원 ");
				System.out.println("[8] 경험치 포션 , 가격 250원 ");
				System.out.println(" 원하는 물건 고르세요");
				System.out.println("└――――――――――――――――――――――――――┘");
				
				number = sc.nextInt();
				int temp1 = hero.money;
				if((hero.money = pt.ShowPs(hero.money,number)) !=-1){
					
					System.out.println("구입이 완료되었습니다.");
					if(number ==1){
						hero.power+= 10;
					}
					if(number ==2){
						hero.defense+= 10;
					}
					if(number ==3){
						hero.STR+= 20;
					}
					if(number ==4){
						hero.DEX+= 20;
					}
					if(number ==5){
						hero.WIS+= 30;
					}
					if(number ==6){
						hero.hp+= 50;
					}
					if(number ==7){
						hero.mp+= 50;
					}
					if(number ==8){
						hero.experince+= 50;
					}
					
			}else{
				System.out.println("돈이 부족합니다.");
				hero.money =temp1;
			}
		}
			if(hero.experince >= hero.level*100){
				hero.level+=1;
				System.out.println("영웅의 레벨이"+hero.level+ "로 승급");
			hero.money+= hero.level*50;
			hero.STR+= 2; hero.DEX+=2; hero.WIS+=2;
			hero.defense+=5;
			System.out.println("스텟 힘 2 민첩 2 지혜 2 씩 증가");
			System.out.println("방어력 5 증가 하였습니다.");
			hero.experince=0;
			}
			
		}
	}
	
	
	
	
	
	
	
	static void dsa(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	static void dsa1(){
		try {
			Thread.sleep(75);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	static void choice(){
		System.out.println("┌──────────────┐");
		System.out.println("1. 사냥터");
		System.out.println("2. 무기상점");
		System.out.println("3. 포션상점");
		System.out.println("입장할 장소를 선택해 주세요");
		System.out.println("└──────────────┘");
	}
	
	

}
