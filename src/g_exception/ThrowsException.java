package g_exception;

import java.io.IOException;

public class ThrowsException {
	public static void main(String[] args) {
		/*
		 *  << 메소드에 예외 선언하기 >>
		 *  - 메소드 호출시 발생할 수 있는 예외를 선언해 줄수 있다.
		 *  - void method() throws IOException {}
		 *  - 메소드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언할 수있다.
		 *  - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메소드로 예외처리를 넘겨준다.
		 */
		
		try {
			method();
		} catch (IOException e) {
			//예외를 넘겨받아 처리한다.
			e.printStackTrace();
		}
	}

	private static void method() throws IOException { //throws IOException 는 method IOException안에서 처리하지않고 호출한 메세지로 넘겨주겠다는 의미
		throw new IOException();
		
	}
}
