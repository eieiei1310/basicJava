package daseul;
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		//문제 5번 :answer 배열의 각 숫자의 갯수를 세어 count배열에 넣고 
				//count배열의 각 숫자만큼씩 *를 출력한다 
			/*	int[] answer= {1,2,3,2,4,1,3,4,3,1,3,4};
				int[] counter = new int[4];
				for(int i = 0; i < answer.length; i++){
					for(int j = 1; j < counter.length + 1; j++){
						if(answer[i] == j){
							counter[j-1] += 1;
						}
					}
					
				}
				for(int i = 0; i < counter.length; i ++){
					for(int j = 0; j < counter[i]; j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				System.out.println(Arrays.toString(counter));
				
				*/
				
/*			
		int[] score = { 79, 88, 91 , 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		for(int i = 1; i < score.length; i++){
			if(max < score[i]){
				max = score[i];
			}else if(min > score[i]){
				min = score[i];
				System.out.println(min);
			}
		}
		System.out.println("최대값: " + max + "최소값: " + min);
		
		*/
		
		/*int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money:" + money);
		for(int i = 0; i < coinUnit.length; i++){
			System.out.println(coinUnit[i] + ":" + money / coinUnit[i]);
			money %= coinUnit[i];
			
		}*/
		
		/*	// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			Scanner s = new Scanner(System.in);
			System.out.println("소유액을 입력하세요>");
			int money = Integer.parseInt(s.nextLine());
			
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
				 (1) 아래의 로직에 맞게 코드를 작성하시오.
				1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
				2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
				(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
				3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
				
			coinNum = money / coinUnit[i];
			if(coinNum > coin[i]){
				coin[0] = 0;
				money -= coinNum * coinUnit[i];
			}else{
				coin[0] -= coinNum;
				money -= coinNum * coinUnit[i];
			}
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
			}
			
			if(money > 0) {
				System.out.println("거스름돈이 부족합니다.");
				System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) {
				System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
		
		
		*/
		
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i = 0; i< answer.length; i++){
			for(int j = 1; j <= counter.length; j++){
				if(answer[i] == j){
					counter[i]++;
				}
			}
		}
		for(int i = 0; i < counter.length; i++){
			for(int j = 0; j < counter[i]; j++){
				System.out.println("*");
			}
		}
		
		
	}

}
