package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>>
		 * -배열 초기화 방법 3가지
		 * -int[] number = new int[5];
		 * -int[] number = new int[]{10, 20, 30, 40, 50};
		 * -int[] number = {10, 20, 30, 40, 50};
		 * 
		 * -배열의 중요한 특징 : 한번 길이가 정해지면 다시 바꿀 수 없다. 
		 * 
		 * 
		
		//배열은 참조형 타입입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.(첫번째 방법으로는 기본값 ex)int 타입일 경우 = 0)
		
		System.out.println(array); //->이렇게만 하면 배열의 주소 값이 나온다.
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해주어야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약 20억)이다.
		
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);

		
		int[] iArray1 = new int[]{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1,2,3}; // 선언과 초기화를 동시에 해야 한다. 
		int[] iArray3;
		iArray3 = {1,2,3}; //선언과 초기화 따로 하기 -> 컴파일 에러 발생
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//array[5] = 60; // -ArrayIndexOutOfBoundsException: 5> 배열이 인덱스 범위를 벗어났다-> 컴파일 에러
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		
		int[] sum = new int[10];
		System.out.println(sum[0]);
	
		//모든 인덱스에 있는 값을 변경해주세요.
		
		sum[0] = 10;
		sum[1] = 10;
		sum[2] = 10;
		sum[3] = 10;
		sum[4] = 10;
		sum[5] = 10;
		sum[6] = 10;
		sum[7] = 10;
		sum[8] = 10;
		sum[9] = 10;
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for(int i = 0; i < sum.length; i++){
			sum[i] = i + 1;
			System.out.print(sum[i] + "\n");
		}
		
		//모든 인덱스에 있는 값을 더해주세요.
		
		int temp = 0;
		
		temp += sum[0];
		temp += sum[1];
		temp += sum[2];
		temp += sum[3];
		temp += sum[4];
		temp += sum[5];
		temp += sum[6];
		temp += sum[7];
		temp += sum[8];
		temp += sum[9];
		
		for(int i = 0; i < sum.length; i++){
			temp += sum[i];
		}
		System.out.println(Arrays.toString(sum));
		System.out.println("\n"+ temp);
		*/
		
		//배열에 숫자를 저장하고 합계와 평균을 구해보자.
		/*
		int[] numbers = new int[10];
		
		int sum = 0;
		
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random()*100) + 1;
			sum += numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
		double ave = (double)sum / numbers.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + ave);
	
		
		//향상된 for 문
		for(int number : numbers){
			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
	System.out.println(Arrays.toString(numbers));
		*/
	
	
	//배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요. 



//numbers = 1,2,4,5,6
//1,2,4,5,6 numbers[i]
//1,2,4,5,6 numbers[j]	
	
/*	int min = 0;
	int max = 0;
	
	for(int i = 0; i < numbers.length; i++){
		for(int j = 0; j < numbers.length; j++){
			
			
			if(numbers[i] > numbers[j]){
				max =numbers[i];
				
			}else if(numbers[i] < numbers[j]){
				min = numbers[j];
				}
		}
	}
	System.out.println( max );
	System.out.println( min );
	*/
	/*int max = numbers[0];
	int min = numbers[0];
	
	for(int i = 0; i < numbers.length; i++){
		if(min > numbers[i]){
			min = numbers[i];
		}
		if(max < numbers[i]){
			max = numbers[i];
		}
	}
	System.out.println("min: " + min  + "  max: " + max);
	
	*/
	
	/*
	 * 
	 * int max = numbers[0];
	   int min = numbers[0];
	
	for(int i = 0; i < numbers.length; i++){
		for(int j = 0; j < numbers.length; j++){
			if(numbers[i] > numbers[j]){
				max = ;
			}
			if(numbers[i] < numbers[j]){
				min = ;
			}
			System.out.println(max +"," + min);
		}
	}
	*/
		//1235가 나오면 한판이 다 바뀜....
		//3이 나오면 3번 인덱스의 값을 0번 인덱스랑 바꾼다. 
	//랜덤한 값을 발생시켜서 자리를 바꾸라...
	//중복되지 않는 0에서 29까지의 랜덤한 수를 만든다 ->
	//인덱스[랜덤]의 수를 인덱스[0]으로 바꿈
	//출력
	
	/*
	int[] shuffle = new int[30];
	for(int i = 0; i < shuffle.length; i++){
		shuffle[i] = i + 1;
	}
	System.out.println(Arrays.toString(shuffle));
	
	
	
	for(int i = 0; i < shuffle.length *10; i++){
		int temp = 0;
		int random = (int)(Math.random()*29);
		
		System.out.println(random);
		
		temp = shuffle[0];
		shuffle[0]= shuffle[random];
		shuffle[random] = temp;
		
		System.out.println(Arrays.toString(shuffle));
	
	}
	*/
	/*// 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	// 1에서 10까지의 배열을 만들고, 각각의 배열 안에 생성된 횟수를 넣는다. (for 문으로 일치하는지 일치 안하는지 판별 후 넣기.)
	
	int[] array = new int[10];
	int[] result = new int[10];
	
	for(int i = 0; i < 10; i++){
		array[i] = i + 1;
	}
	System.out.println(Arrays.toString(array));
	
	
	for(int i = 0; i < 500; i++){
		int count = (int)(Math.random()*10) + 1;
		
		for (int j = 0; j < 10; j++){
			if(count == array[j])
				result[j] = result[j] + 1;
		}
	}

	for(int i = 0; i < 10; i++){
		System.out.println(i + 1 + "은 " +result[i]+ "번 출력되었습니다.");
	}*/
	
	//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
	
	//최소, 최대, 반복횟수 입력받기
	Scanner s = new Scanner(System.in);
	System.out.println("최소값을 입력해주세요.");
	int min = Integer.parseInt(s.nextLine());
	System.out.println("최대값을 입력해주세요.");
	int max = Integer.parseInt(s.nextLine());
	System.out.println("반복횟수를 입력해주세요.");
	int rotation = Integer.parseInt(s.nextLine());
	System.out.println("최소값:" +min+ "최대값:" +max+ "반복횟수" + rotation);
	
	int[] array = new int[(max - min) +1];// int[3] = 안에 값이 3개가 있다는 뜻. 최대값5, 최소값 2이라면 : 
	int[] result = new int[(max - min) +1];// 5 - 2 = 3 이다. 즉 +1해주어야 함. 
	
	//array 안을 채우는 식
	for(int i = 0; i < array.length; i++){
		array[i] = min + i;
	}
	System.out.println(Arrays.toString(array));
	
	//랜덤 숫자를 구하는 식
	for(int i = 0; i < rotation; i++){
		int count = (int)(Math.random()* max - min + 1) + min;
		
		//랜덤 숫자를 출력하는 식
		System.out.println("랜덤 숫자입니다. :" + count);
		//구한 랜덤 숫자를 result 안의 숫자와 비교하는 식
		for (int j = 0; j < array.length; j++){
			if(count == array[j])
				result[j] = result[j] + 1;
		}
	}
	
	System.out.println(Arrays.toString(result));
	//출력하는 코드
	for(int i = 0; i < array.length; i++){
		System.out.println(min + "은 " + result[i]+ "번 출력되었습니다.");
		min++;
	}
	
	
	
}//건들지 말것
}
