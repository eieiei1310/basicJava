package d_array;
import java.util.Arrays;
import java.util.Scanner;

public class MulitDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 
		 * << 다차원 배열 >>
		 *  - 배열 안에 배열이 저장되어 있는 형태이다. 
		 * 
		 * 
		 * */
/*
		int[][] numbers = new int[2][3];
		//2칸짜리 배열 안에 각 칸마다 3칸짜리 배열이 생성된다 
		int numbers2[][] = new int[][]{{1,2,3},{4,5,6}}; //값의 개수로 배열의 길이가 결정된다. 
		//초기화할때 대괄호는 어디다 붙이든 상관 없지만 int (타입)뒤에 붙이는 것을 선호
		int[] numbers3[] = { {1,2,3}
						   , {4,5,6}
						   , {7,8,9}};
		int[][]numbers4 = new int[3][]; //가변 배열 -값을 지정하지 않은 경우 들어가는 값에 따라 길이가 결정된다.
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10]; //길이를 다르게 지정할 수 있다. 
		
//      numbers[0] = 10; //1차원에 값을 저장할 수 없다. 
		numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있다. 
		numbers[0][0] = 10; //2차원에 값을 저장할 수 있다.
		numbers[0][1] = 20;
		numbers[1][0] = 100;*/
		//int[][] numbers = new int[2][3];
		
		//numbers 배열에 저장된 값의 모양을 적어주세요.
		
		/*numbers = {
		 * 			{10,20,0,0,0}
		 * 			{100,0,0}
		 * 				}
						
			
					*/
		
		/*for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));
			
		}*/
		
	/*	for(int i = 0; i < numbers.length; i++){
			for (int j = 0; j < numbers[i].length; j++){
				numbers[i][j] = (int)(Math.random()*100)+1;
				System.out.println(i + "번째 배열의 " + j + "번째 인덱스 : " + numbers[i][j]);
				
			}	
			System.out.println(Arrays.toString(numbers[i]));
			
		}*/
		
		//1차원의 길이는 3이고 2차원의 길이는 5인 배열을 만들어주시고
		//모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요.
		
	/*	int[][] score = new int[3][5];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 100) + 1;
			}
			
			System.out.println("랜덤 :" + (Arrays.toString(score[i])) );
		
		}*/
		
		//이클립스로 변수 이름 죄다 바꾸는 법
		
		
		
		
		//각각의 합계와 평균 구하기
		int[][] score1 = new int[3][5];
		int[] sum = new int[score1.length];
		double[] avg = new double[score1.length];
		
		for(int i = 0; i < score1.length; i++){
			for(int j = 0; j < score1[i].length; j++){
				score1[i][j] = (int)(Math.random() * 100) + 1;
				sum[i] = sum[i] + score1[i][j]; 
			}
			avg[i] = sum[i] / (double)score1[i].length; 
			System.out.println("랜덤 :" + (Arrays.toString(score1[i])) );
			System.out.println(" 평균: " + avg[i] + " 합계: " + sum[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//건들지말것

}
