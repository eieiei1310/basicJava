package movietheator;

public class Game_movie {
	String name;
	int movieNum;
	String info;
	String[] time;
	Game_movie(String name, int movieNum){
		this.name = name;
		this.movieNum = movieNum;
	}
}

class movie1 extends Game_movie{
	movie1(){
		super("기생충               ",0); 
		info = "천만 관객을 모은 한국영화 최고 흥행작! ";
	}
	
	
}
class movie2 extends Game_movie{
	movie2(){
		super("타이츠타닉 ",1);
		info = "침몰해가는 배 타이츠타닉에서 이루어지는 극적인 사랑 이야기";
	}
	
	
	
}
class movie3 extends Game_movie{
	movie3(){
		super("토리 스토리",2);
		info = "내가 가진 인형이 움직인다? 알 수 없는 공포가 다가온다! 충격 스릴러";
	}
}
class movie4 extends Game_movie{
	movie4(){
		super("스티븐 집스",3);
		info = "가난한 공대생 스티븐 집스의 인생 역전기.";
	}
	
	
}
class movie5 extends Game_movie{
	movie5(){
		super("컨쟈 링스     ",4);
		info = "죽어서도 사랑하는 사람을 잊지 못한 한 수녀의 가슴 아픈 실화 스토리.";
	}
	
}
class movie6 extends Game_movie{
	movie6(){
		super("람보르기니  ",5);
		info = "미국인! 전쟁! 기관총! 이 세가지면 모든 내용을 설명할 수 있는 영화! ";
	}
	
}
class movie7 extends Game_movie{
	movie7(){
		super("나홀로집에 ",6);
		info = "크리스마스에 꼭 봐야 하는 슬랩스틱 가족 코미디 영화";
	}
	
}
class movie8 extends Game_movie{
	movie8(){
		super("죽은시인의사회",7);
		info = "여러 번의 해결되지 않은 미제 연쇄살인사건.. 그 모든 사건의 뒤에는 한 시인이 존재하는데..?";
	}
	
}
class movie9 extends Game_movie{
	movie9(){
		super("미생            ",8);
		info = "하이퍼리얼리즘 회사생활 다큐멘터리. 본 사람들 모두 기가 빨려서 응급실에 실려갔다고...";
	}
	
}
class movie10 extends Game_movie{
	movie10(){
		super("캡틴 마블   ",9);
		info = "세상에서 가장 센 고양이를 보고 싶다면 봐야 하는 영화 ";
	}
	
}



