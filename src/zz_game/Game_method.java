package zz_game;
import java.util.Scanner;
public class Game_method {

	Scanner s = new Scanner(System.in);
	String next;
	String name;
	String[] sex = {"여성" , "남성"};
	String userSex;
	int selectCharater;
	String[] malCharater = {"학과 선배 A", "학과 동기 B", "동아리 오빠 C"};
	String[] femalCharater = {"학과 선배 A", "학과 동기 B", "동아리 누나 C"};
	int lovePoint = 0;
	int select;
	private Integer integer;
	
	
	void intro(){
		System.out.println("(System)연애 시뮬레이션 게임, 'FIND MY LOVE' 에 오신 것을 환영합니다.>(엔터)");
		next = s.nextLine();
		System.out.println("(System)당신은 이제부터 게임의 주인공이 되어,>(엔터)");
		next = s.nextLine();
		System.out.println("(System)가상의 상대와 연애를 해볼 수 있습니다.>(엔터)");
		next = s.nextLine();
		System.out.println("(System)하지만 연애를 위해서는, >(엔터)");
		next = s.nextLine();
		System.out.println("(System)상대의 호감도를 잘 쌓아야 가능하다는 것을 명심해 주세요!>(엔터)");
		next = s.nextLine();
		System.out.println("(System)이제 시작합니다!>(엔터)");
		next = s.nextLine();
		System.out.println("(System)당신의 이름을 입력해 주세요.>(이름 입력)");
		name = s.nextLine();
		System.out.println();
		System.out.println("(System)당신의 성별은 무엇입니까?");
		System.out.println("1.여성  2.남성 (1 또는 2 입력)");
		userSex = sex[Integer.parseInt(s.nextLine()) - 1];
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
	}
	
	void selectCharater(){
		System.out.println("나의 이름(은)는 " + name + ", 나는 JAVA 대학교의 신입생이다. >(엔터)");
		next = s.nextLine();
		System.out.println("고된 입시 끝에 드디어 대학 생활을 시작하게 되었다. >(엔터)");
		next = s.nextLine();
		System.out.println("새롭게 시작된 봄, 아름다운  계절에 꽃내음이 흩날이는 것 같다.>(엔터)");
		next = s.nextLine();
		System.out.println("왠지 모를 두근거림에 나도 마음이 설렌다. >(엔터)");
		next = s.nextLine();
		System.out.println("혹시... 이제는 나도  >(엔터)");
		next = s.nextLine();
		System.out.println("나의 짝을 만날 수 있지 않을까?  >(엔터)");
		next = s.nextLine();
		System.out.println("(System)앞으로의 대학 생활에서 호감도를 쌓아 올릴 상대를 정하세요. >(엔터)");
		next = s.nextLine();
		if(userSex == sex[0]){
			maleCharater();
		}else if(userSex == sex[1]){
			femaleCharater();
		}
		System.out.println();
		System.out.println("");
	
	
	}
	
	void maleCharater(){
		System.out.println("1.학과 선배 A >(엔터)");
		next = s.nextLine();
		System.out.println("신입생이 된 나를 다정하게 챙겨 주는 학과 선배이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 차*우 씨를 닮은 듯한 부드러운 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("잘 어울리는 베이지색 롱코트와 검은 가죽 장갑을 낀 모습이 인상적이다. >(엔터)");
		next = s.nextLine();
		System.out.println();
		System.out.println("2.학과 동기 B >(엔터)");
		next = s.nextLine();
		System.out.println("같은 신입생이 된 동기이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 김수* 씨를 닮은 듯한 활발해보이는 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("편안한 차림을 하고 과잠을 착용한 모습이 친근감을 불러일으킨다. >(엔터)");
		next = s.nextLine();
		System.out.println();
		System.out.println("3.동아리 오빠 C >(엔터)");
		next = s.nextLine();
		System.out.println("가입한 동아리에 있는 동아리 오빠이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 박*준 씨를 닮은 듯한 시원해보이는 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("깔끔한 차림이 어른스러운 분위기를 준다. >(엔터)");
		next = s.nextLine();
		System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
		selectCharater = Integer.parseInt(s.nextLine());
		
		System.out.println( malCharater[selectCharater - 1]+ "을(를) 선택하셨습니다.");
		System.out.println();
		
	}
	
	void femaleCharater(){
		System.out.println("1.학과 선배 A >(엔터)");
		next = s.nextLine();
		System.out.println("신입생이 된 나를 다정하게 챙겨 주는 학과 선배이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 차*우 씨를 닮은 듯한 부드러운 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("잘 어울리는 베이지색 롱코트와 검은 가죽 장갑을 낀 모습이 인상적이다. >(엔터)");
		next = s.nextLine();
		System.out.println();
		System.out.println("2.학과 동기 B >(엔터)");
		next = s.nextLine();
		System.out.println("같은 신입생이 된 동기이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 김수* 씨를 닮은 듯한 활발해보이는 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("편안한 차림을 하고 과잠을 착용한 모습이 친근감을 불러일으킨다. >(엔터)");
		next = s.nextLine();
		System.out.println();
		System.out.println("3.동아리 오빠 C >(엔터)");
		next = s.nextLine();
		System.out.println("가입한 동아리에 있는 동아리 오빠이다. >(엔터)");
		next = s.nextLine();
		System.out.println("약간 남배우 박*준 씨를 닮은 듯한 시원해보이는 외모에, >(엔터)");
		next = s.nextLine();
		System.out.println("깔끔한 차림이 어른스러운 분위기를 준다. >(엔터)");
		next = s.nextLine();
		System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
		selectCharater = Integer.parseInt(s.nextLine());
		while(true){
			if(selectCharater != 1 || selectCharater != 2 || selectCharater != 3){
				selectCharater = Integer.parseInt(s.nextLine());
			}
			break;
		}
		
		System.out.println( malCharater[selectCharater - 1]+ "을(를) 선택하셨습니다.");
		System.out.println();
	
	}
	
	void Story(){
		System.out.println("이벤트1");
		aEvent1();
		System.out.println("이벤트2");
		aEvent2();
		System.out.println("이벤트3");
		aEvent3();
		System.out.println("이벤트4");
		aEvent4();
		System.out.println("이벤트5");
		aEvent5();
	}
	
	
	void aEvent1(){
		System.out.println("(System)당신은 교양 수업에서 " + malCharater[selectCharater - 1] + "의 옆자리에 앉게 되었습니다. >(엔터)");
		next = s.nextLine();
		System.out.println("교수님 : 오늘 학식 메뉴가 산채비빔밥인가요? 죽은채비빔밥보다는 낫지 않나요? 껄껄껄껄!  >(엔터)" );
		next = s.nextLine();
		System.out.println("(System)교수님이 이상한 아재개그를 던졌습니다. 학생들의 반응은 싸늘합니다.>(엔터)" );
		next = s.nextLine();
		System.out.println("(System)선배의 표정도 별로 좋지 않은 것 같습니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
		next = s.nextLine();
		System.out.println("1.뒤늦게 개그를 이해했다는 듯이 깔깔 웃는다. >(엔터)" );
		next = s.nextLine();
		System.out.println("2.아무 반응도 하지 않는다. >(엔터)" );
		next = s.nextLine();
		System.out.println("3.'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.'라고 말한다. >(엔터)" );
		next = s.nextLine();
		System.out.println("(System)행동을 선택해 주세요. >(입력)" );
		select = integer.parseInt(s.nextLine());
		if(select == 1){
			System.out.println("(System)당신이 깔깔 웃자, 선배도 뒤늦게 따라 웃습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)심지어는, 얼굴이 조금 빨개질 때까지 웃으며 재밌어합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 선배는 아재개그를 좋아하는 것 같습니다. >(엔터)");
			next = s.nextLine();
			lovePoint += 10;
			System.out.println("(System)선배의 호감도가 10 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
			
		}else if(select == 2){
			System.out.println("(System)당신이 아무 반응도 하지 않자, >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배는 머쓱해하며 조용히 웃음을 참습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 선배의 이상한 표정은 웃음을 참는 표정이었던 것 같습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 선배의 이상한 표정은 웃음을 참는 표정이었던 것 같습니다. >(엔터)");
			next = s.nextLine();
			lovePoint -= 10;
			System.out.println("(System)선배의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
			
		}else if(select == 3){
			System.out.println("(System)'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.' >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신의 발언에 강의실 전체가 조용해집니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배는 살짝 짓던 웃음을 거두고 조용한 눈빛으로 나를 쳐다봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 뭔가 잘못 말한 것 같습니다. >(엔터)");
			next = s.nextLine();
			lovePoint -= 30;
			System.out.println("(System)선배의 호감도가 30 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
		}
	}
	void aEvent2(){
		System.out.println("(System)당신은 과 휴게실의 쇼파에서 피곤한듯이 잠시 눈을 붙이고 있는 " + malCharater[selectCharater - 1] + "를 보았습니다. >(엔터)");
		next = s.nextLine();
		System.out.println("(System)인기척에 잠시 눈을 뜬 " + malCharater[selectCharater - 1] +"가 말합니다. >(엔터)" );
		next = s.nextLine();
		System.out.println( malCharater[selectCharater - 1]  + ": " + name + "아, 미안한데.. 30분만 있다 깨워줄 수 있을까? >(엔터)");
		next = s.nextLine();
		System.out.println(malCharater[selectCharater - 1]  + ": 어제 팀플때문에 늦게 자서 너무 피곤하네. >(엔터)");
		next = s.nextLine();
		System.out.println("(System)30분 뒤면 당신의 다음 수업 시작 시간과 아슬아슬하게 겹칠 것 같습니다. 당신은 어떻게 하시겠습니까? >(엔터)");
		next = s.nextLine();
		System.out.println("1.수업에 조금 늦더라도 선배를 깨워 주고 간다. ");
		next = s.nextLine();
		System.out.println("2.학생의 본분은 공부, 선배보다는 내 성적이 더 중요하므로 그냥 수업에 간다. ");
		next = s.nextLine();
		System.out.println("3.'다음 날 졸 것 같으면 밤을 새질 말아야죠. 왜 그러셨어요.' 라고 말한다.");
		next = s.nextLine();
		
		System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
		select = integer.parseInt(s.nextLine());
		if(select == 1){
			System.out.println("(System)당신은 30분 뒤, 선배를 깨워 주었습니다. >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharater - 1]  + ":" + name + "아, 진짜 고마워.  >(엔터) " );
			next = s.nextLine();
			System.out.println(name + ": 아니에요. 그럼 저 금방 수업 들어가야되서 이제 가볼게요! >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharater - 1]  + ": 바로 수업이었구나. 미안. 내가 다음에 밥 사줄게. >(엔터) ");
			next = s.nextLine();
			lovePoint += 10;
			System.out.println("(System)선배의 호감도가 10 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
			
		}else if(select == 2){
			System.out.println("(System)당신은 선배를 두고 수업을 들으러 갔습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)조금 신경쓰이기는 했지만, 그게 뭐 대순가요? >(엔터)");
			next = s.nextLine();
			System.out.println("(System)이후에 들은 이야기로는 선배는 팀플 발표에 늦어서 큰 곤경에 빠졌다고 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 당분간 선배를 만나지 않는 것이 좋겠습니다. >(엔터)");
			next = s.nextLine();
			lovePoint -= 30;
			System.out.println("(System)선배의 호감도가 30 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
			
		}else if(select == 3){
			System.out.println(name + ": '다음 날 졸 것 같으면 밤을 새질 말아야죠. 왜 그러셨어요.' >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배는 어처구니 없어하는 표정으로 당신을 쳐다봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)뭔가 더 말을 하려고 하는 듯 하지만 당신은 수업에 가야 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)아무래도 뭔가 말을 잘못 한 것 같습니다. >(엔터)");
			next = s.nextLine();
			lovePoint -= 20;
			System.out.println("(System)선배의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			
		}
		
		
		
	}
	void aEvent3(){
		System.out.println("(System)당신은 학내 공원을 걷던 도중, 길고양이에게 밥을 주고 있는  " + malCharater[selectCharater - 1] + "와 마주쳤습니다. >(엔터)");
		next = s.nextLine();
		System.out.println("(System)당신을 발견한 고양이는 당신에게도 애교를 부립니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
		next = s.nextLine();
		System.out.println("1. 선배와 같이 고양이를 귀여워해준다.  >(엔터)" );
		next = s.nextLine();
		System.out.println("2. 저 고양이 알레르기 있어요.(정색) >(엔터)" );
		next = s.nextLine();
		System.out.println("3.  >(엔터)" );
		next = s.nextLine();
		System.out.println("(System)행동을 선택해 주세요. >(입력)" );
		select = integer.parseInt(s.nextLine());
		
	}
	void aEvent4(){}
	void aEvent5(){}

	void bEvent1(){}
	void bEvent2(){}
	void bEvent3(){}
	void bEvent4(){}
	void bEvent5(){}
	
	void cEvent1(){}
	void cEvent2(){}
	void cEvent3(){}
	void cEvent4(){}
	void cEvent5(){}
	
	
}
