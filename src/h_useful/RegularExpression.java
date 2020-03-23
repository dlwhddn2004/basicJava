package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 *  정규표현식 : 문자열의 패턴을 검사하는 표현식
		 *  
		 *  ^	뒷 문자로 시작
		 *  $	앞 문자로 종료
		 *  .	임의의 문자(줄바꿈 제외)
		 *  *	앞 문자가 0개 이상
		 *  +	앞 문자가 1개 이상
		 *  ?	앞 문자가 업거나 1개 			(\? -> 그냥 물음표 )
		 *  []	문자의 집합이나 범위 ([a-z] : a부터 z까지, [a^-z] : a부터 z가 아닌것)
		 *  {}	앞 문자의 개수 ({2} : 2개, {2,4} : 2개이상 4개이하)
		 *  () 그룹화(1개의 문자처럼 인식)
		 *  |	OR 연산
		 *  
		 *  \s 	공백, 탭, 줄바꿈
		 *  \S	공백, 탭, 줄바꿈이 아닌 문자
		 *  \w	알파벳이나 숫자
		 *  \W	알파벳이나 숫자가 아닌 문자
		 *  \d	숫자
		 *  \D	숫자가 아닌 문자
		 *  (?i) 뒷 문자와 대소문자 구분 안함
		 * 
		 */
		
		String str = "abc123"; 
		String regex ="[a-z]{3}[0-9]{1,3}"; //a~z까지 3개 나올수 있다 / 숫자가 0~9까지 1개이상 3개이하 나올수 있다 (기존 str보다 범위 높)
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str); //패턴이 일치하는지 확인
		System.out.println(m.matches());
		
		String regex1 = "[a-z0-9]+"; //기존 regex보다 범위 높
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p.matcher(str);

		System.out.println(m1.matches());
		
		String regex2 = "\\w*";  // \\2개를 넣는이유는 \는 특수문자표현할때 쓰므로 내가 만약 \를 입력하고 싶으면 2개를 넣는다 (기존 regex보다 범위 높)
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p.matcher(str);
		 
		System.out.println(m2.matches());
		
		String regex3 = ".*"; //(기존 regex보다 범위 높)
		Pattern p3 = Pattern.compile(regex2);
		Matcher m3 = p.matcher(str);
		System.out.println(m3.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		//아이디
		String id= "dlwhddn2004";
		String regexid = "[a-z0-9]{7,15}";
		Pattern p5 = Pattern.compile(regexid);
		Matcher m5 = p5.matcher(id);
		System.out.println(m5.matches());
		
		
		String ph = "0102499-6002";
		String regexph = "(?i)[0-9]{3}[-]{0,1}[0-9]{3,4}[-]{0,1}[0-9]{4}";
		
		Pattern p4 = Pattern.compile(regexph);
		Matcher m4 = p4.matcher(ph);
		System.out.println(m4.matches());
		
		String email ="dlwhddn2004@gmail.com";
		String regexmail = "[a-z0-9]{10,15}@[a-z]{2,6}\\.[a-z]{2,3}";
		Pattern p6 = Pattern.compile(regexmail);
		Matcher m6 =  p6.matcher(email);
		System.out.println(m6.matches());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
