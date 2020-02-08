package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 java,oracle, html,css,jquery, jsp 점수를 50~100까지 랜덤으로 생성하고
		 * 석차순으로 석차, 이름 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름	java	oracle	html	css	jquery	jsp		총점	평균
		 * 1	홍길동	100		90		80		50	 40		30		390		65
		 */
		
		String name[] = {"이종우","홍길동","홍길동1","홍길동2","홍길동3","홍길동4","홍길동5","홍길동6","홍길동7","홍길동8",
				"홍길동9","홍길동","홍길동"};
		
	String subject[] ={"석차","이름","java","oracle","html","css","jquery","jsp","총점","평균"};
		
		int korea[][] = new int[name.length][subject.length];
		
	
		
		int random[][] = new int[name.length][subject.length];
		
		for(int i=0; i<korea.length; i++){ 	//각 korea 방의 랜덤값
			for(int j=0; j<korea[i].length; j++){
				 random[i][j] = (int)(Math.random()*50)+50;
				}
			}
		
		
		
		double [] koreaavg =new double [korea.length]; // 과목별 합계와 평균
		int [] koreasum = new int [korea.length]; // 
		
		for(int i=0; i<korea.length; i++){
			for(int j=0; j<korea[i].length; j++){
				koreasum[i] = koreasum[i]+ korea[i][j];
				
			}
			koreaavg[i] = (double)koreasum[i]/ korea[i].length;
		}
			
		
			int rank[] = new int[name.length];		//  석차 구하기
			for(int i =0; i<name.length; i++){
			
			for(int j=0; j<name.length; j++){
				if(koreasum[i]<koreasum[j]){
					rank[i]++;
				}
			}
		}
		
			System.out.print(Arrays.toString(subject));		
			
			for(int i=0; i<random.length; i++){
				// System.out.println(random[i][j]);
			}
		
			
		
		
		
	}		
}