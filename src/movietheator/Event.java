package movietheator;

import java.util.Scanner;

public class Event {
	
	Scanner s = new Scanner(System.in);
	
	String[] text = new String[] {
								"손님정말죄송합니다하지만규정상이런경우에는환불이불가하시구요저도정말마음이아프지만",
								"정말죄송합니다정말죄송합니다정말죄송합니다제가어떻게하면될까요무릎이라도꿇을까요정",
								"손님여기서이러시면안됩니다손님제발모니터는부수시면안됩니다차라리절밟으세요제발잠깐",
								"네사장님부르겠습니다네정말죄송합니다저도이런일이생겨마음이정말아프구요다음번에는꼭"
								};
	void jinsangEvent1(){
		Game_Method.jinsangPoint = 0;
		for(int i = 0; i<10; i++){
			int randomtext = ((int)(Math.random()*4)+1)-1;
		}
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		Game_Method.next = s.nextLine();
		System.out.println("(system) > 영화관에 폭풍 전 바다처럼 긴장감이 감돕니다.(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) > 불길한 예감은 역시 틀리지 않는 것일까요?(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) > 당신은 홍해처럼 갈라지는 군중들 사이로 한 손님을 발견했습니다.(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) > 그(그녀)는 온갖 영화관을 다니며 알바들을 괴롭히기로 유명한 진상 A였습니다.(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 진상A: 내가 왼쪽 눈에 다래끼가 나서 영화를 절반밖에 못 봤는데 영화비는 전부 다 냈어. (엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 진상A: 빨리 절반 환불해줘. (엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□ 나: 네...?? (엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 진상A: 빨리 환불해달라고!!!!!!! (엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□ 미니게임 시작 □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		Game_Method.next = s.nextLine();
		System.out.println("(system) > 다음 문장을 똑같이 따라 치세요. 3회 실수시 실패입니다. (엔터)");
		Game_Method.next = s.nextLine();
		int randomtext = ((int)(Math.random()*4)+1)-1;
		String correct = null;
		int count = 3;
		while(true){
			System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println( text[randomtext] );
			System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println("(system) 똑같이 입력하세요 (입력)>");
			correct = s.nextLine();
			while(correct.equals("")){
				System.out.println("(system) 똑같이 입력하세요. (입력)>");
				correct = s.nextLine();
				if(!correct.equals("")){
					break;
				}
			}
			if(correct.equals(text[randomtext])){
				System.out.println("(system) 성공하셨습니다!");
				correct = s.nextLine();
				System.out.println("■ 진상A: 그래, 그렇게 머리를 조아리란 말이야...(엔터)");
				correct = s.nextLine();
				System.out.println("■ 진상A: 태도가 마음에 들었어. 앞으로도 더 자주 찾아오도록 하지요.(엔터)");
				correct = s.nextLine();
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
				break;
			}
			count--;
			if(count == 0){
				System.out.println("(system)실패하셨습니다.");
				correct = s.nextLine();
				System.out.println("■ 진상A: 뭐 이런 영화관이 다 있어? 당신, 내가 얼굴 기억해둘거야...(엔터)");
				correct = s.nextLine();
				System.out.println("(system) 진상의 난동으로 인해 만족도가 50 내려갔습니다. (엔터)");
				correct = s.nextLine();
				Game_Method.money -= 10000;
				System.out.println("(system) 당신은 진상에게 사비로 영화비를 환불해주었습니다." );
				correct = s.nextLine();
				System.out.println("현재 잔액:" + Game_Method.money + "(엔터)");
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
				Game_Method.happyPoint -= 50;
				break;
			}
		}
		
		
		
		
	}
}
