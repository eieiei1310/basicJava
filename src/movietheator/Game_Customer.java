package movietheator;
import java.util.Scanner;
public class Game_Customer {

	String name;
	int customerNumber;
	Scanner s = new Scanner(System.in);
	
	Game_Customer(String name, int customerNumber){
		this.name = name;
		this.customerNumber = customerNumber;
	}
	
}

class Teacher1 extends Game_Customer{
	Teacher1(){
		super("이진우", 1);
	}
	 void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 이진우: 요즘 엄청 유명한 영화 뭐 있나요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 이진우: 국제적으로 상도 탄 영화였으면 좋겠구...>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 이진우: 기왕이면 한국영화였으면 좋겠어요! >(엔터)");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
		
	}
	 
	 
	
}


class Teacher2 extends Game_Customer{
	Teacher2(){
		super("오바마", 2);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 오바마: dkssudgktpdy. xkdlxkslr qhfj dhkTdjdy. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 오바마: djswp qhkeh ajtwls rhwjs audwkrdlwy....>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□ 나      : 네...? >(엔터)");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
	}
	
}


class Teacher3 extends Game_Customer{
	Teacher3(){
		super("서동미", 3);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 서동미: 전 공포 영화가 좋아요. 섬짓한 영화 추천해 주세요!");
		Game_Method.next = s.nextLine();
		System.out.println("■ 서동미: 뭐 귀신의 집이라던지... 살인 인형이 나온다던지 하는 걸로요!");
		Game_Method.next = s.nextLine();
		System.out.println("■ 서동미: 시시한 영화는 딱 질색이에요.");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
	}
	
}


class Teacher4 extends Game_Customer{
	Teacher4(){
		super("잡스쌤", 4);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 잡스쌤: 글쎄요, 제가 어떤 영화를 보고 싶을까요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 잡스쌤: 어떤 영화를 봐야 제가 잘 봤다고 할까요? 생각해보세요. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□ 나      : '잘못 걸렸다...' >(엔터)");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
		
	}
	
}



class Teacher5 extends Game_Customer{
	Teacher5(){
		super("배미숙", 5);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 배미숙: 좀 감동적인 영화가 보고 싶은데. 그런 영화 있나요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 배미숙: 이왕이면 실화 기반이었으면 좋겠어. >(엔터)");
		Game_Method.next = s.nextLine();                 
		Game_Method.menu();
		
	}
	
}

class Teacher6 extends Game_Customer{
	Teacher6(){
		super("서한별", 6);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 서한별: 저는 미친 미국인이 나와서 기관총으로 모두를 해치우는 영화를 보고싶어요.>(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 서한별: 스트레스 풀리지 않나요? >(엔터)");
		Game_Method.next = s.nextLine();                 
		Game_Method.menu();
		
	}
	
}


class Teacher7 extends Game_Customer{
	Teacher7(){
		super("케빈", 7);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 케빈   : 가족적이고, 유쾌한 영화 추천해주세요. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 케빈   : 그리고 몸개그가 많았으면 좋겠어요! >(엔터)");
		Game_Method.next = s.nextLine();                 
		Game_Method.menu();
		
	}
	
}


class Teacher8 extends Game_Customer{
	Teacher8(){
		super("상진", 8);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 상진   : 손님이 왕이라는 말 몰라요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□ 나      : 네...?? >(엔터)");
		Game_Method.next = s.nextLine();        
		System.out.println("■ 상진   : 왕이라는 말 모르냐고. 당장 매니저 불러와!!! >(엔터)");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
		
	}
	
}


class Teacher9 extends Game_Customer{
	Teacher9(){
		super("김손님", 9);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 김손님: ㅎㅎ 혹시 번호 좀 줄 수 있어요? 나랑 친구해요ㅋ >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("□ 나      :네...? >(엔터)");
		Game_Method.next = s.nextLine();  
		System.out.println("■ 김손님:빨리~ 핸드폰 주세욯ㅎㅎ 카톡추가해줘욯ㅎㅎ >(엔터)");
		Game_Method.next = s.nextLine();
		Game_Method.menu();
		
	}
	
}
class Teacher10 extends Game_Customer{
	Teacher10(){
		super("김냥냥", 10);
	}
	void talk(){
		System.out.println("□ 나      : 안녕하세요, 어떤 영화를 보고 싶으신가요? >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 김냥냥: 저는 고양이를 엄청 좋아해요. >(엔터)");
		Game_Method.next = s.nextLine();
		System.out.println("■ 김냥냥: 그러니까 고양이가 많이 나오는 영화였음 좋겠어요.  >(엔터)");
		Game_Method.next = s.nextLine();                 
		Game_Method.menu();
		
	}
	
}




class Answer{
	Scanner s = new Scanner(System.in);
	 void bedAnwer(){
		System.out.println("■ 손님    :제가 원하는 영화는 그게 아닌데요. 정말 실망입니다. ");
		Game_Method.next = s.nextLine();
		System.out.println("■ 손님    :저를 무시하는 건가요...?");
		Game_Method.next = s.nextLine();
		
	}
	 void goodAnwer(){
		System.out.println("■ 손님    :정말 마음에 들어요! 제 친구에게도 여기를 추천해야겠어요.");
		}
	 
	 void angryAnwer(){
		 System.out.println("■ 손님   : 나를 이렇게 무시하다니, 가만두지 않겠어! ");
		 Game_Method.next = s.nextLine();
		 System.out.println("■ 손님   : 당신... 후회하게 될거야.");
		 Game_Method.next = s.nextLine();
	 }
}

