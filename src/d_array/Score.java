package d_array;
import java.util.Arrays;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		//석차를 구하는 법?
		//그냥 점수끼리 다 꺼내서 더한다음에 이 순서대로 가장 첫번째것부터세운다.
		
		
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로 생성하고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 석차       이름       Java      Oracle       HTML       CSS       JQuery       JSP       총점       평균
		 * 1          홍길동     100         90          80          70          60        50       350   75.0
		 * 1          홍길동     100         90          80          70          60        50       350   75.0
		 * 1          홍길동     100         90          80          70          60        50       350   75.0
		 * 1          홍길동     100         90          80          70          60        50       350   75.0
		 * 1          홍길동     100         90          80          70          60        50       350   75.0
		 * 
		 * */

	/*	int[][] score = new int[21][6];
		String [] name = new String[21];
		
		int[] sum = new int[score.length];
		double[] ave = new double[score.length];
		*/
		
		/*int[] sum = new int[score.length];
		double[] avg = new double[score.length];
		
		//점수부터 구하자
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()* 100 -50 )+ 50;
				//총점 구하기
				sum[i] = sum[i] + score[i][j];
			}
			ave[i] = sum[i] / (double)score[i].length;
			System.out.println(i + 1 +"번의 성적 :"+ Arrays.toString(score[i]));
			System.out.println(i + 1 +"번의 총점 :"+ sum[i]);
			System.out.println(i + 1 +"번의 평균 :"+ ave[i]);
		}*/
		
		//이름 교환, 성적 교환
		
		
		int[][] score = new int[21][6];
		String [] name = new String[21];
		name[0] = "전영현";
		name[1] = "김다슬";
		name[2] = "김덕년";
		name[3] = "김재석";
		name[4] = "김태진";
		name[5] = "박희찬";
		name[6] = "서동미";
		name[7] = "서한별";
		name[8] = "신나라";
		name[9] = "심윤희";
		name[10] = "옥혜원";
		name[11] = "유웅";
		name[12] = "이명현";
		name[13] = "이수아";
		name[14] = "이승민";
		name[15] = "이용춘";
		name[16] = "이재호";
		name[17] = "이종우";
		name[18] = "임종원";
		name[19] = "차완호";
		name[20] = "홍성하";
		
		System.out.println(Arrays.toString(name));
		
		int[] sum = new int[score.length];
		int[] ave = new int[score.length];
		
		
	
		
		//점수부터 구하자
				for(int i = 0; i < score.length; i++){
					for(int j = 0; j < score[i].length; j++){
						score[i][j] = (int)(Math.random()* 100 -50 )+ 50;
						
						//총점 구하기
						sum[i] = sum[i] + score[i][j];
						
					}
	
					
					ave[i] = sum[i] / score[i].length;
					//System.out.println(i + 1 +"번의 성적 :"+ Arrays.toString(score[i]));
					
					//System.out.println(i + 1 +"번의 총점 :"+ sum[i]);
					//System.out.println(i + 1 +"번의 평균 :"+ ave[i]);
					
				}
				
				System.out.println("전체의 평균 :"+ Arrays.toString(ave));
				System.out.println("전체의 총점 :"+ Arrays.toString(sum));
	
						
			
				
				
						
					
				/*1.sum으로 각각의 점수 총합을 구한다.
				2. sum끼리 비교해서 더 높은 점수가 나오면(for문)
				--> 각각에 저장된 sc
				ore의 순서를 바꾼다. */
				//버블정렬 가져옴
				//sum 을 바꾸고 싶은 게 아니라 score 를 바꾸고 싶은 거야.
			
				
				
				
				
				
	}//건들지 말것
				
}