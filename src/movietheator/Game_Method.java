package movietheator;
import java.util.Arrays;
import java.util.Scanner;

public class Game_Method {
	public static int temp1;
	public static int money;
	public static String next;
	public static String movieSelect;
	public static int count;
	public static int happyPoint = 0;
	public static int jinsangPoint = 0;
	public static int succes = 1;
	//손님
	static Game_Customer a1 = new Teacher1();
	static Game_Customer a2 = new Teacher2();
	static Game_Customer a3 = new Teacher3();
	static Game_Customer a4 = new Teacher4();
	static Game_Customer a5 = new Teacher5();
	static Game_Customer a6 = new Teacher6();
	static Game_Customer a7 = new Teacher7();
	static Game_Customer a8 = new Teacher8();
	static Game_Customer a9 = new Teacher9();
	static Game_Customer a10 = new Teacher10();
	//손님 바구니		
	static Game_Customer[] custombag = new Game_Customer[10];
	
	//영화 객체
	static Game_movie m1 = new movie1();
	static Game_movie m2 = new movie2();
	static Game_movie m3 = new movie3();
	static Game_movie m4 = new movie4();
	static Game_movie m5 = new movie5();
	static Game_movie m6 = new movie6();
	static Game_movie m7 = new movie7();
	static Game_movie m8 = new movie8();
	static Game_movie m9 = new movie9();
	static Game_movie m10 = new movie10();
	
	//영화 바구니
	static Game_movie[] moviebag = new Game_movie[10];
	
	//중복되지 않는 숫자 박스
	static int CountBox[] = {1,2,3,4,5,6,7,8,9,10};
	 
	//영화 선택용 코드
	static int what= 0; 
	
	//영화 이벤트
	Event event = new Event();
	
	
	void intro(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		next = s.nextLine();
		System.out.println("□ 나 : 오늘은 기다리던 영화관 알바 면접날...! >(엔터)");
		next = s.nextLine();
		System.out.println("□ 나 : 내 생애 처음으로 해보는 알바. 잘 해낼 수 있겠지? >(엔터)");
		next = s.nextLine();
		System.out.println("□ 나 : 안녕하세요... 저 오늘 면접보러 온 사람인데... >(엔터)");
		next = s.nextLine();
		System.out.println("☞ 전 알바생 : 이딴 곳에서 다시는 일하나 봐라!! >(엔터)");
		next = s.nextLine();
		System.out.println("전 알바생이 분노에 차 뛰쳐나간 문을 열고 면접 장소로 들어가자,  >(엔터)");
		next = s.nextLine();
		System.out.println("사장님이 당신에게 환하게 웃으며 말했습니다.   >(엔터)");
		next = s.nextLine();
		System.out.println("■ 사장 : 좋아, 합격일세! >(엔터)");
		next = s.nextLine();
		System.out.println("□ 나 : 네..? 아무것도 안했는데요?  >(엔터)");
		next = s.nextLine();
		System.out.println("■ 사장 : 괜찮아 괜찮아, 하다 보면 다~~~~익숙해지게 되어 있으니까! >(엔터)");
		next = s.nextLine();
		System.out.println("□ 나 : 네... >(엔터)");
		next = s.nextLine();
		System.out.println("그렇게 당신은 오늘부터 이상한 영화관의 알바를 시작하게 되었습니다. >(엔터)");
		next = s.nextLine();
		System.out.println("□ 나 : 뭔가 잘못된 것 같은 느낌이 들지만... 그래도 열심히 해봐야지! >(엔터)");
		next = s.nextLine();
		
		for(int i = 0; i< 10; i ++){
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		for(int i = 0; i< 3; i ++){
			System.out.println(" ");
		}
		
	}
	void day(){
		
		
		
		//엔딩 객체
		Ending e = new Ending();
		
		Scanner s = new Scanner(System.in);
		outer: for(int i = 0; i < 3; i++){
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□ 알바 [" + (i + 1)+ "] 일차 □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			next = s.nextLine();
			
			
			//숫자 랜덤 섞기
			for(int d = 0; d<9; d++){
				count = (int)(Math.random()*10);
				int temp = 0;
				temp = CountBox[count];
				CountBox[count] = CountBox[d];
				CountBox[d] = temp;
			}
			//손님 바구니/영화 바구니에 손님/영화 넣기
			for(int q = 0; q < custombag.length; q++){
				
				if(CountBox[q] == 1 ){
					custombag[q] = a1;
					moviebag[q] = m1;
				}else if(CountBox[q]  == 2){
					custombag[q] = a2;
					moviebag[q] = m2;
				}else if(CountBox[q]  == 3){
					custombag[q] = a3;
					moviebag[q] = m3;
				}else if(CountBox[q]  == 4){
					custombag[q] = a4;
					moviebag[q] = m4;
				}else if(CountBox[q]  == 5){
					custombag[q] = a5;
					moviebag[q] = m5;
				}else if(CountBox[q]  == 6){
					custombag[q] = a6;
					moviebag[q] = m6;
				}else if(CountBox[q]  == 7){
					custombag[q] = a7;
					moviebag[q] = m7;
				}else if(CountBox[q]  == 8){
					custombag[q] = a8;
					moviebag[q] = m8;
				}else if(CountBox[q]  == 9){
					custombag[q] = a9;
					moviebag[q] = m9;
				}else if(CountBox[q]  == 10){
					custombag[q] = a10;
					moviebag[q] = m10;
				}
				
			}
			
			
			
	
			//임시 시험 버전
			for(int j = 0; j < 3; j++){
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□ [" +(j + 1) + "] 번째 손님  □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			System.out.println(" ");
				if(custombag[j].equals(a1)){
					temp1 = j;
					((Teacher1) a1).talk();
				}else if(custombag[j].equals(a2)){
					temp1 = j;
					((Teacher2) a2).talk();
				}else if(custombag[j].equals(a3)){
					temp1 = j;
					((Teacher3) a3).talk();
				}else if(custombag[j].equals(a4)){
					temp1 = j;
					((Teacher4) a4).talk();
				}else if(custombag[j].equals(a5)){
					temp1 = j;
					((Teacher5) a5).talk();
				}else if(custombag[j].equals(a6)){
					temp1 = j;
					((Teacher6) a6).talk();
				}else if(custombag[j].equals(a7)){
					temp1 = j;
					((Teacher7) a7).talk();
				}else if(custombag[j].equals(a8)){
					temp1 = j;
					((Teacher8) a8).talk();
				}else if(custombag[j].equals(a9)){
					temp1 = j;
					((Teacher9) a9).talk();
				}else if(custombag[j].equals(a10)){
					temp1 = j;
					((Teacher10) a10).talk();
				}
				
				
			}
			
			int daily = (int)(Math.random()*100) + 1;
			int jinsang =  (int)(Math.random()*100) + jinsangPoint;
			if(daily < jinsang){
				event.jinsangEvent1();
			}
			
			
			if(happyPoint <= -150){
				e.bedEnding();
				 break outer;
			}else if(happyPoint >= 100){
				e.goodEnding();
				break outer;
			}
			//알바비 이벤트
			System.out.println("(system) 오늘 알바비 " + (succes * 1500) + "원이 입금되었습니다. ");
			money += succes * 1500;
			if(succes <= 4){
				next = s.nextLine();
				System.out.println("□ 나      : 알바비가 왜 이것밖에 안돼요? ");
				next = s.nextLine();
				System.out.println("□ 나      : 최저임금도 안되잖아요. ");
				next = s.nextLine();  
				System.out.println("■ 사장님: 그럼 일을 잘했어야지. 나 집에 가야 하니까 말 걸지 마!! ");
				next = s.nextLine();
				System.out.println("□ 나      :...");
				next = s.nextLine();
				succes = 1;
			}
			//알바비 엔딩
			if(money < 0){
				e.bankruptcy();
				break outer;
			}
			
		}
		
		if(happyPoint <= 100 && happyPoint > -150 && money > 0){
			e.normalEnding();
		}
	}
	static void menu(){
		
		
		Scanner s = new Scanner(System.in);
		String select = null;
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□ 메뉴 □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println(" ");
		System.out.println("(1)현재 상영 영화  (2)영화 티켓 발권  (3)손님 거절");
		System.out.println("(입력)>");
		select = s.nextLine();
		while(select.equals("")){
			System.out.println("(system) 번호를 입력해주세요. (입력)>");
			select = s.nextLine();
			if(!select.equals("")){
				break;
			}
		}
		
		
		
		//손님 객체
		Answer a = new Answer();
		
		
		if(select.equals("1")){
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□ 상영영화 □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			System.out.println("      제목              	 ||                  스토리                                ||");
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			System.out.println(moviebag[0].name + "\t ||" + moviebag[0].info);
			System.out.println(moviebag[1].name + "\t ||" + moviebag[1].info);
			System.out.println(moviebag[2].name + "\t ||" + moviebag[2].info);
			System.out.println(moviebag[3].name + "\t ||" + moviebag[3].info);
			System.out.println(moviebag[4].name + "\t ||" + moviebag[4].info);
			System.out.println("(처음으로)>");
			select = s.nextLine();
			menu(); 
			
		}else if(select.equals("2")){
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□ 발권영화 목록 □□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			System.out.println("(1)" + (moviebag[0].name).trim() + 
							   " (2)" + (moviebag[1].name).trim() + 
							   " (3)" + (moviebag[2].name).trim() + 
							   " (4)" + (moviebag[3].name).trim() + 
							   " (5)" + (moviebag[4].name).trim() +
							   " (6)이전으로 돌아간다");
			System.out.println("(입력)>");
			movieSelect = s.nextLine();
					while(movieSelect.equals("")){
						movieSelect = s.nextLine();
					if(!movieSelect.equals("")){
						break;
						}
					}
			//여기에서 문제 발생중 . 다시 확인할것
			if((custombag[temp1]).customerNumber == 8  ||
					(custombag[temp1]).customerNumber == 9){
				System.out.println("(system) 이들은 영화에는 관심이 없어 보입니다. (진상)");
				select = s.nextLine();
				movieSelect = null;
				menu();
				
			}else{
				if(movieSelect.equals("6")){
					menu(); 
				}else if((moviebag[Integer.parseInt(movieSelect)-1].movieNum )+1 == (custombag[temp1]).customerNumber){
						a.goodAnwer();
						happyPoint += 20;
						select = s.nextLine();
						System.out.println("(system) 만족도가 20 증가하였습니다. 현재 만족도 :" + happyPoint);
						select = s.nextLine();
						succes ++;
				}else{
					a.bedAnwer();
					happyPoint -= 30;
					System.out.println("(system) 만족도가 30 감소하였습니다. 현재 만족도 :" + happyPoint);
					select = s.nextLine();}
				}
			
		}else if(select.equals("3")){
			a.angryAnwer();
			jinsangPoint += 20;
			System.out.println("(system) 왜인지 알 수 없는 불길한 예감이 듭니다...");
			select = s.nextLine();
			happyPoint -= 30;
			System.out.println("(system) 만족도가 30 감소하였습니다. 현재 만족도 :" + happyPoint);
			select = s.nextLine();}
		
		
		
		

	}
	
}
