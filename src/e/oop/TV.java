package e.oop;

public class TV {
	
	//TV와 최대한 비슷하게 TV클래스를 만들어 주세요.
	boolean power;
	int channel= 1;
	int volume= 1;

	final int MAX_channel= 300;
	final int MIN_channel= 1;
	final int MAX_volume= 50;
	final int MIN_volume= 1;
	
	
	void power(){
		power = !power;
		if(power){
		System.out.println("전원이 켜집니다");
		}else{
			System.out.println("전원이 꺼집니다.");
		}
		}
	
	void channelUp(){
		if(power && channel <=300){
			++channel;
			if(channel == 300){
				System.out.println("채널이 1로 이동했습니다");
				channel = 1;
			}
		}
		System.out.println("채널이 "+ channel+" 로 이동하였습니다");
		System.out.println("현재 채널 : "+ channel+ "최대채널 : " + MAX_channel );

	}

	void channelDown(){
		if(power && (channel <=300 || channel>0)){
			--channel;
			if(channel ==1){
				System.out.println("채널이 300으로 이동했습니다");
				channel =300;
			}
		}
		System.out.println("채널이"+ channel+ "로 이동되었습니다");
		System.out.println("현재 채널 : "+ channel+ "최소채널 : " + MIN_channel );
	}
	
	void volumeUp(){
		if(power && volume >0 || volume<= 50){
			++volume;
			if(50 < volume){
				volume =1;
				}
		}
		System.out.println("볼륨이 증가했습니다");
		System.out.println("현재 볼륨 :" + volume+"최대 볼륨 : "+ MAX_volume);
	}
	
	void volumeDown(){
		if(power && volume >=0 || volume<= 50){
			--volume;
			if(0 == volume){
				volume =0;
				System.out.println("음소거 모드입니다.");
				}
			
		}
		System.out.println("볼륨이 감소했습니다");
		System.out.println("현재 볼륨 :" + volume+"최소 볼륨 : "+ MIN_volume);
	}

		public static void main(String[] args) {
			 TV a =new TV();
			 
		a.power();
		System.out.println(a.power);
		a.channelUp();
		a.channelUp();
		a.channelDown();
			 
			 
			 
			 
		}
		
	}
	


