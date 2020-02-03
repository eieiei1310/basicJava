package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<산술 연산자>>
		 * - + :더하기
		 * - - :빼기
		 * - * :곱하기
		 * - / :나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 * 
		 * */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		//*, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20;
		
		a = c - b;
		//자바는 기본적으로 연산할 때 최소한 4바이트를 필요로 함.
		//byte나 short는 4바이트보다 작으므로 c = c - b;를 하면 오류가 남.
		//기본적으로 int로 형변환이 되게 됨.
		
		long e1 = 1000000 * 1000000;
		System.out.println(e1);
		//int가 저장 가능한 값을 벗어나서 오버플로우가 발생함.
		//오버플로우가 발생하지 않으려면 연산 자체부터 int보다 큰 타입으로 해야함. 
		
		long e2 = 1000000 * 1000000L; 
		//피연산자 중 하나는 long 이여야 결과로 long을 얻을 수 있다. 
		System.out.println(e2);
		
		double f1 = 10 / 4;
		System.out.println(f1);
		double f2 = 10 / 4.0;
		System.out.println(f2);
		
		int f3 = 10 % 4; //10을 4로 나눈 나머지
		System.out.println(f3);
		//정수는 0으로 나눌 수 없다. 
		//int g1 = 10 / 0; //실행했을 때 발생하는 에러: 런타임 에러 
		
		float g2 = 10.0f / 0;
		System.out.println(g2); // 실수는 0으로 나누면 -> Infinity : 무한대
		float g3 = 0 / 0f;
		System.out.println(g3); // 숫자가 아님 -> Not a Number 
		
		int h1 = 'A' + 1; //char을 연산하면-> int로 바뀌어서 계산됨(4바이트보다 작음->자동 4바이트)
		System.out.println(h1);
		
		int h2 = 'D' - 'A'; //char 을 char과 연산하면-> int로 바뀌어서 계산됨
		System.out.println(h2);
		
		int h3 = '5' - '0'; //char 문자 5 - 0 = 5(실제 5 -0과 같은 값)
		System.out.println(h3);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다. 
		int i = 0;
		i = i + 1;
		i += 1; //복합 연산자
		
		i = i -1;
		i -= 1;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		//더하기 빼기의 경우에는 더 간단한 것이 있음.
		++i; //전위형: 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		
		--i;
		i--;
		
		i = 0; 
		System.out.println("++i = " + ++i);
		i = 0; 
		System.out.println("i++ = " + i++);
		System.out.println(i);
	
		//반올림을 하기 위해 0.5를 더하고  소수점을 없애기 위해 int로 형변환 한다.
		double round = 50.56;
		System.out.println((int)(round+0.5));
		System.out.println(Math.round(round)); //소수점 첫째자리에서 반올림.
		System.out.println((int)(round * 10 + 0.5)/ 10.0 ); //소수점 둘째자리에서 반올림.
		
		//소수점 둘째 자리에서 반올림을 하고 싶음.(연습한것)
		double test = 10.35;
		System.out.println((int)(test * 10 + 0.5)/ 10.0);
		System.out.println(Math.round(test * 10)/10.0);//Math.round를 이용해서 둘째자리 반올림 해봄.
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long test1 = 123456 + 654321;
		long test2 = test1 * 123456;
		long test3 = test2 / 123456;
		long test4 = test3 - 654321;;
		long test5 = test4 % 123456;
		
		System.out.println("test5 : " + test5);
		
		//선생님 풀이
		long result = 123456 + 654321;
		result *= 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//평균은 소수점 둘째자리에서 반올림해주세요.
		
		int count1 = 12;
		int count2 = 39;
		int count3 = 45;
		
		int sum = count1 + count2 + count3;
		double average = sum / 3.0;
		
		System.out.println("합계 : " + sum + "평균 : " + average);
		//소수점 두자리에서 반올림하기는 이후 작업할것
		
		
		
		
		//선생님 풀이:
		int num1 = 15;
		int num2 = 38;
		int num3 = 87;
		
		int sum2 = num1 + num2 + num3;
		double avg = (int)((sum2/3.0) * 10 + 0.5) /10.0;
		System.out.println("합계 : " + sum2 + "/평균 : " + avg );
	}
	
	

}
