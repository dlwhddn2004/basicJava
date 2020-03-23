package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 *  << finally >>
		 *  - 필요에 따라 try-catch 뒤에 fainally를 추가할 수 있다.
		 *  - finally 는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 *  
		 *  << 자동 자원 반환(try-with-resource) >>
		 *  - try(변수 선언; 변수선언) {} catch(Exception e){}
		 *  - 사용 후 반환이 필요한 객체를 try의 ()안에 선언하면 try 블럭 종료시 자동으로 반환된다.
		 *  
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 사용후 닫아줘야 하는 객체
		finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//예외 발생 : try ->catch -> finally
		//예외 미발생 : try -> finally
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("D:/file.txt"); // 여러개의 객체를 넣어주러면 ; 를 써준다
				FileInputStream fis2 = new FileInputStream("D:/file.txt")){
			//FileOutputStream = 파일을 쓰는것, FileInputStream = 파일을 읽는것
			String str = "파일 내용 미스터 희빡....";
			byte[] bytes =str.getBytes();
			for(int i=0; i<bytes.length; i++){
				fos.write(bytes[i]);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
