package f_oop2;

public class Store {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Product p = new Desktop(); //부모 자식 형변환 가능 (Product)new Desktop(); 생략
									// 자식타입 > 부모타입 생략 가능 up , 부모타입 > 자식타입 생략불가 down
		p.info();
		c.buy(p);
		
		p = new Tv(); //p라는 객체는 product가 될수도있고 deptop이 될수도 있는데 여러가지 객체가 되는 이런 p를 다형성이라한다
		p.info();
		c.buy(p);
		
		//여러분이 만든 물건 구매해주세요
		
		p = new Goldbar();
		p.info();
		c.buy(p);
		
		c.showItem();
		
	}

}



class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("------------------");
		System.out.println("상품평 : "+ name );
		System.out.println("금  액 : "+ price);
		System.out.println("------------------");
	}
	
}

class Desktop extends Product{ //부모클래스의 생성자에 파라미터가 있으니 자식생성자에 Super를 써준다음 파라미터 값을 넣어줘
	Desktop(){
		super("삼성 컴퓨터", 500000); //부모 클래스의 생성자 호출
	}	
}

class Tv extends Product {
	Tv(){
		super("LG TV ", 1000000);
	}
}

class Goldbar extends Product {
	Goldbar(){
		super("골드 바", 9999999);
	}
}

class Customer{
	
	int money = 999999999;				
										//부모와 자식은 형변환 가능하니
	Product[] item = new Product[10]; //Desktop의 부모클래스를 타입으로 하면 다 끌어올수있음 , 장바구니
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족해");
			return; //return -> 메소드 종료
		}
		
		money -= p.price;
		
		for(int i=0; i<item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + " 을 구매했다.");
	}
	
	void showItem(){
		System.out.println("----------장바구니----------");
		for(int i=0; i<item.length; i++){
			if(item[i] != null){
				System.out.println(i + 1 + "."+ item[i].name);
			}
		}
		System.out.println("-----------------------------");
	}
	
	
	
	
	
	
	
	
}












