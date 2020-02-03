package a_variable;

import java.util.Scanner;
//ctrl+shift + o

public class Variable {

	public static void main(String[] args) {
		
		//변수 선언 방법: 데이터 타입 + 변수 이름
		byte _byte;
		char _char;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 떄는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다. 
		//System.out.println(_byte); //컴파일에러(문법이 틀렸다)
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다. (오른쪽 먼저 연산)
		_byte = 10; //타입에 맞는 값을 저장해야 한다. 
		_short = 20;
		_int = 30;
		_long = 40L;//long 접미사 : L
		_float = 3.14f; //float 접미사: f
		_double = 3.14; //double 접미사 :d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것 
		
		System.out.println(_int);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디버그 실행
		
		_int = 100;
		System.out.println(_int);
		
		_int = 100 + 200;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		_byte = 10;
		_short = 20;
		_int = 30;
		_long = 40L;
		_float = 50.1f;
		_double = 60.1;
		_char = '나';
		_boolean = false;
		

		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		String _String = new String("abcd");
		
		_String = "1234";
		System.out.println(_String);

		_byte = 127;
		_int = 128;
		_byte = (byte)_int;
		System.out.println(_byte); //128 - > -128(오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte); //-129 -> 127(언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다. 
		
		_double = 3.15;
		_int = (int)_double;
		System.out.println(_int);
		
	//표현범위가 작은 타입에서 큰 타입으로 형변환할 경우 데이터가 손실될 염려가 없다.
	//그러므로 형변환을 생략할 수 있다. 
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
	//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.(3번)	
		_int = (int)_double;
		_byte = (byte)_int;
		_int = (int)_long;
		
		
	//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요.(3번)
		_long = _int;
		_double = _int;
		_int = _byte;
		
		/*상수
		 * -값을 한 번 저장하면 변경할 수 없는 저장공간
		 * -final int MAX_NUMBER;
		 * -리터럴에 의미를 부여하기 위해 사용한다. 
		 * 
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 20;
		//MAX_NUMBER = 100;
		
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);
		/*
		System.out.println("문자열을 입력해주세요.");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열 : " + input1);*/
		/*
		System.out.println("숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자: " + input2);*/
		
		/*//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		System.out.println("문자를 입력해주세요.");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자: " + input1);
		
		//숫자를 입력받고 입력받은 숫자를 출력해주세요.
		System.out.println("숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자: " + input2);
		
		//위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
		
		System.out.println(input1 + input2);*/
		
		/*//3개의 숫자를 입력받고 그 숫자들을 더한 결과를 출력해주세요.
		System.out.println("첫 번째 숫자를 입력해주세요.");
		int input1 = Integer.parseInt(s.nextLine());
		System.out.println("두 번째 숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("세 번째 숫자를 입력해주세요.");
		int input3 = Integer.parseInt(s.nextLine());
		System.out.println("세 수를 더한 값:" + (input1 + input2 + input3));*/
		
		
		//아이디, 비밀번호, 이름, 전화번호, 이메일을 입력받고 
		//마지막에 입력받은 내용 전체를 출력해주세요.
		/*System.out.println("아이디를 입력해주세요.");
		String id = s.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		int secretnumber = Integer.parseInt(s.nextLine());
		System.out.println("이름을 입력해주세요.");
		String name = s.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		int phoneNumber = Integer.parseInt(s.nextLine());
		System.out.println("이메일을 입력해주세요.");
		String email = s.nextLine();
		System.out.println("아이디: " + id + " 비밀번호: "+ secretnumber +" 이름: "+ name +" 전화번호: "+ phoneNumber +" 이메일: " + email);*/
	
	
		System.out.println("");
	}

}
