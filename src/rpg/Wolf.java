package rpg;

	public class Wolf extends Monster{

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
	}

