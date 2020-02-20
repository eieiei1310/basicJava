package movietheator;

import java.util.Scanner;

public class Ending {
Scanner s = new Scanner(System.in);
	
	void bedEnding(){
		System.out.println("(system) 당신은 영화관의 손님들을 형편없이 다루었습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 분노한 손님들은 당신이 알바하는 영화관의 불매운동을 벌였고 >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 그 결과로 결국 영화관은 망하고 말았습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 알바인 당신은 일자리를 잃고 다른 곳을 전전하다  >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 이상한 사기계약에 휘말려 새우잡이배로 팔려가고 말았습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("          □■□■□■□■□■□■□■□■□■□■□■□■□■□■□ 새우잡이배 엔딩 □■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	}
	void goodEnding(){
		System.out.println("(system) 당신은 영화관의 손님들에게 당신의 모든 정성을 다해 대접했습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 감동한 손님들은 당신이 알바하는 영화관을 더욱 자주 이용하게 되었습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 결과적으로 영화관의 매출률은 당신이 알바한 이후로 최고점을 찍게 되었습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 심지어는, 당신의 손님 중 하나였던 미국 전 대통령인 오바마가, >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 당신이 알바하는 영화관을 언론에서 극찬한 까닭에,>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 영화관은 전 세계에서 유명한 명물 장소가 되었습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 뭐, 한낱 알바생인 당신에게 별로 좋은 일은 아니었던 것 같지만요. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("          □■□■□■□■□■□■□■□■□■□■□■□■□■□■□ 성공엔딩 □■□■□■□■□■□■□■□■□■□■□■□■□■□■□");	
		}
	void normalEnding(){
		System.out.println("(system) 당신은 영화관의 손님들에게 그냥 그렇게 대우했습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 당신에게 손님들은 그냥 알바 장소를 이용하는 사람1 그 이상 그 이하도 아니였습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 결과적으로 당신이 알바한 영화관에는 아무런 변화가 없었습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 뭐, 한낱 알바생인 당신에게 당연한 일이었던 것 같지만요. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("          □■□■□■□■□■□■□■□■□■□■□■□■□■□■□ 노말엔딩 □■□■□■□■□■□■□■□■□■□■□■□■□■□■□");	
	}
	void bankruptcy(){
		System.out.println("(system) 당신은 파산하였습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 당신은 진상손님들의 진상짓들을 잘 막아내지 못했습니다. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 당신은 수많은 기물 파손 비용을 물어주었고 손님들의 말도 안되는 환불 요구를 모두 들어주었습니다.>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 그 결과, 당신은 젊은 나이에 제3금융권에서도 기피하는 신용불량자가 되었습니다.>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("(system) 이제 당신의 빚은 약 241237492313413원 가량이며 당신의 10대 후손까지도 저당잡히게 되었습니다.>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("          □■□■□■□■□■□■□■□■□■□■□■□■□■□■□ 파산엔딩 □■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	}
}
