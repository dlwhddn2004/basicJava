package rpg;

import java.util.Scanner;

public class Warrior extends Hero{ //전사클래스

	String ar = "전사";
	
	
	public int attack(){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 기본 가로 Bash");
		System.out.println("2. 이중 대각 Bash");
		int voice = sc.nextInt();
		
		int damage = 1;
		
		if(voice == 1){ //기본공격
			damage = STR + level*10 +power;
		System.out.println("데미지는 "+ damage+ "입니다 ");
		return damage;
		}
		else if(voice == 2){ // 이중 베쉬
			damage = (STR+10) + level * 15+power;
			this.mp = mp - 15; // 혹시모르니 보류 지워도됨
			return damage;
		}
		System.out.println("데미지는"+ damage + "입니다");
		return damage;
	}
	
	public void defence(int damage){
			if(defense > damage){
					hp = hp-0;
					System.out.println("공격을 방어했습니다.");
			}else{
				hp = hp+ defense - damage;
				System.out.println("공격 당했습니다. ");
			}	
		}
	
		public void abc(){
			this.STR = 10;
			System.out.println(STR);
		}
	}
	