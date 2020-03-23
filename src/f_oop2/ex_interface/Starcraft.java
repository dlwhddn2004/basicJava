package f_oop2.ex_interface;

public class Starcraft {
	
	public static void main(String[] args) {
		
		Marine m =new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		Scv s = new Scv();
		
		//s.repair(m); //마린은 인터페이스를 상속받지 못했기 때문에 실행 X
		s.repair(t);
		s.repair(d);
		s.repair(s);
	}
	
}

class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{   // 유닛 클래스 생성자가 파라미터가 있음, 자식클래스에서 부모클래스의 생성자를 호출해야함

	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class Scv extends Unit implements Repairable{
	Scv(){
		super(60);
	}
	
	void repair(Repairable r){ //unit 타입을 쓸경우 마린도 수리가 되기때문에 쓸수없음 그래서 interface를 만듬
		if(r instanceof Unit){ //instanceof r 타입의 객체가 Unit 타입의 객체로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
	
}

interface Repairable{
	
}


