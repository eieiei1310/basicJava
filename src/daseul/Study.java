package daseul;

import java.util.Arrays;

public class Study {

	public static void main(String[] args) {
		String[] name= new String[3];
		name[0] = "김가슬";
		name[1] = "김나슬";
		name[2] = "김다슬";
		
		int[] sum = new int[3];//총점
		int[] ave = new int[3];
		
		
		int[][] number= new int[3][4]; //3명의 학생의 4개의 과목 점수 저장
		System.out.println("            수학  과학  영어  사회");
		
		
		 
		for(int i = 0; i < number.length; i++){
			for(int j = 0; j < number[i].length; j++){
				number[i][j] = (int)(Math.random() * (100-50) )+50;
				sum[i] = sum[i] + number[i][j]; //총점
			}
			
			//등수 구하기
			 //System.out.println(Arrays.toString(sum));
			 
			ave[i] = ave[i] + sum[i] / number.length;
			
			
			 //System.out.println(name[i]+ ":" + Arrays.toString(number[i]) + "총점: "+ sum[i] + "  평균: " + ave[i] + "등수:" );
		}
		System.out.println(Arrays.toString(number[0]));
		 System.out.println(Arrays.toString(number[1]));
		 System.out.println(Arrays.toString(number[2]));
		
		
		//등수 구하기
		int[] rank = {1,1,1};
		 
		 for(int i = 0; i < sum.length; i++){
			 for(int j = 0; j < sum.length; j++){
				 if(sum[i] < sum[j]){
					 rank[i]++;
				 }
			 }
		 }
		 
		 //등수별로 정렬하기..일단 이름과 총점, 평균만 바꾸자
		 int temp = 0;
		 
		 String stringTemp;
		 
		 System.out.println("바꾸기전"+ Arrays.toString(sum) +" " + Arrays.toString(name) +" " +Arrays.toString(ave)+" " +Arrays.toString(rank));
		 
		/* for(int i = 0; i < number.length; i++){
			 for(int j = 0; j < number[i].length; j++){
			 
					 temp = number[i][j];
					 number[i][j] = number[i + 1][j];
					 number[i + 1][j] = temp;
					 
				 
			 }
		 }*/
		 
		 for(int i = 0; i < number.length; i++){
			 for(int j = 0; j < number[i].length; j++){
				 //점수 바꾸기 //선생님이 알려주신 식
				 int a = sum.length - 1;
				
				 if(sum[a] < sum[a]){
					 temp = number[a][a];
					 number[a][a] = number[a + 1][a];
					 number[a + 1][a] = temp;
					 a = a + 1;
				 }
				
			 }
			}
		 
		 for(int i = 0; i < sum.length; i++){
			 for(int j = 0; j < sum.length; j++){
				 
				 if(sum[i] > sum[j]){
					//총점 바꾸기
					 temp = sum[i];
					 sum[i] = sum[j];
					 sum[j] = temp;
					 //이름 바꾸기
					 stringTemp = name[i]; 
					 name[i] = name[j];
					 name[j] = stringTemp;
					 //평균 바꾸기
					 temp = ave[i];
					 ave[i] = ave[j];
					 ave[j] = temp;
					 //등수 바꾸기
					 temp = rank[i];
					 rank[i] = rank[j];
					 rank[j] = temp;
					 
					/* //점수 바꾸기 //선생님이 알려주신 식
					 temp = number[i][j];
					 number[i][j] = number[i + 1][j];
					 number[i + 1][j] = temp;*/
					 
					 
				 }
				
			 }
		 }
		 
		
		 
		
		 

			
	
		 System.out.println("바꾼후"+ Arrays.toString(sum) +" " +Arrays.toString(name)+" " +Arrays.toString(ave)+" " +Arrays.toString(rank));
		 //출력하는 함수
		 for(int i = 0; i < number.length; i++){
			 System.out.println(" ");
			 System.out.print(name[i]+ ":" );
			 for(int j = 0; j < number[i].length; j++){
				 System.out.print(" " + number[i][j] + " ");
			 }
			 System.out.print( "총점: "+ sum[i] + "  평균: " + ave[i] + "   등수:" + rank[i]);
			 
		 }
		 
		 
		 
		 
		 
	/*	//등수 구하기
	 System.out.println(Arrays.toString(sum));
	 int rank = 1;
	 
	 for(int i = 0; i < sum.length; i++){
		 for(int j = 0; j < sum.length; j++){
			 if(sum[i] > sum[j]){
				 rank++;
			 }
			 
		 }
		 System.out.println(rank);
		 rank = 1;
	 }*/
	 
		//석차 구하기
		
		
}//건들지 말 것 
}
