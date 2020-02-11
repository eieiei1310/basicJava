package e_oop;

public class ClassMaker2 {
	//메서드 밖에서는 변수 선언밖에 못한다고 한다. 호출 불가능.
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	static String str = "홍길동";
	
	//위에서 선언한 전역변수를 초기화 블록을 사용해 초기화 해주세요.
	static {
		str = "이순신";
	}
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(String str){
		this.str = str;
	}
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this("세종대왕");
	}
	
	//초기화 순서: 명시적 초기화 > 초기화 블럭 > 생성자 순으로 
	
}
