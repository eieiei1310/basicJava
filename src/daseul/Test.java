package daseul;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	/*	//2020_01_31 배열 문제
		//1. 10까지 저장할 수 있는 배열에 100까지의 랜덤한 숫자를 저장하고 숫자들의 합계와 평균 값을 찾아주세요.
		//2. 1번 문제에 저장된 숫자들 중에 최대값과 최소값을 구해주세요.
		//3. 0부터 30까지의 랜덤한 숫자를 출력해내 랜덤한 숫자에 해당되는 인덱스의 숫자와 인덱스 0에 해당하는 숫자를 서로 교환한다
		     //그리고 이것을 배열 안의 모든 숫자가 바뀔 때까지 계속해주세요.
		//4.  1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		//5. 4번문제에 만들어진 식에서 난수의 최소값, 최대값, 숫자가 생성된 횟수를 사용자에게 입력받을 수 있게 만드시오.
	
	//1. 10까지 저장할 수 있는 배열에 100까지의 랜덤한 숫자를 저장하고 숫자들의 합계와 평균 값을 찾아주세요.
	
		//배열 크기설정
		int[] array;
		array = new int[10];
		//합계와 평균을 구하는 변수 설정
		int sum = 0;
		double ave = 0;
		//합계를 구하는 for문 작성
		for(int i = 0; i <  array.length; i++){
			array[i] = (int)(Math.random()*100)+1;
			sum += array[i];
		}
		//평균을 구하는 식 작성
		ave = (double)sum / array.length;
		
		//합계와 평균을 출력
		System.out.println("합계: " + sum + " 평균: " + ave);
		
		
	//2. 1번 문제에 저장된 숫자들 중에 최대값과 최소값을 구해주세요.
		//최대값, 최소값 정의
		int max = 0;
		int min = array[0];
		//최대값, 최소값을 구하는 식
		for(int i = 0; i < array.length; i++){
			if(array[i] > max ){
				max = array[i];
			}
			if(array[i] < min){
				min = array[i];
			}
		}
		System.out.println("최대값: "+ max + " 최소값:" + min);
		
	//3. 0부터 30까지의 랜덤한 숫자를 출력해내 랜덤한 숫자에 해당되는 인덱스의 숫자와 인덱스 0에 해당하는 숫자를 서로 교환한다
	    //그리고 이것을 배열 안의 모든 숫자가 바뀔 때까지 계속해주세요.
		
		//0부터 30까지의 랜덤 숫자를 넣을 배열 정의
		int[] array2;
		array2 = new int[30];
		
		
		//0부터 30까지의 랜덤한 숫자를 배열에 넣는 식
		for(int i = 0; i < array2.length; i++){
			array2[i] = (int)(Math.random() * 30)+1;
			}
		
		
		//첫번째 배열을 복사하는 식
		int[] array2Copy;
		array2Copy = new int[30];
		for(int i = 0; i < array2.length; i++){
			array2Copy[i] = array2[i];
			}
		

		//첫번째 배열을 복사해서 넣을 배열 정의
		int[] array3 = array2;
		
		//바꿀 인덱스에 넣을 랜덤한 숫자를 뽑고, 해당하는 숫자의 인덱스와 0 인덱스의 숫자를 서로 교환하는 식
		
		for(int i= 0; i < 10; i++){              //outer 가 있던 장소 
			//숫자뽑기
			
			int random2 = (int)(Math.random() * array2.length -1 )+1;
			
			//0번 인덱스를 임시로 저장해둘 변수
			int temp = 0;
			
			
			//교환하는 식
			temp = array2[random2];
			array2[random2] = array2[0];
			array2[0] = temp;
			
			System.out.println(Arrays.toString(array2));
			//int exit = 0;
		}
		
			//인덱스 숫자가 전부 다 바뀌어야지만 빠져나갈 수 있게 해주는 식
			for(int i = 0; i < array2.length; i++){
				if(array2[i] != array3[i]){
					exit += 1;
				}
				if(exit < array2.length){
					break;
				}else if(exit == array2.length){
				 break outer;
				}
			}//for문 대괄호
		//while문 대괄호
			
		System.out.println("첫번째 배열은:");
		System.out.println(Arrays.toString(array3));
		System.out.println("마지막 배열은:");
		System.out.println(Arrays.toString(array2));
		System.out.println("으로 모두 바뀌었습니다.");
		
	
		
		
		
		*/
		
		////2020_02_03 정렬 문제
		/*<< 정렬 >>
		 * -선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 			앞에서부터 작은 수를 채워나가는 방식
		 * -버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 			뒤에서부터 큰 수를 채워 나가는 방식.
		 * -삽입정렬 :	두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * -석차 구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식*/
		
		char b = 0;
		boolean a = (b > 'a' && b < 'z') || (b >'A' && b < 'Z') || (b > '0' && b < '9') ?true :false;
		 System.out.println(a);
		
		
	}	//건드리지 말것
} //건드리지 말것
