package game;
import java.util.Scanner;
public class Game_Method {
		Scanner s = new Scanner(System.in);
		String next; //엔터
		String name = "기본사용자이름"; //사용자 이름
		String[] sex = {"여성" , "남성"}; //선택 성별
		String userSex; //사용자 성별
		String selectCharater;
		int selectCharaterNum; //선택한 캐릭터 번호
		String[] malCharater = {"학과 선배 A", "학과 동기 B", "동아리 오빠 C"}; //남자 캐릭터
		String[] femalCharater = {"학과 선배 A", "학과 동기 B", "동아리 누나 C"};//여자 캐릭터
		int start = 0; //시작
		int lovePoint = 0; //호감도
		int secreatPoint = 0;//비밀 이벤트 홤도
		String select; //선택
		int selectNum; //선택 번호
		
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
			while(name.equals("")){
				System.out.println("(System)당신의 이름을 입력해 주세요.>(이름 입력)");
				name = s.nextLine();
				}
			
			
			System.out.println("(System)당신의 성별은 무엇입니까?");
			System.out.println("1.여성  2.남성 (1 또는 2 입력)");
			userSex = s.nextLine();
			
			while(true){
				while(userSex.equals("") == true){
					System.out.println("(System)1또는 2를 입력해주세요.");
					userSex = s.nextLine();
				}
				while(Integer.parseInt(userSex) != 1 && Integer.parseInt(userSex) != 2){
					System.out.println("(System)1또는 2를 입력해주세요.");
					userSex = s.nextLine();
			}
				if(Integer.parseInt(userSex) == 1 || Integer.parseInt(userSex) == 2){
					break;
				}
			}
			userSex = sex[Integer.parseInt(userSex) - 1];
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
		}
		void selectCharater(){
			System.out.println("나의 이름(은)는 " + name + ", 나는 JAVA 대학교의 신입생이다. >(엔터)");
			next = s.nextLine();
			System.out.println("고된 입시 끝에 드디어 대학 생활을 시작하게 되었다. >(엔터)");
			next = s.nextLine();
			System.out.println("새롭게 시작된 봄, 아름다운 계절에 꽃내음이 흩날리는 것 같다.>(엔터)");
			next = s.nextLine();
			System.out.println("왠지 모를 두근거림에 나도 마음이 설렌다. >(엔터)");
			next = s.nextLine();
			System.out.println("혹시... 이제는 나도  >(엔터)");
			next = s.nextLine();
			System.out.println("나의 짝을 만날 수 있지 않을까?  >(엔터)");
			next = s.nextLine();
			System.out.println("(System)앞으로의 대학 생활에서 호감도를 쌓아 올릴 상대를 정하세요. >(엔터)");
			next = s.nextLine();
			if(userSex == sex[0]){
				maleCharater();
			}else if(userSex == sex[1]){
				femaleCharater();
			}
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
			selectCharater = s.nextLine();
			while(true){
				while(selectCharater.equals("")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					selectCharater = s.nextLine();
					}
				while(selectCharater.equals("1") && selectCharater.equals("2") && selectCharater.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					selectCharater = s.nextLine();
					}
				if(selectCharater.equals("1") || selectCharater.equals("2") || selectCharater.equals("3")){
					break;
					}
				}
			selectCharaterNum = integer.parseInt(selectCharater);
			System.out.println( malCharater[selectCharaterNum - 1]+ "을(를) 선택하셨습니다. > (엔터)");
			System.out.println();
		}
		void femaleCharater(){
			System.out.println("1.학과 선배 A >(엔터)");
			next = s.nextLine();
			System.out.println("신입생이 된 나를 다정하게 챙겨 주는 학과 선배이다. >(엔터)");
			next = s.nextLine();
			System.out.println("약간 가수 아*유 씨를 닮은 듯한 부드러운 외모에, >(엔터)");
			next = s.nextLine();
			System.out.println("잘 어울리는 베이지색 롱코트에 꽃무늬 패턴 원피스, 갈색 가죽 장갑을 낀 모습이 인상적이다. >(엔터)");
			next = s.nextLine();
			System.out.println();
			System.out.println("2.학과 동기 B >(엔터)");
			next = s.nextLine();
			System.out.println("같은 신입생이 된 동기이다. >(엔터)");
			next = s.nextLine();
			System.out.println("약간 트*와이* 지* 씨를 닮은 듯한 활발해보이는 외모에, >(엔터)");
			next = s.nextLine();
			System.out.println("편안한 차림을 하고 과잠을 착용한 모습이 친근감을 불러일으킨다. >(엔터)");
			next = s.nextLine();
			System.out.println();
			System.out.println("3.동아리 누나 C >(엔터)");
			next = s.nextLine();
			System.out.println("가입한 동아리에 있는 동아리 누나이다. >(엔터)");
			next = s.nextLine();
			System.out.println("약간 레*밸뱃 아*린 씨를 닮은 듯한 쿨해보이는 외모에, >(엔터)");
			next = s.nextLine();
			System.out.println("깔끔한 정장 원피스 차림이 어른스러운 분위기를 준다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
			selectCharater = s.nextLine();
			while(true){
				while(selectCharater.equals("")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					selectCharater = s.nextLine();
					}
				while(selectCharater.equals("1") && selectCharater.equals("2") && selectCharater.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					selectCharater = s.nextLine();
					}
				if(selectCharater.equals("1") || selectCharater.equals("2") || selectCharater.equals("3")){
					break;
					}
				}
			selectCharaterNum = integer.parseInt(selectCharater);
			System.out.println( femalCharater[selectCharaterNum - 1]+ "을(를) 선택하셨습니다.");
		}
		void Story(){
			if(userSex == sex[0]){ //선택 성별이 여성이라면
				if(selectCharaterNum == 1){
					aStory();
				}else if(selectCharaterNum == 2){
					bStory();
				}else{
					cStory();
				}
			}else if (userSex == sex[1]){
				if(selectCharaterNum == 1){
					aStory();
				}else if(selectCharaterNum == 2){
					bStory();
				}else{
					cStory();
				}
			}
		}
		void aStory(){
			switch (start = 1) {	// 조건
			case 1:	
				System.out.println("(System)---------------EVENT1--------------->(엔터)");
				aEvent1();
			case 2:	
				System.out.println("(System)---------------EVENT2--------------->(엔터)");
				aEvent2();
			case 3:		
				System.out.println("(System)---------------EVENT3--------------->(엔터)");
				aEvent3();
			case 4:	
				System.out.println("(System)---------------EVENT4--------------->(엔터)");
				aEvent4();
				if(lovePoint <= -60){
					bedEnding();
					break;
				}
			case 5:	
				System.out.println("(System)---------------EVENT5--------------->(엔터)");
				aEvent5();
				if(lovePoint <= -60){
					bedEnding();
					break;
				}
			case 6:		
				if(lovePoint <= -60){
					bedEnding();
					break;
				}else if(lovePoint < 60){
					normalEnding();
					break;
				}
				System.out.println("(System)---------------ENDING--------------->(엔터)");
				aEnding();
				}

		}
		void aEvent1(){
			System.out.println("(System)당신은 교양 수업에서 " + malCharater[selectCharaterNum - 1] + "의 옆자리에 앉게 되었습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("교수님 : 오늘 학식 메뉴가 산채비빔밥인가요? 죽은채비빔밥보다는 낫지 않나요? 껄껄껄껄!  >(엔터)" );
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
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신이 크게 웃자, 선배도 뒤늦게 따라 웃습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)심지어는, 얼굴이 조금 빨개질 때까지 웃으며 재밌어합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 선배의 개그 취향은 조금 이상한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 20;
				System.out.println("(System)선배의 호감도가 20 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신이 아무 반응도 하지 않자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 머쓱해하며 조용히 웃음을 참습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 선배의 이상한 표정은 웃음을 참는 표정이었던 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 선배의 이상한 표정은 웃음을 참는 표정이었던 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 발언에 강의실 전체가 조용해집니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 살짝 짓던 웃음을 거두고 조용한 눈빛으로 나를 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 잘못 말한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 20;
				System.out.println("(System)선배의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void aEvent2(){
			System.out.println("(System)당신은 과 휴게실의 쇼파에서 피곤한듯이 잠시 눈을 붙이고 있는 " + malCharater[selectCharaterNum - 1] + "를 보았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)인기척에 잠시 눈을 뜬 " + malCharater[selectCharaterNum - 1] +"가 말합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println( malCharater[selectCharaterNum - 1] + ": " + name + "아, 미안한데.. 30분만 있다 깨워줄 수 있을까? >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ": 어제 팀플때문에 늦게 자서 너무 피곤하네. >(엔터)");
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
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 30분 뒤, 선배를 깨워 주었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아, 진짜 고마워.  >(엔터) " );
				next = s.nextLine();
				System.out.println(name + ": 아니에요. 그럼 저 금방 수업 들어가야되서 이제 가볼게요! >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 바로 수업이었구나. 미안. 내가 다음에 밥 사줄게. >(엔터) ");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)선배의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
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
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println(name + ": '다음 날 졸 것 같으면 밤을 새질 말아야죠. 왜 그러셨어요.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 어처구니 없어하는 표정으로 당신을 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)뭔가 더 말을 하려고 하는 듯 하지만 당신은 수업에 가야 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 말을 잘못 한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 10;
				System.out.println("(System)선배의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void aEvent3(){
			System.out.println("(System)당신은 학내 공원을 걷던 도중, 길고양이에게 밥을 주고 있는 " + malCharater[selectCharaterNum - 1]+ "와 마주쳤습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신을 발견한 고양이는 당신에게도 애교를 부립니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)그러나 사실 당신에게는 고양이 털 알레르기가 있습니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)고양이와 접촉한 지 1분만 지나도 온몸에 알레르기가 올라올 것입니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)선배는 당신에게도 사료를 주며 동동이(고양이 이름)에게 밥을 줘보라고 이야기합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1. 사료를 받고 선배와 같이 고양이를 귀여워해준다.  >(엔터)" );
			next = s.nextLine();
			System.out.println("2. 사실 저 심한 알레르기가 있어서... 그냥 바라만 볼게요. >(엔터)" );
			next = s.nextLine();
			System.out.println("3. 고양이와는 접촉도 위험합니다. 선배의 말을 무시하고 지나칩니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 알레르기를 무시하고 고양이를 만졌습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 고양이를 만지자, 심각한 알레르기가 바로 온몸에 올라옵니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)눈과 코도 빨개져서 당신은 눈을 뜨는 것 조차도 힘들어합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 크게 당황하며 당신에게 고양이 알레르기가 있었냐고 물어봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 원래 이정도까진 아닌데... 오늘 좀 심하네요. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아(야), 정말 미안해.. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 알레르기가 있을 수도 있다는 걸 생각했어야 했는데. 다 내 잘못이야.>(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 앞은 보이니? 내가 병원에 데려다 줄게. 같이 가자.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 당신을 자신의 차에 태워 병원에 데려가 주었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)병원에 가는 동안 대화를 나누며, 당신은 선배와 조금 더 친해진 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 20;
				System.out.println("(System)선배의 호감도가 20 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + ": 사실 저 심한 알레르기가 있어서... 그냥 바라만 볼게요. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 거절하자, 선배의 내밀어진 손이 머쓱하게 제 자리로 돌아갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 동동이(고양이 이름)를 화제로 대화를 이어 나가려고 하지만, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 당신이 알레르기 때문에 고양이를 불편해 할 것이라고 생각하는지 대화의 주제를 바꿉니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배와 일상적인 학과 이야리를 나눈 당신은 왠지 모르게 어떤 기회를 놓친 듯한 아쉬운 감정이 듭니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신이 선배의 말을 무시하고 옆으로 지나가자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)웃으며 사료를 내밀었던 선배의 손이 머쓱하게 제 자리로 돌아갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 지나쳐가는 당신의 뒷모습을 보며 어떤 생각을 하는 듯 해 보입니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 잘못 행동을 한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 20;
				System.out.println("(System)선배의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void aEvent4(){
			System.out.println("(System)당신은 학과 축제 기획의 대표를 맡은 A선배를 보고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)원래대로라면 작년에 해왔던 것과 똑같은 기획을 해야 하지만, >(엔터)");
			next = s.nextLine();
			System.out.println("(System)올해 대표를 맡은 선배는 조금 색다른 기획을 하고 싶어하는 듯 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)그러나 문제는,기한과 인력이 빠듯하기 때문에 자칫 잘못하면 작년보다도 못한 >(엔터)");
			next = s.nextLine();
			System.out.println("(System)결과가 나올 수 있다는 것입니다. 학생들의 반응은 미적지근합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)이제 선배는 동의를 구하는 듯이 당신을 바라봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.현실적으로 보았을 때, 이 기획은 불가능한 것 같다고 이야기한다. >(엔터)");
			next = s.nextLine();
			System.out.println("2.다른 학생들과 똑같이, 미적지근한 반응을 보인다. >(엔터)");
			next = s.nextLine();
			System.out.println("3.A선배의 기획에 의욕적으로 찬성한다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)당신의 행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + " : '현실적으로 보았을 때, 이 기획은 불가능하다고 생각합니다.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 A선배의 주장을 정면으로 반대하자, 다른 학생들도 수근거리며 찬성합니다. >(엔터)" );
				next = s.nextLine();
				System.out.println("(System)선배는 당신의 말에 동의하면서도 뭔가 아쉬워하는 것 같아 보입니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 네 말이 맞아. 현실적으로 보면 그냥 똑같이 진행하는 게 좋겠지...>(엔터)");
				next = s.nextLine();
				System.out.println("(System)결국 학과 행사는 작년과 똑같은 평범한 기획으로 결정되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)모두를 위해 좋은 결정을 내린 것 같은데, 뭔가 잊은 것 같은 아쉬움이 드는 것은 왜일까요?");
				next = s.nextLine();
				System.out.println("(System)선배의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("System)당신은 선배의 말에 다른 학생들과 똑같이 미적지근한 반응을 보였습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 다른 사람의 어떤 반응보다도, 당신의 미적지근한 반응에 상처를 받은 듯 해 보입니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)학과 축제는 결국 작년과 똑같은 기획으로 결정되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)제안이 거부된 선배는 조용히 강의실을 빠져나갔습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)차라리 반대를 하는 것이 더 나았던 것일까요? 뒤늦은 후회가 살짝 듭니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 20;
				System.out.println("(System)선배의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 A선배의 기획에 적극적으로 찬성함을 어필했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 열정을 보이자, 다른 학생들도 조금 솔깃한 듯이 보입니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결과적으로 A선배의 기획이 받아들여지게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)축제 기획을 준비하는 것은 역시나 작년보다는 힘들었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나, 당신은 A선배와 밤늦게까지 단둘이 남아 함께 준비를 하며 >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이전보다 훨씬 더 가까워졌음을 느낄 수 있었습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)선배의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void aEvent5(){
			System.out.println("(System)---------------FINAL EVENT--------------- >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 과 휴게실에 혼자 남아 교재를 정리하고 있는 선배를 보았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)오늘은 왠일인지 선배가 장갑을 벗고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)날씨가 더워도, 추워도, 실내여도, 실외여도 항상 끼고 있던 장갑이었는데 말이죠. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배의 손은 다른 사람들과 다른 것 하나 없어 보이는 그냥 맨손이였습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신이 선배를 바라보고 있는 동안,선배는 교재를 가방에 넣다 장갑을 바닥에 떨어뜨렸습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배는 아직 장갑이 바닥에 떨어진 줄 모르고 있는 것 같습니다. 이대로라면 >(엔터)");
			next = s.nextLine();
			System.out.println("(System)선배는 장갑을 바닥에 둔 채로 집에 가버릴 것 같습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.장갑을 주워 선배에게 건네준다. >(엔터)");
			next = s.nextLine();
			System.out.println("2.장갑의 존재에 대해 말하고 싶지 않을 수도 있다. 모르는 척 한다. >(엔터)");
			next = s.nextLine();
			System.out.println("3.'선배, 장갑 떨어졌어요.' 하고 말한다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			
			if(selectNum == 1){
				System.out.println("(System)당신은 장갑을 주워 선배에게 건네주었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 당신이 건네는 것을 보고 놀랍니다.>(엔터)" );
				next = s.nextLine();
				System.out.println("(System)장갑을 건네받던 도중, 당신과 선배의 손이 스치자 그(그녀)가 소스라치게 놀라며 장갑을 떨어뜨립니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 앗..! 미안해...>(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":....>(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 사실 내가 다른 사람 맨손을 만지는 걸 별로 좋아하지 않아. 왜냐면...>(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": ...사실 이런 얘기는 별로 하지 않는데, 왠지 너는 괜찮을 것 같아. ");
				next = s.nextLine();
				System.out.println("(System)선배는 조용히 자신의 비밀에 대해 털어놓았습니다.");
				next = s.nextLine();
				System.out.println("(System)선배의 어머니께서 선배가 어렸을 때 돌아가셨다고 합니다. ");
				next = s.nextLine();
				System.out.println("(System)오랜 투병 끝에 돌아가신 어머니께서 마지막으로 잡아주셨던 차가운 손이 ");
				next = s.nextLine();
				System.out.println("(System)선배에게 트라우마가 되어 타인의 손을 잡지 못하게 되었다는 것이었습니다.");
				next = s.nextLine();
				System.out.println(name + ":남에게 하기 쉽지 않은 이야기였을 텐데.. 이런 이야기를 하게 해서 죄송해요.");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":아니야. 애초에 내가 장갑을 떨어뜨려서 그런 거기도 했고. ");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":왠지 너에게는 해도 괜찮을 것 같았어. ");
				next = s.nextLine();
				lovePoint += 100;
				secreatPoint += 100;
				System.out.println("(System)선배의 호감도가 100 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("System)당신은 장갑이 떨어진 것을 아예 모른 척 했습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 장갑이 떨어진 것을 모른 채, 가방을 챙겨 휴게실을 나가버렸습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그 후, 아무 일도 일어나지 않았습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 선배에게 '선배, 장갑 떨어졌어요.' 하고 말했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":앗, 정말이네. 말해줘서 고마워. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 가방을 챙겨 휴게실을 나가버렸습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그 후, 아무 일도 일어나지 않았습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}

			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
			System.out.println("(System)---------------FINAL EVENT END--------------- >(엔터)");
		}
		void aEnding(){

			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아(야), 좋아해. ");
			next = s.nextLine();
			System.out.println("(System) 당신은 충분히 A선배의 호감도를 얻어, 선배와 연인이 되었습니다. >(엔터)");
			next = s.nextLine();
			if(secreatPoint != 0){
				System.out.println("(System)당신은 선배의 작은 비밀을 알게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)타인에게는 별 것 아닐 수도 있는 것이지만,>(엔터)");
				next = s.nextLine();
				System.out.println("(System)당사자에게는 고백하기 아주 어려울 수 있는 것 말입니다. (엔터)");
				next = s.nextLine();
				System.out.println("(System)트라우마라는 것은 그런 것이니까요. (엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 당신과 함께하며 트라우마를 극복해. (엔터)");
				next = s.nextLine();
				System.out.println("(System)결국에는 맨 손을 잡는 것도 가능하게 되었습니다. (엔터)");
				next = s.nextLine();
				System.out.println("(System)물론 아직까지는 당신의 손만이지만요. (엔터)");
				next = s.nextLine();
			}else{
				System.out.println("(System)당신은 선배와 연인이 되었지만, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배가 왜 장갑을 끼고 다니는지, 맨손으로 당신의 손을 잡지 않는지는 알 수 없었습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 둘의 관계는 이제 시작이기에,(엔터)");
				next = s.nextLine();
				System.out.println("(System)언젠가는 당신도 그 이유를 알 수 있게 될지도 모릅니다.(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System) 당신은 FIND MY LOVE 에서 당신의 짝을 찾았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 축하드립니다!! >(엔터)");
			next = s.nextLine();
			System.out.println("System)---------------HAPPY ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
		}
		void bStory(){
			switch (start = 1) {	// 조건
			case 1:	
				System.out.println("(System)---------------EVENT1--------------->(엔터)");
				bEvent1();
			case 2:	
				System.out.println("(System)---------------EVENT2--------------->(엔터)");
				bEvent2();
			case 3:		
				System.out.println("(System)---------------EVENT3--------------->(엔터)");
				bEvent3();
			case 4:	
				System.out.println("(System)---------------EVENT4--------------->(엔터)");
				bEvent4();
				if(lovePoint <= -60){
					bedEnding();
					break;
				}
			case 5:	
				System.out.println("(System)---------------EVENT5--------------->(엔터)");
				bEvent5();
				if(lovePoint <= -60){
					bedEnding();
					break;
				}
			case 6:		
				if(lovePoint <= -60){
					bedEnding();
					break;
				}else if(lovePoint < 59){
					normalEnding();
					break;
				}
				System.out.println("(System)---------------ENDING--------------->(엔터)");
				bEnding();
				}
		}
		void bEvent1(){
			System.out.println("(System)당신은 교양 수업에서 " + malCharater[selectCharaterNum - 1] + "의 옆자리에 앉게 되었습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("교수님 : 오늘 학식 메뉴가 산채비빔밥인가요? 죽은채비빔밥보다는 낫지 않나요? 껄껄껄껄!  >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)교수님이 이상한 아재개그를 던졌습니다. 학생들의 반응은 싸늘합니다.>(엔터)" );
			next = s.nextLine();
			System.out.println("(System)B의 표정도 별로 좋지 않은 것 같습니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.뒤늦게 개그를 이해했다는 듯이 깔깔 웃는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("2.아무 반응도 하지 않는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("3.'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.'라고 말한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신이 깔깔 웃자, B는 이상한 표정으로 당신을 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 와 너 웃음코드 진짜 특이하다... >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 교수님께 잘 보이려고 억지로 웃는 거 아니지? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 당신을 의심스러운 표정으로 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신과 B는 개그코드가 잘 맞지 않는 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 10;
				System.out.println("(System)B의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 2){
				System.out.println("(System)당신이 아무 반응도 하지 않자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 조용히 당신에게 귓속말을 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":아무도 안 웃는 거 좀 안타까운데 우리라도 웃어줄까? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 B가 한 말에 뒤늦게 터져나오는 웃음을 참습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":교수님이 너 보고 자기 한 얘기에 웃는다고 좋아하시는 것 같아 ㅋㅋㅋ  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B와 당신은 재미있게 대화를 나누며 조금 더 친해졌습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)B의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 발언에 강의실 전체가 조용해집니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 또라이를 보는 듯한 눈빛으로 나를 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 잘못 말한 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
		}
		void bEvent2(){
			System.out.println("(System)수업이 끝나고 돌아온 당신은 과 휴게실의 쇼파에서 핸드폰을 하고 있는 " + malCharater[selectCharaterNum - 1] + "를 보았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)인기척에 당신을 발견한 " + malCharater[selectCharaterNum - 1] +"가 핸드폰에서 눈을 떼고 말합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println( malCharater[selectCharaterNum - 1] + ": " + name + "아, 우리 오늘 XX치킨집에 애들이랑 술 마시러 갈래? >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ": 거기 요즘 엄청 줄 서서 기다려야 한다는데,☆☆이가 알바하는 곳이라고 바로 자리 착석시켜준대. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)원래 당신은 도서관에서 모레까지가 마감인 과제를 하려고 했습니다. 술을 마시게 되면 과제를 하기는 힘들겠죠? >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.이때가 아니면 언제 놀까, 치킨집에 간다. ");
			next = s.nextLine();
			System.out.println("2.학생의 본분은 공부, 치킨보다는 내 성적이 더 중요하므로 거절한다. ");
			next = s.nextLine();
			System.out.println("3.'야 너는 과제 안해? 우리 제출일이 코앞이야.' 라고 말한다.");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 고민하지 않고 치킨집에 가겠다고 말했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이럴 때가 아니면 또 언제 놀 수 있겠습니까? >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":아싸! 야, " +name+"(이)도 오늘 간대!!  >(엔터) " );
				next = s.nextLine();
				System.out.println("(System)당신은 B와 함께 치킨집으로 향했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B가 함께한 술자리는 술이 별로 세지 않은 사람들도 모두 즐겁게 즐길 수 있었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 B와 학과의 동기들과 조금 더 친해졌습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)B의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신은 과제가 생각나 B의 제안을 거절했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)뒤늦게 술자리에 참여할껄 그랬나 조금 신경쓰이기는 했지만 어쩔 수 없었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)소모적인 술자리보다는, 학점에 신경쓰는 것이 더 인생에 도움이 되지 않을까요? >(엔터)");
				next = s.nextLine();
				lovePoint -= 10;
				System.out.println("(System)B의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 3){
				System.out.println(name + ": '야 너는 과제 안해? 우리 제출일이 코앞이야.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 말문이 막힌 표정으로 당신을 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)뭔가 더 말을 하려고 하는 듯 하지만 당신은 도서관에 가야 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 말을 잘못 한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 30;
				System.out.println("(System)B의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
		}
		}
		void bEvent3(){
			System.out.println("(System)당신은 자취방 주변 공원을 산책하던 도중, 강아지와 산책을 하고 있는  " + malCharater[selectCharaterNum - 1] + "와 마주쳤습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신을 발견한 B의 강아지는 당신에게도 반갑게 애교를 부립니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)그러나 사실 당신은 개를 무서워합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)어렸을 적 커다란 개에게 물렸던 기억이 떠올라, 당신은 B에게 가까이 가지 못합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)이 사실을 모르는 B는 철수(강아지 이름)에게 간식을 줘보라고 이야기합니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.무서워도 참고 강아지에게 간식을 준다.  >(엔터)" );
			next = s.nextLine();
			System.out.println("2.'제안은 고마운데 내가 개를 무서워해서 못 다가가겠어..'라고 말한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("3.강아지는 너무 무섭습니다. B의 말을 무시하고 지나칩니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 무서움을 꾹 참고 철수에게 간식을 주었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)철수가 신이 나서 당신의 손바닥을 핥자, 당신은 소리를 지르며 뒤로 물러납니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":야, 철수한테 갑자기 왜 그래!>(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 미안... 내가 원래 개를 좀 무서워해서. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":그럼 미리 얘기를 하지. 철수 놀랐잖아. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 조금 기분이 상한 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B의 호감도에는 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + ": 사실 내가 개를 좀 무서워해서... 그냥 여기서 바라만 볼게. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":아 그렇구나. 미안. 그럼 여기서 내가 주는 거 볼래? >(엔터)");
				next = s.nextLine();
				System.out.println("System)철수는 정말 귀엽고 착한 강아지였습니다. 당신은 철수라면 괜찮을지도 모르겠다고 생각하며 >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B와 철수에 대한 이야기를 즐겁게 나누었습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)B의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신이 B의 말을 무시하고 옆으로 지나가자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)웃으며 간식을 내밀었던 B의 손이 머쓱하게 제 자리로 돌아갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 지나쳐가는 당신의 뒷모습을 보며 어떤 생각을 하는 듯 해 보입니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 뭔가 잘못 행동을 한 것 같습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 20;
				System.out.println("(System)B의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
		}
		void bEvent4(){
			System.out.println("(System)당신은 학생회비 사용내역을 진지한 표정으로 살펴보는 중인 B를 보고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":뭔가 이상해. 작년이랑 비교하면 XX만원이 비는데, >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":자칫 넘어가면 발견하지 못하게 처리되어 있어. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)B는 학생회비 사용내역에서 부당한 흔적을 발견하였습니다.");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":이건 공론화가 필요한 일인 것 같아." + name + "아(야), 너도 도와줄거지? >(엔터)");
			next = s.nextLine();
			System.out.println("(System)이제 B는 동의를 구하는 듯이 당신을 바라봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.괜히 들쑤시지 말고 조용히 넘어가자고 말한다.>(엔터)");
			next = s.nextLine();
			System.out.println("2.난 이런 건 잘 모르겠어...혹시 네가 잘못 본 거면 어떡해?  >(엔터)");
			next = s.nextLine();
			System.out.println("3.B와 함께 학생회비 사용 내역에 대한 공론화를 진행한다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + " : 괜히 들쑤시지 말고 조용히 넘어가자. 이정도는 누구나 다 하는 거야. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 B의 제안을 정면으로 거절하자, B는 매우 실망스러운 표정으로 당신을 바라봅니다. >(엔터)" );
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":누구나 다 하는 거라니. 어떻게 그렇게 말할 수 있어? >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":너는 좀 다른 줄 알았는데... >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결국 공론화는 B혼자 총대를 맡게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 다른 학생들도 학생회비 부당 사용에 함께 분노하였기에,");
				next = s.nextLine();
				System.out.println("(System)학생회는 사죄와 함께 사용 내역을 이전보다 더욱 투명하게 관리할 것을 약속하였습니다.");
				next = s.nextLine();
				lovePoint -= 30;
				System.out.println("(System)B의 호감도가 30 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + " : 난 이런 건 잘 모르겠어...혹시 네가 잘못 본 거면 어떡해?  >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":날 못 믿겠다면 어쩔 수 없지. 그냥 내가 혼자 진행할게. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결국 공론화는 B혼자 총대를 맡게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 다른 학생들도 학생회비 부당 사용에 함께 분노하였기에,");
				next = s.nextLine();
				System.out.println("(System)학생회는 사죄와 함께 사용 내역을 이전보다 더욱 투명하게 관리할 것을 약속하였습니다.");
				next = s.nextLine();
				lovePoint -= 20;
				System.out.println("(System)B의 호감도가 20 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 B와 함께 학생회비 횡령을 밝혀내기로 결정했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신과 B가 다른 학생들에게 열심히 사건을 알리고 공론화를 하자 >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결과적으로 학생 전체가 이 사건의 심각성을 알게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)사건을 밝혀내는 것은 역시나 힘들었습니다. 그러나, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 B와 밤늦게까지 단둘이 남아 일을 진행하며>(엔터)");
				next = s.nextLine();
				System.out.println("(System)이전보다 훨씬 더 가까워졌음을 느낄 수 있었습니다. >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)B의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
		}
		void bEvent5(){
			System.out.println("(System)---------------FINAL EVENT--------------- >(엔터)");
			next = s.nextLine();
			System.out.println("(System)도서관에서 밤 늦게까지 공부를 마친 당신은 학내 벤치에 앉아있는 B를 보았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)오늘은 왠일인지 B가 밤 늦게까지 학교에 남아 있는 듯 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)B는 뭔가 깊은 고민을 하고 있는 듯 해 보입니다.   >(엔터)");
			next = s.nextLine();
			System.out.println("(System)B에게 무슨 고민이 있는 것인지 물어봐야 할까요?  >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.무슨 고민이라도 있어? >(엔터)");
			next = s.nextLine();
			System.out.println("2.네가 왠일로 학교에 남아 있냐? ㅋㅋ (놀린다) >(엔터)");
			next = s.nextLine();
			System.out.println("3.고민하는 것을 들키고 싶지 않을 수도 있다. 그냥 지나친다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)당신의 행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 자판기에서 음료수를 뽑아 B에게 다가갔습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 무슨 고민이라도 있어? 이거 마셔. " );
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 앗, 고마워. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":.... >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 내가 들어줄 수 있는 고민이야? 괜찮으면 말해봐." );
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": ...사실 이런 얘기는 별로 하지 않는데, 왠지 너는 괜찮을 것 같아. ");
				next = s.nextLine();
				System.out.println("(System)B는 조용히 자신의 비밀에 대해 털어놓았습니다.");
				next = s.nextLine();
				System.out.println("(System)B는 학과가 자신에게 맞지 않는 것 같아서 고민스럽다고 말했습니다.");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":나는 이 과가 아닌걸까? 계속 있으면 있을수록 이질감이 들어. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":다른 사람들은 수업도 재미있게 듣고 열정도 있는 것 같은데... >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 그랬구나.. 정말 고민이 많았겠다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":고마워. 조금 후련해진 것 같아. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":너에게는 이야기해도 괜찮을 것 같았어. >(엔터)");
				next = s.nextLine();
				lovePoint += 100;
				secreatPoint += 100;
				System.out.println("(System)B의 호감도가 100 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + ": 네가 왠일로 학교에 남아 있냐? ㅋㅋ (놀린다) >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 야, 나도 가끔은 고민이라는 걸 하거든? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 머쓱하게 웃더니 자리를 털고 일어납니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 나 이제 가야겠다. 너도 너무 늦기 전에 집에 가. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그 후, 아무 일도 일어나지 않았습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)고민하는 것을 들키고 싶지 않을 수도 있습니다. 당신은 조용히 B를 지나쳐 갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그 후, 아무 일도 일어나지 않았습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
				System.out.println("(System)---------------FINAL EVENT END--------------->(엔터)");
				next = s.nextLine();
			}
		}
		void bEnding(){
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아(야), 좋아해. ");
			next = s.nextLine();
			System.out.println("(System)당신은 충분히 B의 호감도를 얻어, B와 연인이 되었습니다. >(엔터)");
			next = s.nextLine();
			if(secreatPoint != 0){
				System.out.println("(System)당신은 B의 작은 비밀을 알게 되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)타인에게는 별 것 아닐 수도 있는 것이지만,>(엔터)");
				next = s.nextLine();
				System.out.println("(System)당사자에게는 말하기 아주 어려울 수 있는 것 말입니다. (엔터)");
				next = s.nextLine();
				System.out.println("(System)걱정이라는 것은 그런 것이니까요. (엔터)");
				next = s.nextLine();
				System.out.println("(System)B는 당신과 함께하며 진로 고민을 계속해, (엔터)");
				next = s.nextLine();
				System.out.println("(System)결국에는 전과를 하고 자신의 흥미가 있는 학과를 찾아냈습니다. (엔터)");
				next = s.nextLine();
				System.out.println("(System)전과 이전보다 더욱 바빠졌지만, B와 당신의 사이는 더 끈끈해졌습니다. (엔터)");
				next = s.nextLine();
			}else{
				System.out.println("(System)당신은 B와 연인이 되었지만, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)B가 어떤 고민을 하는지, 왜 갑자기 학과 생활에 불성실해졌는지 알 수 없었습니다.>(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 둘의 관계는 이제 시작이기에,(엔터)");
				next = s.nextLine();
				System.out.println("(System)언젠가는 당신도 그 이유를 알 수 있게 될지도 모릅니다.(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System) 당신은 FIND MY LOVE 에서 당신의 짝을 찾았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 축하드립니다!! >(엔터)");
			next = s.nextLine();
			System.out.println("System)---------------HAPPY ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
		}
		void cStory(){
			if(userSex == "여성" ){
				switch (start = 1) {	// 조건
				case 1:	
					System.out.println("(System)---------------EVENT1--------------->(엔터)");
					malCEvent1();
				case 2:	
					System.out.println("(System)---------------EVENT2--------------->(엔터)");
					malCEvent2();
				case 3:		
					System.out.println("(System)---------------EVENT3--------------->(엔터)");
					malCEvent3();
				case 4:	
					System.out.println("(System)---------------EVENT4--------------->(엔터)");
					malCEvent4();
					if(lovePoint <= -60){
						bedEnding();
						break;
					}
				case 5:	
					System.out.println("(System)---------------EVENT5--------------->(엔터)");
					malCEvent5();
					if(lovePoint <= -60){
						bedEnding();
						break;
					}
				case 6:		
					if(lovePoint <= -60){
						bedEnding();
						break;
					}else if(lovePoint < 59){
						normalEnding();
						break;
					}
					System.out.println("(System)---------------ENDING--------------->(엔터)");
					malCEnding();
					}
			}else{
				switch (start = 1) {	// 조건
				case 1:	
					System.out.println("(System)---------------EVENT1--------------->(엔터)");
					femCEvent1();
				case 2:	
					System.out.println("(System)---------------EVENT2--------------->(엔터)");
					femCEvent2();
				case 3:		
					System.out.println("(System)---------------EVENT3--------------->(엔터)");
					femCEvent3();
				case 4:	
					System.out.println("(System)---------------EVENT4--------------->(엔터)");
					femCEvent4();
					if(lovePoint <= -60){
						bedEnding();
						break;
					}
				case 5:	
					System.out.println("(System)---------------EVENT5--------------->(엔터)");
					femCEvent5();
					if(lovePoint <= -60){
						bedEnding();
					}
				case 6:		
					if(lovePoint <= -60){
						bedEnding();
						break;
					}else if(lovePoint < 59){
						normalEnding();
					}
					System.out.println("(System)---------------ENDING--------------->(엔터)");
					femCEnding();
					}
			};
		}
		void malCEvent1(){
			System.out.println("(System)당신은 교양 수업에서 " + malCharater[selectCharaterNum - 1] + "의 옆자리에 앉게 되었습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("교수님 : 오늘 학식 메뉴가 산채비빔밥인가요? 죽은채비빔밥보다는 낫지 않나요? 껄껄껄껄!  >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)교수님이 이상한 아재개그를 던졌습니다. 학생들의 반응은 싸늘합니다.>(엔터)" );
			next = s.nextLine();
			System.out.println("(System)C의 표정도 별로 좋지 않은 것 같습니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.뒤늦게 개그를 이해했다는 듯이 깔깔 웃는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("2.아무 반응도 하지 않는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("3.'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.'라고 말한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			while(true){
				if(selectNum != 1 && selectNum != 2 && selectNum != 3){
					selectNum = Integer.parseInt(s.nextLine());
				}
				break;
			}
			if(selectNum == 1){
				System.out.println("(System)당신이 깔깔 웃자, C는 무표정한 표정으로 당신을 바라봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 논리적으로 이해는 했지만, 뭐가 웃긴 포인트인지 감이 잡히지 않는 듯 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 C는 당신과 개그코드가 매우 다른 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신이 아무 반응도 하지 않자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 교재를 펼쳐 다음 수업 내용을 미리 살펴봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)머쓱한 교수님이 뒤늦은 수습('농담이었어요 여러분')을 하는 동안, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신과 C는 아무 말 없이 다음 페이지를 살펴보고 있습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 발언에 강의실 전체가 조용해집니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 살짝 의외라는 표정으로 나를 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)교수님이 조금 머쓱해하시며 다음 진도를 나가자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 당신에게 귓속말합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + name + ": 아, 네가 아니였으면 내가 말했을 거야. 고마워.(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
				for(int i = 0; i< 5; i++){
					System.out.println("");
				}
			}
		}
		void malCEvent2(){
			System.out.println("(System)당신은 동아리실 앞에 서서 오늘 밤 동아리실에서 잠을 잘까 고민하고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)원칙적으로는 동아리실은 10시 이후로는 이용할 수 없지만,>(엔터)" );
			next = s.nextLine();
			System.out.println("(System)교양 팀플 과제때문에 일분 일초가 아까운 당신은 동아리실을 이용하고 싶습니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)동아리실 열쇠를 관리실에서 몰래 빼 오면 이용할 수 있을 듯 합니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.사람이 없는 관리실에 들어가 동아리실 열쇠를 가져온다. ");
			next = s.nextLine();
			System.out.println("2.그래도 원칙에 어긋나는 행동은 하고 싶지 않다. ");
			next = s.nextLine();
			System.out.println("3.동아리 부장(C)에게 연락해 보조 열쇠를 가져온다.");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 관리실에서 몰래 동아리실 열쇠를 빼 와 문을 열었습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)한참 과제를 하고 있던 도중, C가 동아리 방에 들어옵니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 너였구나. 도서관에서 이제 집에 가려는데 동아리실 불이 켜져 있어서 올라와봤어. >(엔터) ");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 그런데.. 동아리실은 10시까지 사용하는 게 원칙인 걸로 아는데.  >(엔터) ");
				next = s.nextLine();
				System.out.println(name + ": 네, 그렇긴 한데.. 내일 과제가 너무 바빠서요..  >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 네가 그렇다면야.  >(엔터) ");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 방문을 닫고 동아리실을 나갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 어쩐지 별로 좋은 인상을 준 건 같진 않습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 10;
				System.out.println("(System)C의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신은 그래도 원칙에 어긋나는 행동은 하고 싶지 않습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)집이 조금 멀긴 하지만, 지하철을 타는 동안에 정리를 하면 어떻게 될 듯도 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 열심히 과제를 해내 다음 날 팀플 과제를 훌륭히 발표했습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 당신에게 조금 감명을 받은 것 같습니다.>(엔터)");
				next = s.nextLine();
				lovePoint += 20;
				System.out.println("(System)C의 호감도가 20 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 관리실에 몰래 들어가는 대신, 동아리 부장인 C에게 보조 열쇠를 부탁합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 무슨 일인가 했어. 자, 여기 보조 열쇠. >(엔터) ");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 그런데, 원래 원칙적으로는 안 되는 일인 거 알지? >(엔터) ");
				next = s.nextLine();
				System.out.println(name + ": 네... 앞으로는 이런 일 없도록 할게요. >(엔터) ");
				next = s.nextLine();
				System.out.println("(System)별로 좋은 인상을 준 것 같진 않습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
		}
		void malCEvent3(){
			System.out.println("(System)당신은 과제를 하기 위해 간 학교 주변 카페에서 " + malCharater[selectCharaterNum - 1] + "를 발견했습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 무언가에 굉장히 집중한 듯 심각한 표정으로 노트북 화면을 바라보고 있습니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)c는 무엇을 그렇게 진지하게 보고 있는 것일까요? 당신은 호기심이 생깁니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)c에게 인사를 해야 할까요? 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1. 지금은 매우 집중하고 있는 것 같으므로, 조금 뒤에 인사한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("2. 조금 뒤에 인사하면 타이밍을 놓칠지 모른다. 지금 인사한다.>(엔터)" );
			next = s.nextLine();
			System.out.println("3. 괜히 말을 걸었다가 방해를 받았다고 느낄수도 있다. 무시한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 10분쯤 뒤에 c가 음료를 또 주문하러 나왔을 때 자연스럽게 인사했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 아, 안녕 . " + name + "(이)구나. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 너도 여기 공부하러 온 거야? >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 네, 여기가 은근 공부가 잘 되더라구요.  >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 그렇지? 나는 이번에 열리는 공모전 참여조건 보고 있었어. 너도 볼래? >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 거기 참여하면 너도 나중에 포트폴리오로 쓰기도 좋을거야. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 웃으며 당신에게 방금 자신이 보고 있던 공모전을 보여줍니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 나는 지금 과도 좋고 공부하는 것도 너무 좋아서.. 앞으로도 열심히 하고 싶어. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)평소에는 조금 무심한 감이 있는 C가  눈을 반짝이며 이야기합니다. ");
				next = s.nextLine();
				System.out.println("(System)당신과 C는 함께 이야기를 나누며 즐겁게 시간을 보냈습니다.  >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신은 C의 테이블로 가서 반갑게 인사했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":...뭐라고? 미안한데, 조금 뒤에 다시 와줄래? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 화면에서 얼굴을 떼지도 않은 채 대답합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 머쓱하게 자리로 돌아갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)잠시 뒤, 볼일을 끝낸 C가 당신에게 와서 인사하지만, 서먹한 분위기는 어쩔 수 없었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 괜히 말을 걸었다가 방해를 받았다고 느낄수도 있다고 생각해, 카페에서 있는 내내 C를 무시했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":안녕, "+name +"아, 아까 봤는데 바쁜 것 같더라. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 머쓱하게 그렇다고 대답합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":그렇구나. 바쁘면 방해하면 안되지. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 자리로 돌아갔습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void malCEvent4(){
			System.out.println("(System)당신은 동아리방에서 공모전을 설명하는 C를 보고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)이 공모전은 매년마다 전통적으로 동아리에서 참여하는 공모전으로, >(엔터)");
			next = s.nextLine();
			System.out.println("(System)공모전 사람들이 모두 참여해 간단한 게임 프로그램 하나를 완성시켜야 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 퀄리티 있는 결과물을 원하는 것처럼 보입니다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System)그러나 문제는 기한과 인력이 빠듯하기 때문에, 어쩌면 작년보다도 못한 결과가 나올 수도 있다는 것입니다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System)설명을 마친 C는 동의를 구하는 듯이 당신을 바라봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.C의 주장에 적극적으로 찬성한다. >(엔터)");
			next = s.nextLine();
			System.out.println("2.현실적으로 보았을 때, 이 기획은 불가능한 것 같다고 이야기한다. >(엔터)");
			next = s.nextLine();
			System.out.println("3.꼭 공모전에 응모해야만 하나요? 올해는 빠지는 게 어떨까요? 하고 말한다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + " : 완전 좋아요. 우리 힘내서 정말 멋진 작품을 만들어봐요! >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 C의 주장을 완전히 찬성하자, 다른 동아리원들이 의문을 제기합니다. >(엔터)" );
				next = s.nextLine();
				System.out.println("(System)결국 기나긴 공방전이 다시 시작되었습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결과적으로, 동아리 공모전의 방향은 화려한 것보다는 완성도를 높이는 방향으로 진행되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + " : '현실적으로 보았을 때, 이 기획은 불가능하다고 생각해요.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 C의 주장을 정면으로 반대하자, C는 잠시 생각에 잠기는 것처럼 보입니다. >(엔터)" );
				next = s.nextLine();
				System.out.println("(System)그리고 고민 끝에 당신의 주장에 동의합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 네 말이 맞는 것 같아. 현실적으로 우리는 시간도 인력도 부족하지.>(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 너무 무리해서 미완성된 작품을 만들기보다는 조금 간단해도 완성도 있는 작품을 만들자. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)동아리 공모전의 방향은 당신의 의견대로 진행되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이후 C는 당신에게 조용히 찾아와 이야기했습니다.");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ": 현실적으로 바른 의견을 내 줘서 고마워. 너랑 있으면 내가 더 좋은 선택을 내리는 것 같아.  >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println(name + " : 꼭 공모전에 응모해야 하나요? 올해는 그냥 쉬는 게 어때요? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 말에 C는 대답할 가치를 느끼지 못한 듯 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)동아리 공모전에 대한 기획은 관심이 없는 당신을 빼고 진행되었습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 30;
				System.out.println("(System)C의 호감도가 30 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
		}
		}
		void malCEvent5(){
			System.out.println("(System)---------------FINAL EVENT--------------- >(엔터)");
			next = s.nextLine();
			System.out.println("(System)동아리실에서 혼자 앉아 있던 당신에게 C가 다가옵니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)조금 주저하는 것도 같은 게, 평소의 모습과 약간 달라 보입니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 잠시 고민 끝에 당신에게 말을 겁니다. >(엔터)");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아, 혹시 이런 경우 너는 어떻게 행동할 지 말해줄 수 있을까? ");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":다른 사람에게도 물어볼 수 있겠지만, 왜인지 네가 더 마음이 편한 것 같아.");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":부모님께서는 내가 휴학하고 유학을 다녀오길 원하셔.");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":하지만 나는, 글쎄...이곳에서 얻을 수 있는 게 더 있지 않을까 싶어서 고민 중이야. ");
			next = s.nextLine();
			System.out.println(malCharater[selectCharaterNum - 1] + ":네가 나라면 어떻게 했을 것 같아?");
			next = s.nextLine();
			System.out.println("(System)C에게 어떤 대답을 하시겠습니까 >(엔터)");
			next = s.nextLine();
			System.out.println("1.진짜 복에 겨운 고민이시네요.(빈정) >(엔터)");
			next = s.nextLine();
			System.out.println("2.저라면 보내주실 수 있을 때 갈 것 같아요. 기회를 놓치지 마세요. >(엔터)");
			next = s.nextLine();
			System.out.println("3.오빠가 원하는 대로 하세요. 어차피 선택하는 건 오빠잖아요. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + ": 진짜 복에 겨운 고민이시네요.(빈정) >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 당신도 모르게 끓어오르는 아니꼬움을 자제하지 못하고 비꼬아 버렸습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":...그래. ");
				next = s.nextLine();
				System.out.println("(System)C는 조금 상처받은 듯 했지만, 의외로 익숙한 반응인지 담담하게 받아들였습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":말해줘서 고맙다. 잘 있어. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 얼마 뒤 유학을 갔고, 당신과는 연락이 끊겼습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 100;
				System.out.println("(System)C의 호감도가 100 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + ":저라면 보내주실 수 있을 때 꼭 갈 것 같아요. 기회를 놓치지 마세요. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":...그래. 말해줘서 고마워. ");
				next = s.nextLine();
				System.out.println("(System)C는 조금 후련해진 듯 살짝 웃음지었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":말해줘서 정말 고마워. >(엔터)");
				next = s.nextLine();
				lovePoint += 100;
				secreatPoint += 100;
				System.out.println("(System)C의 호감도가 100 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println(name + ":오빠가 원하는 대로 하세요. 어차피 선택하는 건 오빠잖아요. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":나는 네 의견이 궁금한 거였..아니다. 말해줘서 고마워.");
				next = s.nextLine();
				System.out.println("(System)C는 조금 답답해 보였지만 더 이상 말하진 않았습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":말해줘서 고마워. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System)---------------FINAL EVENT END--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void malCEnding(){
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println(malCharater[selectCharaterNum - 1] + ":" + name + "아(야), 좋아해. ");
			next = s.nextLine();
			System.out.println("(System) 당신은 충분히 C의 호감도를 얻어, C와 연인이 되었습니다. >(엔터)");
			next = s.nextLine();
			if(secreatPoint != 0){
				System.out.println("(System)당신은 휴학을 하고 C와 함께 외국으로 떠났습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C가 유학을 하는 동안, 당신은 어학원에서 어학 공부를 하며 함께 지낼 것입니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이후에 둘의 관계가 또 어떻게 될지는 모르는 일이지만, (엔터)");
				next = s.nextLine();
				System.out.println("(System)지금 당신과 C는 서로를 이끌어주는 아주 좋은 관계가 되어주고 있습니다. (엔터)");
				next = s.nextLine();
			}else{
				System.out.println("(System)당신은 C와 연인이 되었지만, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 몇 년간 유학을 떠나기로 했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)비록 서로의 거리는 멀어졌지만,(엔터)");
				next = s.nextLine();
				System.out.println("(System)그럼에도 당신과 C는 서로를 위하고 있습니다.(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System) 당신은 FIND MY LOVE 에서 당신의 짝을 찾았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 축하드립니다!! >(엔터)");
			next = s.nextLine();
			System.out.println("System)---------------HAPPY ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
		}
		void femCEvent1(){
			System.out.println("(System)당신은 교양 수업에서 " + femalCharater[selectCharaterNum - 1] + "의 옆자리에 앉게 되었습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("교수님 : 오늘 학식 메뉴가 산채비빔밥인가요? 죽은채비빔밥보다는 낫지 않나요? 껄껄껄껄!  >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)교수님이 이상한 아재개그를 던졌습니다. 학생들의 반응은 싸늘합니다.>(엔터)" );
			next = s.nextLine();
			System.out.println("(System)C의 표정도 별로 좋지 않은 것 같습니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.뒤늦게 개그를 이해했다는 듯이 웃는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("2.아무 반응도 하지 않는다. >(엔터)" );
			next = s.nextLine();
			System.out.println("3.'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.'라고 말한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신이 웃자, C는 무표정한 표정으로 당신을 바라봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 논리적으로 이해는 했지만, 뭐가 웃긴 포인트인지 감이 잡히지 않는 듯 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)아무래도 C는 당신과 개그코드가 매우 다른 것 같습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 2){
				System.out.println("(System)당신이 아무 반응도 하지 않자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 교재를 펼쳐 다음 수업 내용을 미리 살펴봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)머쓱한 교수님이 뒤늦은 수습('농담이었어요 여러분')을 하는 동안, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신과 C는 아무 말 없이 다음 페이지를 살펴보고 있습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)호감도에 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 3){
				System.out.println("(System)'교수님 그런 재미없는 농담 대신 수업 진도를 더 나가주시죠.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 발언에 강의실 전체가 조용해집니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)선배는 살짝 의외라는 표정으로 나를 쳐다봅니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)교수님이 조금 머쓱해하시며 다음 진도를 나가자, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 당신에게 귓속말합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] +":" + name + " 아(야), 네가 아니였으면 내가 말했을 거야. 고마워.(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				for(int i = 0; i< 5; i++){
					System.out.println("");
				}
			}
		}
		void femCEvent2(){
			System.out.println("(System)당신은 동아리실 앞에 서서 오늘 밤 동아리실에서 잠을 잘까 고민하고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)원칙적으로는 동아리실은 10시 이후로는 이용할 수 없지만,>(엔터)" );
			next = s.nextLine();
			System.out.println("(System)교양 팀플 과제때문에 일분 일초가 아까운 당신은 동아리실을 이용하고 싶습니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)동아리실 열쇠를 관리실에서 몰래 빼 오면 이용할 수 있을 듯 합니다. 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1.사람이 없는 관리실에 들어가 동아리실 열쇠를 가져온다. ");
			next = s.nextLine();
			System.out.println("2.그래도 원칙에 어긋나는 행동은 하고 싶지 않다. ");
			next = s.nextLine();
			System.out.println("3.동아리 부장(C)에게 연락해 보조 열쇠를 가져온다.");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 관리실에서 몰래 동아리실 열쇠를 빼 와 문을 열었습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)한참 과제를 하고 있던 도중, C가 동아리 방에 들어옵니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 너였구나. 도서관에서 이제 집에 가려는데 동아리실 불이 켜져 있어서 올라와봤어. >(엔터) ");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 그런데.. 동아리실은 10시까지 사용하는 게 원칙인 걸로 아는데.  >(엔터) ");
				next = s.nextLine();
				System.out.println(name + ": 네, 그렇긴 한데.. 내일 과제가 너무 바빠서요..  >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 네가 그렇다면야.  >(엔터) ");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 방문을 닫고 동아리실을 나갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)그러나 어쩐지 별로 좋은 인상을 준 건 같진 않습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 10;
				System.out.println("(System)C의 호감도가 10 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 2){
				System.out.println("(System)당신은 그래도 원칙에 어긋나는 행동은 하고 싶지 않습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)집이 조금 멀긴 하지만, 지하철을 타는 동안에 정리를 하면 어떻게 될 듯도 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 열심히 과제를 해내 다음 날 팀플 과제를 훌륭히 발표했습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 당신에게 조금 감명을 받은 것 같습니다.>(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 3){
				System.out.println("(System)당신은 관리실에 몰래 들어가는 대신, 동아리 부장인 C에게 보조 열쇠를 부탁합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 무슨 일인가 했어. 자, 여기 보조 열쇠. >(엔터) ");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 그런데, 원래 원칙적으로는 안 되는 일인 거 알지? >(엔터) ");
				next = s.nextLine();
				System.out.println(name + ": 네... 앞으로는 이런 일 없도록 할게요. >(엔터) ");
				next = s.nextLine();
				System.out.println("(System)별로 좋은 인상을 준 것 같진 않습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				for(int i = 0; i< 5; i++){
					System.out.println("");
				}
			}
		}
		void femCEvent3(){
			System.out.println("(System)당신은 과제를 하기 위해 간 학교 주변 카페에서 " + femalCharater[selectCharaterNum - 1] + "를 발견했습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 무언가에 굉장히 집중한 듯 심각한 표정으로 노트북 화면을 바라보고 있습니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)c는 무엇을 그렇게 진지하게 보고 있는 것일까요? 당신은 호기심이 생깁니다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)c에게 인사를 해야 할까요? 당신은 어떻게 하시겠습니까? >(엔터)" );
			next = s.nextLine();
			System.out.println("1. 지금은 매우 집중하고 있는 것 같으므로, 조금 뒤에 인사한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("2. 조금 뒤에 인사하면 타이밍을 놓칠지 모른다. 지금 인사한다.>(엔터)" );
			next = s.nextLine();
			System.out.println("3. 괜히 말을 걸었다가 방해를 받았다고 느낄수도 있다. 무시한다. >(엔터)" );
			next = s.nextLine();
			System.out.println("(System)행동을 선택해 주세요. >(입력)" );
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println("(System)당신은 10분쯤 뒤에 c가 음료를 또 주문하러 나왔을 때 자연스럽게 인사했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 아, 안녕 . " + name + "(이)구나. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 너도 여기 공부하러 온 거야? >(엔터)");
				next = s.nextLine();
				System.out.println(name + ": 네, 여기가 은근 공부가 잘 되더라구요.  >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 그렇지? 나는 이번에 열리는 공모전 참여조건 보고 있었어. 너도 볼래? >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 거기 참여하면 너도 나중에 포트폴리오로 쓰기도 좋을거야. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 웃으며 당신에게 방금 자신이 보고 있던 공모전을 보여줍니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 나는 지금 과도 좋고 공부하는 것도 너무 좋아서.. 앞으로도 열심히 하고 싶어. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)평소에는 조금 무심한 감이 있는 C가  눈을 반짝이며 이야기합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신과 C는 함께 대화를 나누며 즐겁게 시간을 보냈습니다.  >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println("(System)당신은 C의 테이블로 가서 반갑게 인사했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":...뭐라고? 미안한데, 조금 뒤에 다시 와줄래? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 화면에서 얼굴을 떼지도 않은 채 대답합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 머쓱하게 자리로 돌아갑니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)잠시 뒤, 볼일을 끝낸 C가 당신에게 와서 인사하지만, 서먹한 분위기는 어쩔 수 없었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println("(System)당신은 괜히 말을 걸었다가 방해를 받았다고 느낄수도 있다고 생각해, 카페에서 있는 내내 C를 무시했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":안녕, "+name +"아, 아까 봤는데 바쁜 것 같더라. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 머쓱하게 그렇다고 대답합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":그렇구나. 바쁘면 방해하면 안되지. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 조용히 자리로 돌아갔습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();}
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void femCEvent4(){
			System.out.println("(System)당신은 동아리방에서 공모전을 설명하는 C를 보고 있습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)이 공모전은 매년마다 전통적으로 동아리에서 참여하는 공모전으로, >(엔터)");
			next = s.nextLine();
			System.out.println("(System)공모전 사람들이 모두 참여해 간단한 게임 프로그램 하나를 완성시켜야 합니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 퀄리티 있는 결과물을 원하는 것처럼 보입니다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System)그러나 문제는 기한과 인력이 빠듯하기 때문에, 어쩌면 작년보다도 못한 결과가 나올 수도 있다는 것입니다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System)설명을 마친 C는 동의를 구하는 듯이 당신을 바라봅니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)당신은 어떻게 하시겠습니까? >(엔터)");
			next = s.nextLine();
			System.out.println("1.C의 주장에 적극적으로 찬성한다. >(엔터)");
			next = s.nextLine();
			System.out.println("2.현실적으로 보았을 때, 이 기획은 불가능한 것 같다고 이야기한다. >(엔터)");
			next = s.nextLine();
			System.out.println("3.꼭 공모전에 응모해야만 하나요? 올해는 빠지는 게 어떨까요? 하고 말한다.>(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + " : 완전 좋아요. 우리 힘내서 정말 멋진 작품을 만들어봐요! >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 C의 주장을 완전히 찬성하자, 다른 동아리원들이 의문을 제기합니다. >(엔터)" );
				next = s.nextLine();
				System.out.println("(System)결국 기나긴 공방전이 다시 시작되었습니다.  >(엔터)");
				next = s.nextLine();
				System.out.println("(System)결과적으로, 동아리 공모전의 방향은 화려한 것보다는 완성도를 높이는 방향으로 진행되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에는 아무 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + " : '현실적으로 보았을 때, 이 기획은 불가능하다고 생각해요.' >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신이 C의 주장을 정면으로 반대하자, C는 잠시 생각에 잠기는 것처럼 보입니다. >(엔터)" );
				next = s.nextLine();
				System.out.println("(System)그리고 고민 끝에 당신의 주장에 동의합니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 네 말이 맞는 것 같아. 현실적으로 우리는 시간도 인력도 부족하지.>(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 너무 무리해서 미완성된 작품을 만들기보다는 조금 간단해도 완성도 있는 작품을 만들자. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)동아리 공모전의 방향은 당신의 의견대로 진행되었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이후 C는 당신에게 조용히 찾아와 이야기했습니다.");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ": 현실적으로 바른 의견을 내 줘서 고마워. 너랑 있으면 내가 더 좋은 선택을 내리는 것 같아.  >(엔터)");
				next = s.nextLine();
				lovePoint += 30;
				System.out.println("(System)C의 호감도가 30 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 3){
				System.out.println(name + " : 꼭 공모전에 응모해야 하나요? 올해는 그냥 쉬는 게 어때요? >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신의 말에 C는 대답할 가치를 느끼지 못한 듯 합니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)동아리 공모전에 대한 기획은 관심이 없는 당신을 빼고 진행되었습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 30;
				System.out.println("(System)C의 호감도가 30 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			for(int i = 0; i< 5; i++){
				System.out.println("");
		}
		}
		void femCEvent5(){
			System.out.println("(System)---------------FINAL EVENT--------------- >(엔터)");
			next = s.nextLine();
			System.out.println("(System)동아리실에서 혼자 앉아 있던 당신에게 C가 다가옵니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)조금 주저하는 것도 같은 게, 평소의 모습과 약간 달라 보입니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)C는 잠시 고민 끝에 당신에게 말을 겁니다. >(엔터)");
			next = s.nextLine();
			System.out.println(femalCharater[selectCharaterNum - 1] + ":" + name + "아, 혹시 이런 경우 너는 어떻게 행동할 지 말해줄 수 있을까? ");
			next = s.nextLine();
			System.out.println(femalCharater[selectCharaterNum - 1] + ":다른 사람에게도 물어볼 수 있겠지만, 왜인지 네가 더 마음이 편한 것 같아.");
			next = s.nextLine();
			System.out.println(femalCharater[selectCharaterNum - 1] + ":부모님께서는 내가 휴학하고 유학을 다녀오길 원하셔.");
			next = s.nextLine();
			System.out.println(femalCharater[selectCharaterNum - 1] + ":하지만 나는, 글쎄...이곳에서 얻을 수 있는 게 더 있지 않을까 싶어서 고민 중이야. ");
			next = s.nextLine();
			System.out.println(femalCharater[selectCharaterNum - 1] + ":네가 나라면 어떻게 했을 것 같아?");
			next = s.nextLine();
			System.out.println("(System)C에게 어떤 대답을 하시겠습니까 >(엔터)");
			next = s.nextLine();
			System.out.println("1.진짜 복에 겨운 고민이시네요.(빈정) >(엔터)");
			next = s.nextLine();
			System.out.println("2.저라면 보내주실 수 있을 때 갈 것 같아요. 기회를 놓치지 마세요. >(엔터)");
			next = s.nextLine();
			System.out.println("3.누나가 원하는 대로 하세요. 어차피 선택하는 건 누나잖아요. >(엔터)");
			next = s.nextLine();
			System.out.println("(System) 당신의 행동을 선택해주세요. >(엔터)");
			select = s.nextLine();
			while(true){
				while(select.equals("")){
					System.out.println("(System)행동을 선택해 주세요. >(입력)" );
					select = s.nextLine();
					}
				while(select.equals("1") && select.equals("2") && select.equals("3")){
					System.out.println("(System) 1, 2, 3 중 하나를 선택해주세요 >(번호 입력)");
					select = s.nextLine();
					}
				if(select.equals("1") || select.equals("2") || select.equals("3")){
					break;
					}
				}
			selectNum = Integer.parseInt(select);
			if(selectNum == 1){
				System.out.println(name + ": 진짜 복에 겨운 고민이시네요.(빈정) >(엔터)");
				next = s.nextLine();
				System.out.println("(System)당신은 당신도 모르게 끓어오르는 아니꼬움을 자제하지 못하고 비꼬아 버렸습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":...그래. ");
				next = s.nextLine();
				System.out.println("(System)C는 조금 상처받은 듯 했지만, 의외로 익숙한 반응인지 담담하게 받아들였습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(malCharater[selectCharaterNum - 1] + ":말해줘서 고맙다. 잘 있어. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 얼마 뒤 유학을 갔고, 당신과는 연락이 끊겼습니다. >(엔터)");
				next = s.nextLine();
				lovePoint -= 100;
				System.out.println("(System)C의 호감도가 100 내려갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}else if(selectNum == 2){
				System.out.println(name + ":저라면 보내주실 수 있을 때 꼭 갈 것 같아요. 기회를 놓치지 마세요. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":...그래. 말해줘서 고마워. ");
				next = s.nextLine();
				System.out.println("(System)C는 조금 후련해진 듯 살짝 웃음지었습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":말해줘서 정말 고마워. >(엔터)");
				next = s.nextLine();
				lovePoint += 100;
				secreatPoint += 100;
				System.out.println("(System)C의 호감도가 100 올라갑니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
			}else if(selectNum == 3){
				System.out.println(name + ":누나가 원하는 대로 하세요. 어차피 선택하는 건 누나잖아요. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":나는 네 의견이 궁금한 거였..아니다. 말해줘서 고마워.");
				next = s.nextLine();
				System.out.println("(System)C는 조금 답답해 보였지만 더 이상 말하진 않았습니다. >(엔터)");
				next = s.nextLine();
				System.out.println(femalCharater[selectCharaterNum - 1] + ":말해줘서 고마워. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C의 호감도에 변화가 없습니다. 현재 호감도: " + lovePoint +" 점>(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System)---------------FINAL EVENT END--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i< 5; i++){
				System.out.println("");
			}
		}
		void femCEnding(){
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println(femalCharater[selectCharaterNum - 1] + ":" + name + "아(야), 좋아해. ");
			next = s.nextLine();
			System.out.println("(System) 당신은 충분히 C의 호감도를 얻어, C와 연인이 되었습니다. >(엔터)");
			next = s.nextLine();
			if(secreatPoint != 0){
				System.out.println("(System)당신은 휴학을 하고 C와 함께 외국으로 떠났습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C가 유학을 하는 동안, 당신은 어학원에서 어학 공부를 하며 함께 지낼 것입니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)이후에 둘의 관계가 또 어떻게 될지는 모르는 일이지만, (엔터)");
				next = s.nextLine();
				System.out.println("(System)지금 당신과 C는 서로를 이끌어주는 아주 좋은 관계가 되어주고 있습니다. (엔터)");
				next = s.nextLine();
			}else{
				System.out.println("(System)당신은 C와 연인이 되었지만, >(엔터)");
				next = s.nextLine();
				System.out.println("(System)C는 몇 년간 유학을 떠나기로 했습니다. >(엔터)");
				next = s.nextLine();
				System.out.println("(System)비록 서로의 거리는 멀어졌지만,(엔터)");
				next = s.nextLine();
				System.out.println("(System)그럼에도 당신과 C는 서로를 위하고 있습니다.(엔터)");
				next = s.nextLine();
			}
			System.out.println("(System)당신은 FIND MY LOVE 에서 당신의 짝을 찾았습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)축하드립니다!! >(엔터)");
			next = s.nextLine();
			System.out.println("System)---------------HAPPY ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
		}
		void bedEnding(){
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println("(System)당신의 호감도는 도저히 구제할 수 없을 정도로 추락하여,");
			next = s.nextLine();
			System.out.println("상대로 부터 어떤 호감도 얻어낼 수 없게 되었습니다. ");
			next = s.nextLine();
			System.out.println("(System)안타깝게도 당신은 FIND MY LOVE 에서 당신의 짝을 찾지 못했습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)---------------BED ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
		}
		}
		void normalEnding(){
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
			}
			System.out.println("(System)당신의 호감도는 그렇게 낮지도 않지만, 그렇게 높지도 않아서,");
			next = s.nextLine();
			System.out.println("상대로 부터 딱히 연애감정을 이끌어낼 수는 없었습니다. ");
			next = s.nextLine();
			System.out.println("(System)안타깝게도 당신은 FIND MY LOVE 에서 당신의 짝을 찾지 못했습니다. >(엔터)");
			next = s.nextLine();
			System.out.println("(System)---------------NORMAL ENDING--------------->(엔터)");
			next = s.nextLine();
			for(int i = 0; i < 10; i++){
				System.out.println("-------------------------------------");
		}
		}
		
	
}
