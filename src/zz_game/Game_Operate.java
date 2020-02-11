package zz_game;
import java.util.Scanner;

public class Game_Operate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game_method game = new Game_method();
		
		System.out.println("------------------------------------");
		game.intro();
		game.selectCharater();
		game.Story();
		
	}

}
