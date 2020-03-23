package h_useful;

public class ObjectClass {
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
	int a = 10;
	String b = "abc";
	public ObjectClass(int a,String b) {
		this.a=a;
		this.b=b;
	} 

	public static void main(String[] args) {
		ObjectClass oc = new ObjectClass(10,"abc");
		ObjectClass oc2 = new ObjectClass(20,"def");
		ObjectClass oc3 = new ObjectClass(10,"abc");
		
		System.out.println(oc.equals(oc2)); //1번과 2번 값이 다르(주소비교) (eqals메소드를 통해 비교)
		System.out.println(oc.equals(oc3));// 1번과 3번은 값이 같으니(주소비교)
		
	}

	@Override
	public String toString() {
		return "리턴하고 싶은 내용";
	}
	
	
}
