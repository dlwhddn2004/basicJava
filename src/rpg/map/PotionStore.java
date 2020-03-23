package rpg.map;

import java.util.Scanner;

public class PotionStore extends Map {
	
	int powerpt= 200;
	int defensept = 150;
	int STRpt = 100;
	int DEXpt = 100;
	int WISpt = 100;
	int expt = 250;
	int hppt = 200;
	int mppt = 200;


public int ShowPs(int money ,int number){
	name = "포션 상점";
	System.out.println(name + "에서 구매를 시도하고 있습니다.");

	
	if(number ==1){
		if(powerpt < money){
			System.out.println("파워 포션을 구매했습니다.");
			return money-powerpt;
		}}
		if(number ==2){
			if(defensept < money){
				System.out.println("방어 포션을 구매했습니다.");
				return money-defensept;
			}	
		}
		if(number ==3){
			if(STRpt < money){
				System.out.println("힘 포션을 구매했습니다.");
				return money-STRpt;
		}
	}
	
		if(number ==4){
			if(DEXpt < money){
				System.out.println("민첩 포션을 구매했습니다.");
				return money-DEXpt;
			}
		}
		if(number ==5){
			if(WISpt < money){
				System.out.println("지혜 포션을 구매했습니다.");
				return money-STRpt;
			}
		}
		
		if(number ==6){
			if(hppt < money){
				System.out.println("체력 포션을 구매했습니다.");
				return money-hppt;
			}
		}
		
		if(number ==7){
			if(mppt < money){
				System.out.println("마나 포션을 구매했습니다.");
				return money-mppt;
			}
		}
		if(number ==8){
			if(expt < money){
				System.out.println("경험치 포션을 구매했습니다.");
				return money-expt;
			}
	
	}	
		
		return -1;
	}
}