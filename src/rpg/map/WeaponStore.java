package rpg.map;

import java.util.Scanner;

public class WeaponStore extends Map{
	
	int nomal= 2500;
	int rare  = 5000;
	int unique = 10000;
	int legend = 99999;
	
	int nomald= 2500;
	int rared = 5000;
	int uniqued = 10000;
	int legendd = 99999;


	public int ShowWs(int money, int number ){
		name = "무기 상점";
		System.out.println(name + "에서 구매를 시도하고 있습니다.");
		
		
		
		if(number ==1){
			if(nomal < money){
				System.out.println("일반 무기를 구매했습니다.");
				return money-nomal;
			}}
		
		if(number ==2){
			if(rare < money){
				System.out.println("레어 무기를 구매했습니다.");
				return money-rare;
			}}
	
		if(number ==3){
			if(unique < money){
				System.out.println("유니크 무기를 구매했습니다.");
				return money-unique;
			}}
		
		if(number ==4){
			if(legend < money){
				System.out.println("전설 무기를 구매했습니다.");
				return money-legend ;
			}}
		
		if(number ==5){
			if(nomald < money){
				System.out.println("일반 방어구를 구매했습니다.");
				return money-nomald;
			}}
		
		if(number ==6){
			if(rared < money){
				System.out.println("레어 방어구를 구매했습니다.");
				return money-rared;
			}}
		
		if(number ==7){
			if(uniqued < money){
				System.out.println("유니크 방어구를 구매했습니다.");
				return money-uniqued;
			}}
		
		if(number ==8){
			if(legendd < money){
				System.out.println("전설 방어구를 구매했습니다.");
				return money-legendd;
			}}
		
		return -1;	
	
	}
}