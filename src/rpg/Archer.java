package rpg;

import java.util.Scanner;

public class Archer extends Hero {
String ar = "궁수";
	
	public int attack(){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 기본 화살 날리기");
		System.out.println("2. 멀티 샷");
		int voice = sc.nextInt();
		
		int damage = 1;
		
		if(voice == 1){ //기본공격
			damage = DEX + level*10 +power;
		System.out.println("데미지는 "+ damage+ "입니다 ");
		return damage;
		}
		else if(voice == 2){ // 멀티샷
			damage = (DEX+10) + level * 15+power;
			this.mp = mp - 15; // 혹시모르니 보류 지워도됨
			return damage;
		}
		System.out.println("데미지는"+ damage + "입니다");
		return damage;
	}
	
	public void defence(int fullpower){
			if(defense > fullpower){
					hp = hp-0;
					System.out.println("공격을 방어했습니다.");
			}else{
				hp = hp+ defense - fullpower;
				System.out.println("공격 당했습니다. ");
			}	
		}
	
void stat(){
		
		System.out.println("직업 : "+this.ar);
		System.out.println(" STR : "+STR);
		System.out.println(" DEX : "+this.DEX);
		System.out.println(" WIS : "+this.WIS);
		System.out.println(" 돈  : "+this.money);
		System.out.println("경험치 : "+this.experince);
		
		}
	}
	

