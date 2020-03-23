package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today =new Date(); // new date()현재 날짜 [날짜를 표현하는 클래스 import util]
		System.out.println(today);
		
		//날짜 -> 포멧 사용 -> 문자열로 변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-DD");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("YY-MM-DD hh:mm:ss a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
					
		//문자열 -> 포멧 사용 -> 날짜로 변환
		String str = "2020년 2월 20일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date datestr = sdf5.parse(str);
			System.out.println(sdf3.format(datestr));
		} catch (ParseException e) {
			
			e.printStackTrace();
		} //parse() 메소드 문자열을 날짜로 넘겨주는거 예외처리안하면 컴파일 에러뜸
		
		Calendar cal =Calendar.getInstance(); //날짜를 계산하게해줌
		
		cal.setTime(new Date()); //date객체를 가지고 셋팅
		cal.set(2020, 1, 19); //2020년/02/19(월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3); //일 빼줌
		cal.add(Calendar.HOUR, 2);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		
		
		System.out.println(sdf3.format(cal.getTime()));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
