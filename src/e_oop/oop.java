package e_oop;
import java.util.Arrays; 
import java.util.Scanner;

public class oop {

	public static void main(String[] args) {
		/*
		 * <<OOP(Object Oriented Programming) : 객체 지향 프로그래밍 >>
		 * 
		 * - 프로그래밍을 단순한 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(Heap 영역) 에 올려놓은 것.
		 * -  new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * - 객체는 생성될때마다 새로운 객체가 생성되고, 여러 개의 객체가 동시에 존재할 수 있다.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		/*SampleClass sc = new SampleClass();
		//클래스 명을 변수명으로 사용
		
		sc.metod1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.flowTest1();//호출했을 때 출력되는 문장에 번호를 붙여주세요.
		System.out.println("-------------------------");
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker s = new ClassMaker();
		//객체가 저장된 변수를 통해 메소드를 호출해주세요.
		//파라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해주세요.
		
		s.numberMethod();
		System.out.println(s.numberMethod2());
		s.numberMethod3(3);
		System.out.println(s.numberMethod4(3, 4));
		
		Calulator a = new Calulator();
		double number1 = a.plus(123456,654321);
		double number2 = a.multiply(number1,123456);
		double number3 = a.division(number2,123456);
		double number4 = a.minus(number3,654321);
		double number5 = a.remainder(number4,123456);
		
		System.out.println("number5: " + number5);
		
		
		*/
		Scanner sc = new Scanner(System.in);
		SimLiTest st = new SimLiTest();
		
		System.out.println("------------------------------------");
		System.out.println("심리테스트 시작");
		st.question1();
		
		

	}//건들지말것
}//건들지말것
