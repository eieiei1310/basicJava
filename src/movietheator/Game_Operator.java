package movietheator;
import java.util.Scanner;
public class Game_Operator {

	public static void main(String[] args) {
		String answer = null;
		Scanner s = new Scanner(System.in);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Game_Method method = new Game_Method();
		System.out.println("(system) 인트로를 스킵하시겠습니까? (입력)>");
		answer = s.nextLine();
		if(answer.equals("y") || answer.equals("Y") || answer.equals("ㅛ") ){
			System.out.println("(system) 인트로를 스킵하였습니다.");
		}else{
			method.intro();
		}
		method.day();
		
		
		/*
		 * intro, tutorial 손님, 영화, 상영관, 날짜, 이벤트, 엔딩
		 * 
		 * --> 안녕하세요 알바면접 보러 왔습니다.
		 * --> 이전 알바가 울면서 나감
		 * --> ?? 바로 채용됨
		 * --> 찝찝함을 느끼며 바로 시작
		 * --> 튜토리얼
		 * --> 이해했니?
		 * --> 아뇨...
		 * --> 하다보면 이해하게 될 거야.
		 * --> 바로 시작!
		 * --> 벌써??
		 * 
		 * 
		 * */
		

		
	}
	
 
}
