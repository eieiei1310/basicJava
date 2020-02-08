package daseul;
import java.util.Arrays;
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
		
		
	}

}
