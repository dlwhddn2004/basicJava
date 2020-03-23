package f_oop2;

public class Time {
		
	private int hour; 
	private int minute;
	private int second;
	
	
	public int getHour() { //get 얻기한 메소드
		return hour;
	}


	public void setHour(int second) { //set hour 변수의값을 저장 하는 메소드
		if(second > 60){
			this.hour= second%60 ;
			 hour = second/60;
		}else{
			this.hour= second;
		}
	}


	public int getMinute() {
	
			
		 return minute;
	}


	public void setMinute(int second) {
		if(second > 60){
			this.minute= second%60 ;
			 minute = second/60;
			 setHour(second);
		}else{
			this.minute= second;
		}
		
	}


	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		if(second > 60){
			this.second = second%60 ;
			 second = second/60;
			 setMinute(second);
		}else{
			this.second = second;
		}
		}
		
		

	@Override
	public String toString() {
		return hour + "|" + minute + "|" + second; 
	}
	
	
	
}
