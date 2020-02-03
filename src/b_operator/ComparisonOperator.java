package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * <<비교연산자>>
		 * 
		 * - < : 작다
		 * - > : 크다
		 * - <=: 작거나 같다 (부등호 뒤에 등호가 있어야 합니당)
		 * - >=: 크거나 같다
		 * - ==: 같다
		 * - !=: 같지않다
		 * 
		 * */
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 <= 20 - 15;
		System.out.println(b);
		//Ctrl + Space : 자동완성
		
		//float과 double을 비교할때는 형변환에 주의해야한다.
		b = 10.0f == 10.0; //true
		System.out.println(b);
		//이항 연산자는 양쪽에 있는 타입이 서로 같아야 연산을 할 수 있음!!!
		
		b = 10.1f == 10.1; //false
		System.out.println(b);
		
		//실수같은 경우에는 값을 정확하게 표현하지 못하고 가까운 근사치의 값을 표현하게 된다.
		//float같은 경우 숫자 7자리는 정확하게 표현/그 뒤로 넘어가면 정말도가 떨어짐.
		//double같은 경우 숫자 15자리는 정확하게 표현/그 뒤로 넘어가면 정밀도가 떨어짐.
		
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1);
		
		//double을 flaot으로 형변환해야 정확하게 비교할 수 있다. 
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b); //같은 스트링 리터럴은 같은 주소를 갖는다.
		//스트링은 참조형 타입. 값을 실제로 변수에 저장하는 게 아니라 주소를 변수에 저장함.
		
		b = "abc" == new String("abc");
		System.out.println(b);
		//주소가 서로 달라서 false가 나옴. new가 새로운 주소를 만드는 역할을 해준다.
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 연산자로
		//내용을 비교할 수 없다.
		//String의 내용을 비교하기 위해서는 equals()메소드를 사용한다.
		
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		b = !"abc".equals(new String("abc"));
		System.out.println(b);
		
		
		//다음의 문장들을 코드로 작성해주세요.
		
		//1보다 2가 큰가?
		b = 1 < 2; 
		System.out.println("1보다 2가 큰가? " + b);
		
		//0은 100보다 작거나 같은가?
		b = 0 <= 100;
		System.out.println("0은 100보다 작거나 같은가? " + b);
		
		//3.14f와 3.14는 다른가?
		b = 3.14f != 3.14;
		System.out.println("3.14f와 3.14는 다른가? " + b);
		
		//"남자"와 "여자"는 다른가?
		b = !"남자".equals("여자");
		System.out.println("남자와 여자는 다른가? " + b);
		
	}

}
