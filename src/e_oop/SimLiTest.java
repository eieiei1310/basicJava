package e_oop;
import java.util.Scanner;

public class SimLiTest {

	//사용자의 값에 따라 다음 메소드를 실행하면 됨...
	Scanner s = new Scanner(System.in);
	
	void question1 (){
		System.out.println("나는 금사빠다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question2();
		}else if(yesAllNo.equals("NO")){
			question4();
		}
	}
	
	void question2 (){
		System.out.println("연애할 때 끌려다니는 타입이다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question5();
		}else if(yesAllNo.equals("NO")){
			question3();
		}
	}
	void question3 (){
		System.out.println("데이트 코스는 미리 짜는 게 편하다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question6();
		}else if(yesAllNo.equals("NO")){
			question5();
		}
	}
	void question4 (){
		System.out.println("감정기복이 크지 않다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question6();
		}else if(yesAllNo.equals("NO")){
			question5();
		}
	}
	void question5 (){
		System.out.println("감정 표현에 솔직한 편이다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question8();
		}else if(yesAllNo.equals("NO")){
			question6();
		}
	}
	void question6 (){
		System.out.println("활동적인 데이트가 좋다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question8();
		}else if(yesAllNo.equals("NO")){
			question9();
		}
	}
	void question7 (){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			aType();
		}else if(yesAllNo.equals("NO")){
			question8();
		}
	}
	void question8 (){
		System.out.println("이성친구는 존재할 수 없다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			question9();
		}else if(yesAllNo.equals("NO")){
			bType();
		}
	}
	void question9 (){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		System.out.println("YES? NO?");
		String yesAllNo = s.nextLine();
		if(yesAllNo.equals("YES")){
			dType();
		}else if(yesAllNo.equals("NO")){
			cType();
		}
	}
	
	void aType(){
		System.out.println("당신은 A타입 입니다.");
	}
	void bType(){
		System.out.println("당신은 B타입 입니다.");
	}
	void cType(){
		System.out.println("당신은 C타입 입니다.");
	}
	void dType(){
		System.out.println("당신은 D타입 입니다.");
	}
}
