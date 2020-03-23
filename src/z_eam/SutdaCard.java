package z_eam;

public class SutdaCard {
	String name; //홍길동
	int ban; //1
	int no; //1
	int kor; //100
	int eng; //60
	int math; //76
	
	int getTotal(){
		
		return kor+eng+math;
	}

	
	float getAverage(){
		return (int)(getTotal() / 3f *10 +0.5 )/ 10f;
	}
	
	
	
	SutdaCard(String name, int ban , int no , int kor, int eng , int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor =kor;
		this.eng = eng;
		this.math = math;
	
	}
	String info(){
	return	name
			+','+ban
			+','+no
			+','+kor
			+','+eng
			+','+math
			+','+getTotal()
			+','+getAverage();
	
	}
	 double getDistance(int x, int y, int x1, int y1){ 
		
	double a = (double)Math.sqrt((x -x1)*(x -x1) + (y-y1)*(y-y1));
 		return a;
	
 		
	} 
}

