package c_statement;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		/*
		 * <<if문>>
		 * 
		 * -if      :조건식의 결과가 true 이면 블럭 안의 문장을 수행한다.
		 * -else if : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * -else    : 결과가 true 인 조건식이 하나도 없는 경우를 위해 추가한다.
		 * 
		 * 

		 * */
		int a = 10;
		if (a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		if(a < 10){
			System.out.println("조건절의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 1; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 5){
			gender = "남자";
		}else if(regNo ==2){ //if 블럭 뒤에 else if로 조건을 추가할 수 있다. 
			gender = "여자";
		}else if(regNo == 3){
			gender = "남자";
		}else if(regNo == 4){
			gender = "여자";
		}else{//true 인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		regNo = 1;
		gender = null;
		//수행할 내용이 동일한 경우 논리연산지를 사용해 조건식을 결합할 수 있다. 
		if(regNo == 2 || regNo == 4)//수행할 내용이 한 문장일 경우 블럭을 생략할 수 있다. 
			gender = "여자";
		else if(regNo == 1 || regNo == 3)
			gender = "남자";
		else
			gender = "확인불가";
		System.out.println("당신의 성별은 "+ gender + " 입니다.");
		
		//성적에 등급을 부여하는 프로그램
		/*int score = 30;
		String grade = null;
		
		if(score >= 90){
			grade = "A";
			System.out.println("자넨 " + grade + "점일세");
		}else if(score >= 80){
			grade = "B";
			System.out.println("자넨 " + grade + "점일세");
		}else if(score >= 70){
			grade = "C";
			System.out.println("자넨 " + grade + "점일세");
			System.out.println("성적에 씨뿌리기 하는가? ");
		}else if(score >= 60){
			grade = "D";
			System.out.println("자넨 " + grade + "점일세");
		}else {
			System.out.println("자넨 낙제일세");
			System.out.println("자넨 학교의 수치야");
		}*/
		
		/*int score = 10;
		String grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(70 <= score){
			grade ="C";
			if(78 <= score){
				grade += "+";
			}else if (score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade = "D";
			if(68 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else{
			grade = "F";
			System.out.println("자네는 대학을 어떻게 온 건가?");
			
		}
		System.out.println("당신의 점수는 "+ grade + "입니다.");
	*/
	

	/*
	 * <<switch문>>
	 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
	 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다. 
	 * 
	 * */
	
	regNo = 2;
	gender = null;
	switch(regNo){
		case 1 : case 3 : 
			gender = "남자";
			break;
		case 2 : case 4 :
			gender = "여자";
			break;
		default : // if문의 else와 같은 역할을 한다. 
			gender = "확인불가";
	}
	System.out.println("당신의 성별은 " + gender + " 입니다.");
	
	
	int score = 90;
	String grade = null;
	
	switch(score / 10){
		case 9 : case 10 : //100점일 때도 f가 나오므로 case 10을 추가해 주어야 한다.
			grade = "A";
			break;
		case 8 : 
			grade = "B";
			break;
		case 7 : 
			grade = "C";
			break;
		case 6 : 
			grade = "D";
			break;
		default: 
			grade = "F";
			System.out.println("이런 점수는 태어나서 처음 봐요.");
			
	}
	System.out.println(score +"점에 해당하는 등급은" + grade + " 입니다.");
	
	Scanner s = new Scanner(System.in);
	/*//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
	
	System.out.println("숫자를 입력해 주세요.(1)");
	int input1 = Integer.parseInt(s.nextLine());
	
	if(input1 == 0){
		System.out.println(input1 + "은 0 입니다.");
	}else{
		System.out.println(input1 + "은 0이 아닙니다.");
	}
	
	System.out.println("숫자를 입력해 주세요.(2)");
	String input2 = s.nextLine();
	if(input2.equals("0")){
		System.out.println(input2 + "은 0 입니다.");
	}else{
		System.out.println(input2 + "은 0이 아닙니다.");
	}*/
	
	/*//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
	System.out.println("숫자를 입력해 주세요.(3)");
	int input3 = Integer.parseInt(s.nextLine());
	
	if(input3 == 0){
		System.out.println(input3 + "은 자연수가 아닙니다.");
	}else if(input3 % 2 == 0){
		System.out.println(input3 + "는 짝수입니다.");
	}else{
		System.out.println(input3 + "는 홀수입니다.");
	}*/
	
	/*//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요.
	System.out.println("첫번째 숫자를 입력해 주세요.");
	int num1 = Integer.parseInt(s.nextLine());
	
	System.out.println("두번째 숫자를 입력해 주세요.");
	int num2 = Integer.parseInt(s.nextLine());
	
	if(num1 < num2){
		System.out.println(num2 + " 이 " + num1 + " 보다 더 큽니다.");
	}else {
		System.out.println(num1 + " 이 " + num2 + " 보다 더 큽니다.");
	}*/
	
	//세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
	
	System.out.println("첫번째 숫자를 입력해 주세요.");
	int num1 = Integer.parseInt(s.nextLine());
	
	System.out.println("두번째 숫자를 입력해 주세요.");
	int num2 = Integer.parseInt(s.nextLine());
	
	System.out.println("세번째 숫자를 입력해 주세요.");
	int num3 = Integer.parseInt(s.nextLine());
	
	if(num1 > num2 && num1 > num3){
		System.out.println(num1 + "이 가장 큰 수입니다.");
	}else if(num2 > num1 && num2 > num3){
		System.out.println(num2 + "이 가장 큰 수입니다.");
	}else if(num3 > num1 && num3 > num2){
		System.out.println(num3 + "이 가장 큰 수입니다.");
	}else{
		System.out.println("입력된 수는 중복되면 안됩니다. ");
	}
	
	//숫자를 바로 입력받는 메소드인 s.nextInt()가 있지만 버그가 있으므로 사용하지 말것.
	
	
	
	
	
	
	
	
	
	
}	
}