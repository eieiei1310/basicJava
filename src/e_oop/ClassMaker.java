package e_oop;

public class ClassMaker {

	//전역변수 하나를 선언 및 초기화 해주세요.
	int num = 140;
	
	//리턴타입과 파라미터가 없는 메소드 하나를 만들어주세요.
	//메소드 안에서 전역변수를 출력해주세요.
	
	void numberMethod(){
		System.out.println(num);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메소드 하나를 만들어주세요.
	//메소드 안에서 전역변수를 리턴해주세요.
	
	int numberMethod2(){
		return num;
	}
	//리턴타입은 없고 파라미터가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 파라미터를 출력해주세요.
	
	void numberMethod3(int num){
		System.out.println(num);
	}
	//int타입의 리턴타입과 int타입의 파라미터 두 개가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int numberMethod4(int num, int num2){
		return num * num2;
	}
	
	
	
}

