package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		
		  Scanner ty =new Scanner(System.in);
		  String type = null;
		  
		  System.out.println("나는 금사빠다 Y/N");
		  String a = ty.nextLine();
		  if(a.equals("Y")){
		  System.out.println("연애할때 끌려다니는 타입이다 Y/N");
		  String b= ty.nextLine();
		  if(b.equals("Y")){
		  System.out.println("감정 표현에 솔직한 편이다Y/N");
		  String c= ty.nextLine();
		  if(c.equals("Y")) {
		  System.out.println("이성친구는 존재할수 없다Y/N");
		  String d= ty.nextLine();
		  if(d.equals("Y")) {
		  System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다Y/N");
		  String e=ty.nextLine();
		  if(e.equals("Y")) {
			  type = "d";
		  System.out.println("당신의 연예 스타일 "+ type);
		  		}
		  	}
		}
	}
		  		}
		  else if(a.equals("N")) {
			  System.out.println("김정기복이 크지 않다. Y/N");
			  String f = ty.nextLine();
			  if(f.equals("N")) {
				  System.out.println("감정포현에 솔직한 편이다 Y/N");
				  String g = ty .nextLine();
				  if(g.equals("N")) {
					  System.out.println("활동적인 데이트가 좋다 Y/N");
					  String h = ty.nextLine();
					  if(h.equals("N")) {
						  System.out.println("아무것도 아닌 일에 쉽게 섭섭함이  쌓인다Y/N");
						  String i = ty.nextLine();
						  if(i.equals("N")) {
							  type = "c";
							  System.out.println("당신의 연예 스타일"+ type);
						  }
					  }
				  }
			  }
 
 }String f= ty.nextLine();
 		if(f.equals("Y")){
	  System.out.println("연락이 없어도 믿고 기다리는 편이다Y/N");
	  String f2 = ty.nextLine();
		  if(f2.equals("Y")) {
			  type ="A";
			  System.out.println("당신의 타입은 "+type);
		  }
	  
		  else if(f2.equals("N"));{
			  System.out.println("이성 친구는 존재할 수 없다");
			  String gg2 =ty.nextLine();
			  if(gg2.equals("N")) {
				  type = "B";
				  System.out.println("당신의 타입은 "+type);
			  }String i =ty.nextLine();
			  if(gg2.equals("Y")) {
				  System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
			  }if(i.equals("N")) {
				  type = "c";
				  System.out.println("당신의 연예 스타일"+ type);
			  }else if(i.equals("Y")) {
				  type = "D";
				  System.out.println("당신의 연예 스타일"+ type);
			  }
		  }
	}

 }
}


					
		
		