package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * <<논리 연산자>>
		 * - &&(AND) :피연산자 둘다 true 이면 true를 결과로 얻는다.
		 * - ||(OR) : 피연산자 중 하나라도 true 이면 true를 결과로 얻는다.
		 * - !(NOT) :피연산자가 true 이면 false를 false이면 true를 결과로 얻는다.
		 * - 피연산자로 boolean만 허용한다.
		 * 
		 * 
*/
		int a = 6;
		//a가 0보다 크다.
		boolean b1 = 0 < a;
		
		//a가 10보다 작거나 같다.
		boolean b2 = a <= 10;
		
		//a가 0보다 크고 10보다 작거나 같다.
		boolean b = b1 && b2;
		b = 0 < a && a <= 10;
		
		//a가 2의 배수이거나 3의 배수인가?
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println("a가 2의 배수이거나 3의 배수인가? " + b);
		
		//a가 2의 배수이거나 3의 배수이고 10 이하인가?
		b = (a % 2 == 0 || a % 3 == 0 ) && a <= 10;
		System.out.println("a가 2의 배수이거나 3의 배수이고 10 이하인가? "+ b);
		//and와 or이 둘 다 있을 경우 and의 우선순위가 더 높다. 
		
		char c = 'l';
		//c는 숫자인가?
		b = '0' <= c && c <= '9';
		System.out.println("c는 숫자인가? " + b);
		
		//c는 영문소문자인가?
		b = 'a' <= c && c <= 'z';
		System.out.println("c는 영문소문자인가? " + b);
	
		//논리 연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		b = true && true;
		b = true && false;
		b = false && true; //연한 노란색 줄->dead 코드
		b = false && false;
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		int d = 10;
		b = d < 10 && 0 < d++;//d++은 실행했을때 d를 1 증가하는 코드
		System.out.println(d); //벗 && 앞부분에서 false되서 뒷부분이 데드코드가 되었으므로
		//d는 10 그대로 출력된다.
		
		b = !b;
		b = !(10 < 20); //연산에 not을 붙일 떄는 꼭 괄호를 쳐서 붙여주자.
		
		int x = 1, y = 2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		// 산술->비교->논리 순으로 수행이 됨. 
		
		//다음의 문장들을 코드로 작성해주세요.
		//x가 0보다 크거나 같고 10보다 작다.
		b = x >= 0 && x < 10;
		System.out.println("x가 0보다 크거나 같고 10보다 작다. " + b);
		//x가 2의 배수이거나 3의 배수이고 20이하이다.
		b = (x % 2 == 0 || x % 3 == 0 ) && x < 20;
		System.out.println("x가 2의 배수이거나 3의 배수이고 20이하이다. " + b);
		
		
	}

}
