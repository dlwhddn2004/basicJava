package h_useful;

public class StringSpeedTest {

	

	public static void main(String[] args) {
			String str = "a";
			
			/*System.currentTimeMillis(); //현재 시간을 밀리세컨드 단위로 찍어주는 매소드
			long start = System.currentTimeMillis();
			for(int i=0; i<=200000; i++){
				str += "a";
			}
			long end = System.currentTimeMillis();
			
			System.out.println(end - start  + "ms");*/
			
			StringBuffer sb = new StringBuffer("a");
			
			long start = System.currentTimeMillis();
			
			for(int i=0; i< 200000; i++){
				sb.append("a");
			}long end = System.currentTimeMillis();
			System.out.println(end - start + "ms"); //string 타입에서 속도차원을 비교해주는건데 StringBuffer 와 append("") 메소드를 사용해 단축시킨다
	}

}
