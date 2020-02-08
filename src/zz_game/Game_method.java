package zz_game;
import java.util.Scanner;
public class Game_method {

	Scanner s = new Scanner(System.in);
	String next;
	String name;
	
	void intro (){
		System.out.println("연애 시뮬레이션 게임, 'FIND MY LOVE' 에 오신 것을 환영합니다.>(엔터)");
		next = s.nextLine();
		System.out.println("당신은 이제부터 게임의 주인공이 되어,>(엔터)");
		next = s.nextLine();
		System.out.println("가상의 상대와 연애를 해볼 수 있습니다.>(엔터)");
		next = s.nextLine();
		System.out.println("물론, 상대의 호감도를 잘 쌓아야 가능하다는 것을 잊지 마세요!>(엔터)");
		next = s.nextLine();
		System.out.println();
	}
	
	
	
	
	
}
