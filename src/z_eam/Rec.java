package z_eam;

public class Rec {
	
		 String name;
		int width;
		int height;
		 
		 int getArea(){
			 return width * height;
		 }
		 int getCircum(){
			 return (width + height) *2;
		 }
		 
		 Rec(String name, int width,int height){
			 this.name = name;
			 this.width = width;
			 this.height = height;
		 }
		
		 Rec(){
			 this("사각형", 8, 6);
		 }
		   String info(){
			  return name+","+width+","+height+","+getArea()+","+getCircum();
		  }
		   
	public static void main(String[] args) {
		Rec abc =new Rec();
		System.out.println(abc.info());

	}


}

class Student {
	String name;
	int ban;
	int number;
	int kog;
	int eng;
	int math;
	
	Student(String name, int ban, int number, int kog, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.number = number;
		this.kog = kog;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kog+eng+math;
	}
	
	float getAverage(){
		return (int)(kog+eng+math /3f + 0.5 *10) / 10f;
	}
	
	String info(){
		return name +ban+number+kog+eng+math;
	}
	public static void main(String[] args) {
		Rec abd = new Rec("사각형",8,6);
		System.out.println(abd.info());
		Student abc = new Student("박희찬",4,5,4,3,1);
		System.out.println(abc.info());
		
	}
}