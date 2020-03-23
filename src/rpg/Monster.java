package rpg;

public class Monster extends Character {
	public String name;
	public int hp;
	public int mp;
	public int level;
	int power;
	int money;
	int defense;
	int experiance;
	
	
	public int Attack(){ //  공격 메소드
		
		return power;
	}
	
	void defense(int damage){ //방어 메소드
		if(defense > damage){
				hp = hp-0;
		}else{
			hp = hp+ defense - damage;
		}	
	}
	
	void ht(){
		System.out.println("샤낭터에 입장하셨습니다.");
		System.out.println("1. 늑대 1~10");
		System.out.println("2. 멧돼지 21~30");
		System.out.println("3. 호랑이 30~40");
		System.out.println("사냥할 녀석을 선택해주세요.");
	}

	
}
