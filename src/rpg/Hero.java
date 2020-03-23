package rpg;

import java.util.Scanner;

public class Hero extends Character{
	//영웅 클래스 스텟
	public String name;
	public int hp;
	public int mp;
	public int level;
	
	public int STR;
	public int DEX;
	public int WIS;
	
	public int power;
	public int defense;
	public int money;
	public int experince;
	

	public int attack(){ 
		 //  공격 메소드	
return power;
		
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
	
	
	/*void showitem(){
		System.out.println("인벤토리--------------------- ");
		for(int i=0; i<item.length; i++){
			System.out.println(i+1 +","+ 포션 넣을거 늫ㅇ);
		}*/
	}
	
