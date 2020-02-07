package z_exam;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
		/*[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
		하시오.
		//답: d -> 길이를 설정하고 바로 내용물을 넣을 수 없다. 
		      e -> 배열을 선언할 때에는 배열의 크기를 지정할 수 없다. 
		 
		a. int[] arr[]; -> 올바른 1차원 배열 선언을 하였다. 
		b. int[] arr = {1,2,3,}; -> arr라는 배열 안에 1,2,3 을 저장하였다. 
		c. int[] arr = new int[5];-> arr라는 배열을 선언하고 배열의 크기를 정해주었다. 
		d. int[] arr = new int[5]{1,2,3,4,5}; 
		e. int arr[5];
		f. int[] arr[] = new int[3][]; -> arr라는 2차원 배열을 설정하고 가변 배열 설정해주었다. 
		
		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
		//답 : 2
		--> arr[3]은 2중 배열 arr의 인덱스 3 의 길이(length)를 뜻하므로,
			arr[3]인 {30, 50}의 길이를 뜻한다 -> 2
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{ 10, 10, 10},
		{ 20, 20, 20, 20},
		{ 30, 30}
		};
		
		
		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_3.java
		class Exercise5_3
		{
		public static void main(String[] args){
		
			int[] arr = {10, 20, 30, 40, 50}; //int 배열 arr의 값이 10,20,30,40,50 이다.
			int sum = 0; //int sum 의 값이 0이다. 
		(1) 알맞은 코드를 넣어 완성하시오.
		
			System.out.println("sum="+sum); //"sum="이라는 문자열과 sum이라는 변수 값을 출력한다.
			}
		}
		
		[실행결과]
		sum=150
		
		//답: 
		 for(int i = 0; i < arr.length; i++){ 
		 //int i 가 배열 arr의 길이만큼 작을 동안 {}안의 문장을 반복하고 i를 1씩 증가시킨다.
		  
		 	sum += arr[i];
		 	//sum이라는 변수에 sum과 배열 arr의 인덱스 i 를 더한 값을 저장시켜라. 
		 }
		 
		
		
		*
		*
		*
		*
		*[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_4.java
		class Exercise5_4{
		public static void main(String[] args){
			int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
							};
		//2차원 배열 arr는 인덱스 1에는 { 5, 5, 5, 5, 5},
		  			      인덱스 2에는 {10,10,10,10,10},
		 			      인덱스 3에는 {20,20,20,20,20},
					      인덱스 4에는 {30,30,30,30,30}의 값을 가지고 있다.
		
		int total = 0; //total 이라는 int 변수는 0값이다.
		float average = 0; // arverage라는 float 변수는 0값이다.
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		System.out.println("total="+total); // "total="이라는 문자열과  total이라는 변수값을 출력하라.
		System.out.println("average="+average); //"average="이라는 문자열과 average라는 변수값을 출력하라.
		} // end of main
		} // end of class
		
		[실행결과]
		total=325
		average=16.25
		
		
		//답: 
		  
		 int count = 0; //int변수 count 는 0값을 가지고 있다. 
		 
		for(int i = 0; i < arr.length; i++){ 		//int i는 0이고,i 가  arr의 길이만큼 작을 동안 
													//{}안의 식을 실행시키고 i 를 1씩 늘린다. 
			for(int j = 0; j < arr[i].length; j++){ 
													//int j 는 0이고, j가 arr[i]의 길이만큼 작을 동안 {}안의 값을 실행시킨다. 
			total += arr[i][j]; 					// total이라는 변수에 total + arr[i][j]값을 저장한다.
			count += 1; 							//count라는 변수에 count + 1의 값을 저장한다. 
			}
			
		}
		
		average = total / (float)count; //average 라는 변수를 total을 count를 float화 한 값으로 나눈다. 	
		
		
		
		*[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 
		*	(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
		[연습문제]/ch5/Exercise5_5.java
		class Exercise5_5 {
		public static void main(String[] args) {
		
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9}; //1차원 배열 ballArr는 1,2,3,4,5,6,7,8,9 의 값을 가지고 있다. 
		int[] ball3 = new int[3]; //1차원 배열 ball3는 3개의 인덱스 길이를 가지고 있다. 
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		
		for(int i=0; i< ballArr.length;i++) {		//int i 는 0이고, i 가 ballArr의 길이보다 작을 동안 {}안의 식을 실행시킨 뒤, i값을 1씩 증가시켜라. 
											
			int j = (int)(Math.random() * ballArr.length); //int j 는 ballArr의 길이만큼의 최대값을 가지는 랜덤한 숫자의 수를 저장하고 있다. 
			int tmp = 0; // int tmp는 0이다. 
		
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		 
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		 (2) 
		 
		for(int i=0;i<ball3.length;i++) { //int i 는 0이고, i가 ball3의 길이보다 작을 동안 {}안의 값을 실행시키고 i 를 1씩 추가시킨다. 
		System.out.print(ball3[i]); //ball3의 i번째 인덱스 값을 출력하라.
			}
			
		} // end of main
		} // end of class
		
		[실행결과]
		486
		
		//답(1): temp = ballArr[j];	//temp 는 ballArr의 j번째 인덱스를 가지고 있다.
		 		 ballArr[j] = ballArr[i];//ballArr의 j번째 인덱스는 ballArr의 [i]번째 인덱스를 가지고 있다.
		 		 ballArr[i] = temp; //ballArr의 i번째 인덱스는 temp값을 가지고 있다.
		    답(2): 
		    for(int i = 0; i < 3; i++){
		    	ball3[i] = ballArr[i]' //ball3의 i번째 인덱스는 ballArr의 i번째 인덱스이다. 
		    } //int i 는 0이고, i 가 3보다 작은 동안 {}안의 식을 실행시키고 i 를 1씩 늘려라.
		
		
		*[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
		프로그램을 완성하시오.
		
		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		
		[연습문제]/ch5/Exercise5_6.java
		class Exercise5_6 {
		public static void main(String args[]) {
		
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int[] coinUnit = {500, 100, 50, 10}; 		//int coinUnit에는 500,100,50,10의 값이 저장되어있다.
		int money = 2680; 							//int money 에는 2680만큼의 값이 저장되어 있다.
		System.out.println("money="+money); 		//"money="라는 문자열과 money 라는 변수를 출력하라.
		for(int i=0;i<coinUnit.length;i++) {
													//int i 는 0이고, i 가 coinUnit의 길이보다 작을 동안 {}안의 식을 실행시키고 i 를 1씩 늘려라.
				(1) 알맞은 코드를 넣어 완성하시오.
		 }
		} // main
		}
		
		[실행결과]
		money=2680
		500원: 5
		100원: 1
		50원: 1
		10원: 3
		*
		*
		//답 : needCoin[i] = money / coinUnit[i];  //needCoint배열의 i 번째 인덱스에 money를 coinUnit의 i번쨰 인덱스로 나눈 값을 넣어라. 
		 * 	  money %= coinUnit[i];		//money에 money값에 coinUnit의 i번째 인덱스를 나눈 나머지값을 저장한다. 
		 	  
		 	  for(int i = 0; i < needCoin.length; i++){ //int i 는 0이고 i 가 needCoin의 길이보다 작은 동안 {}안의 식을 실행시키고 i를 1씩 늘린다. 
		 	  	System.out.println(coinUnit[i] + "원: " + needCoin[i]);
		 	  	//coinUnit의 i번째 인덱스와 "원: "이라는 문자열, needCoin의 i번째 인덱스를 출력한다. 
		 	  	
		 	  }
		*[5-7] 
		문제 5-6에 동전의 개수를 추가한 프로그램이다. 
		커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
		
		보유한 동전의 개수로 거스름돈을 지불할 수 없으면, 
		‘거스름돈이 부족합니다.’라고 출력하고 종료한다. 
		지불할 돈이 충분히 있으면, 
		거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_7.java
		class Exercise5_7{
		public static void main(String args[]){
		
		
			if(args.length!=1) { 
				System.out.println("USAGE: java Exercise5_7 3120");
				System.exit(0);
			}
		
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]); //int money에 arg의 0번 인덱스값을 숫자로 바꾼 값을 저장한다.
		System.out.println("money="+money); //"money="라는 문자열과 money라는 변수값을 출력한다.
		
		int[] coinUnit = { 500, 100, 50, 10 }; 			// 동전의 단위
		int[] coin = {5, 5, 5, 5}; 						// 단위별 동전의 개수
		for(int i=0;i<coinUnit.length;i++) { 			//동전단위의 길이만큼 실행하는 for문
		int coinNum = 0; 								// 필요한 동전의 개수
		
		
			(1) 아래의 로직에 맞게 코드를 작성하시오.
				1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
				2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
				(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
				3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			
			System.out.println(coinUnit[i]+"원: "+coinNum); //결과 출력 
		}
		if(money > 0) { //돈이 0보다 작다면
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");//남은 동전의 개수를 프린트
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
		} // main
	}
	
		//답:
		 * 
		 int coinNum = 0;
		 coinNum = money/coinUnit[i];
		 if(coin[i] >= coinNum){ //가진 동전의 개수가 필요한 동전의 개수보다 많다면
		 	coin[i] -= coinNum; //가진동 전의 개수는: 가진 동전의 개수-필요한 개수
		 }else{	//그렇지 않다면(가진 동전의 개수가 필요한 동전의 개수보다 적다면)
		 	coinNum = coin[i]; //필요한 동전의 개수는 가진 동전 전부이다.
		 	coin[i] = 0;	//가진 동전은 0이 된다.
		 }
		  	money -= coinNum * coinUnit[i];  //전체 금액은 필요한 동전의 개수 * 동전 단위 이다. 
		 
		
		
		[참고] 실행결과는 다음 페이지에 있다.
		*[실행결과]
		C:\jdk1.8\work\ch5>java Exercise5_7
		USAGE: java Exercise5_7 3120
		C:\jdk1.8\work\ch5>java Exercise5_7 3170
		money=3170
		
		500원: 5
		100원: 5
		50원: 3
		10원: 2
		
		=남은 동전의 개수 =
		500원:0
		100원:0
		50원:2
		10원:3
		
		C:\jdk1.8\work\ch5>java Exercise5_7 3510
		money=3510
		500원: 5
		100원: 5
		50원: 5
		10원: 5
		
		거스름돈이 부족합니다.
		
		
		[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
		을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
	 	   class Exercise5_8 {
			public static void main(String[] args) {
				int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; //숫자
				int[] counter = new int[4]; //별 길이를 담을 변수
				for(int i=0; i < answer.length;i++) { //answer 안에 담긴 숫자의 개수를 세는 for문
				(1) 알맞은 코드를 넣어 완성하시오. = 
					counter[answer[i]-1]++;  
					
			 }
			 	
			 
				for(int i=0; i < counter.length;i++) { //별을 찍는 for문
			 		(2) 알맞은 코드를 넣어 완성하시오. = 
			 		for(int j = 0; j < counter[i]; j++){//counter의 2차원 배열 인덱스만큼 별을 찍는 for문
			 			System.out.print("*");
			 		
			 		}
				System.out.println();
					
			}
			
		} // end of main
		
			  [실행결과]
			3***
			2**
			2**
			4****
			  
	
		[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
		
		//답: 
		 
		 
		[연습문제]/ch5/Exercise5_9.java
		class Exercise5_9 {
		public static void main(String[] args) {
		char[][] star = {
		{'*','*',' ',' ',' '},
		{'*','*',' ',' ',' '},
		{'*','*','*','*','*'},
		{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
		System.out.print(star[i][j]);
		}System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
		System.out.print(result[i][j]);
		}System.out.println();
		}
		} // end of main
		} // end of class
		[실행결과]
		*
		[실행결과]
		**
		**
		*****
		*****
		****
		****
		**
		**
		
		[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		(1)에 알맞은 코드를 넣어서 완성하시오.
			//답:
			 if('a' <= ch && ch < 'z'){
			 	result += abcCode[ch - 'a'];
			 }else{
			 	result += numCode[ch - '0'];
			 }
		[연습문제]/ch5/Exercise5_10.java
		class Exercise5_10 {
		public static void main(String[] args) {
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*',
		'(',')','-','_','+','=','|','[',']','{',
		'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
		char ch = src.charAt(i);
		
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		} // end of main
		} // end of class
		0 1 2 3 4 5 6 7 8 9
		q w e r t y u i o p
		u v w x y z
		} ; : , . /
		a b c d e f g h i j k l m n o p q r s t
		` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
		[실행결과]
		src:abc123
		result:`~!wer
		
		
		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
		의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
		에 알맞은 코드를 넣어서 완성하시오.
		//답: result[i][j] = score[i][j];
		  행 합: result[i][score[0].length] += result[i][j];
		 열 합: result[score[0].length][j] += result[i][j];
		 모두의 합(못적음)
		 
		 
		[연습문제]/ch5/Exercise5_11.java
		class Exercise5_11
		{
		public static void main(String[] args)
		{
		int[][] score = {
		{100, 100, 100}
		, {20, 20, 20}
		, {30, 30, 30}
		, {40, 40, 40}
		, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
			
		(1) 알맞은 코드를 넣어 완성하시오.
		 }
		}
		for(int i=0; i < result.length;i++) {
		for(int j=0; j < result[i].length;j++) {
		System.out.printf("%4d",result[i][j]);
		}S
		ystem.out.println();
		}
		} // main
		}
		[실행결과]
		100 100 100 300
		20 20 20 60
		30 30 30 90
		40 40 40 120
		50 50 50 150
		240 240 240 720
		
		
		[5-12] 예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
		
		<<예제 5-23 적기>>
		import java util.*;
		class MultiArrEx4 {
			public static void main (String[] args){
				String[][] words = {
					{"chair","의자"},	//words[0][0], words[0][1]
					{"computer","컴퓨터"},	//words[1][0], words[1][1]
					{"integer","정수"},	//words[2][0], words[2][1]
				};
				Scanner scanner = new Scanner(System.in);
				
				for(int i = 0; i <words.length; i++){
					System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
					String tmp = scanner.nextLine();
					
					if(tmp.equals(words[i][1])){
						System.out.printf("정답입니다. %n%n");
					}else {
						System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n",words[i][1]);
					}
				
				
				} //for
			}//main 의 끝
		}
		
		Q1. chair의 뜻은? dmlwk
		틀렸습니다. 정답은 의자입니다
		Q2. computer의 뜻은? 컴퓨터
		정답입니다.
		Q3. integer의 뜻은? 정수
		정답입니다.
		전체 3문제 중 2문제 맞추셨습니다.

		[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와
		같이 동작하도록 예제의 빈 곳을 채우시오.
		
		[연습문제5-13]/ch5/Excercise5_13.java
		import java.util.Scanner;
		class Exercise5_13 {
		public static void main(String args[]) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<words.length;i++) {
		char[] question = words[i].toCharArray(); // String을 char[]로 변환
		
		(1) 알맞은 코드를 넣어 완성하시오.
		char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
		//답:
		 *  char temp = ' ';
		 *  for(int j = 0; j <question.length; j++){
		 *  	int random = (int)(Math.random()*question.length);
		 *  	temp = question[0];
		 *  	question[0] = question[random];
		 *  	question[random] = temp;
		 *  
		 *  }
		 *  
		 *
		 
		System.out.printf("Q%d. %s의 정답을 입력하세요.>",
		i+1, new String(question));
		String answer = scanner.nextLine();
		// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
		if(words[i].equals(answer.trim()))
		System.out.printf("맞았습니다.%n%n");
		else
		System.out.printf("틀렸습니다.%n%n");
		}
		} // main의 끝
		}
		
		
		[실행결과]
		Q1. lvtsieeoin의 정답을 입력하세요.>television
		맞았습니다.
		Q2. otepcumr의 정답을 입력하세요.>computer
		맞았습니다.
		Q3. usemo의 정답을 입력하세요.>asdf
		틀렸습니다.
		Q4. ohpne의 정답을 입력하세요.>phone
		맞았습니다.
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*/
		
		

	}

}
