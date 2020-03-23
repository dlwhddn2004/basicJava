package e.oop;

public class AirConditioner {
		
	boolean power; //전원
	int temperature; //온도
	int airVolume; // 풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
		
		final int MAX_TEMPERATURE = 30;
		final int MIN_TEMPERATURE = 18;
		
	}
	// 전원 버튼
	void power(){
		power  = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
		
	}
	//온도 증가 버튼
	void temperatureUp(){
		if(power && temperature <30){
			temperature++;
		}
	}
	
	//온도 감소 버튼
	void temperatureDown(){
		if(power && 18 <temperature){
			temperature--;
		}
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
		if(3 < ++airVolume){
			airVolume =1;
			}
		}
	}
	//온도가 18~30까지만 변경할 수 있게 해주시고, 
	//전원을 켰을 때만 버튼들이 작동되도록 메소드들을 변경해주세요.
	public static void main(String[] args) {
		AirConditioner ac =new AirConditioner();
		ac.power();
		System.out.println(ac.power);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.airVolume();
		System.out.println(ac.airVolume);
		
		ac.power();
		System.out.println(ac.power);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.airVolume();
		System.out.println(ac.airVolume);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
