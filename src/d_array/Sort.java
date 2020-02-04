package d_array;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 * << 정렬 >>
		 * -선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 			앞에서부터 작은 수를 채워나가는 방식
		 * -버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 			뒤에서부터 큰 수를 채워 나가는 방식.
		 * -삽입정렬 :	두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * -석차 구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 * 
		 * 
		 * 
		 * 
		 
		 * */
			
		
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
			
		}
		shuffle(numbers); //숫자를 구하는 함수
		System.out.println("점수: " + Arrays.toString(numbers));
		
		//printRank(numbers); //석차를 구하는 함수
		//selectSort(numbers);
		//System.out.println("정렬 후: " + Arrays.toString(numbers));
		
		//bubleSort(numbers);
		//System.out.println("정렬 후: " + Arrays.toString(numbers));
		
		insertSort(numbers); //삽입정렬
		System.out.println("정렬 후: " + Arrays.toString(numbers));
		
		
	}


	private static void insertSort(int[] numbers) {
		/*for(int i = 0; i < numbers.length; i++){
			int key = numbers[i];
			int j = i - 1;
			System.out.println("j의 값: " + j);
			while (j >= 0 && numbers[j] > key){
				numbers[j + 1] = numbers[j];
				j--;
				System.out.println("정렬 중1: " + Arrays.toString(numbers)); //인덱스 2를 인덱스 1의 자리에 복사한다. (복사)
				
			}
			numbers[j + 1] = key; 
			System.out.println("정렬 중2: " + Arrays.toString(numbers)); //인덱스 1에 인덱스 2의 값을 넣어준다. (교환한다)
		}*/
		}
		
	


	private static void bubleSort(int[] numbers) {
		int temp = 0;
		
		boolean changed = false;
		
		for(int i = 0; i < numbers.length-1; i++){
			for(int j = 0; j < numbers.length -i -1; j++){ //j는 계속 ++된다.
				if( numbers[j] > numbers[j + 1]){
					temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
					changed = true;
				}
				System.out.println(Arrays.toString(numbers));
			}//안쪽에 있는 for문이 도는 동안 if문 안으로 단 한번도 들어오지 않는다면 종료시킨다.
		
		if(!changed){
			break;
		}
			
		}
		
	}


	private static void selectSort(int[] numbers) {
		
		for(int i = 0; i < numbers.length -1; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp; 
					System.out.println("정렬 중: " + Arrays.toString(numbers));
				}
			}
		}
		
		
	}
		
	private static void printRank(int[] numbers) {
		//석차 구하기- > 우리가 방금 출력한 섞여있는 배열: 점수
		//모두랑 비교하기 전에는 내가 일등임(내 점수만 알고 있음)
		//하지만 내 성적을 두명이랑 비교했을 때부터 등수가 생긴다.
		//numbers의 길이만큼 도는 for문
		
		
		//rank 안에 기본값 1씩 채워주는 for문
		int[] rank = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++){
			rank[i] = 1;
		}
		
		//등수를 구하는 for문
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j] ){
					rank[i] = rank[i] + 1;
				}
			}
		}
		
		System.out.println("석차 : " + Arrays.toString(rank));
		
		
		//등수를 프린트하는 for문
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]+ "점의 석차는 :"+rank[i] + "등");
		}
	}

	private static void shuffle(int[] numbers) {
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int temp =numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//건들지말것
}//건들지말것
