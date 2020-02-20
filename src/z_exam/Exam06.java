package z_exam;

public class Exam06 {

	/*
	 * [6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
	 * 타 입 		변수명		 설 명
		int		 num 		카드의 숫자.(1~10사이의 정수)
		boolean isKwang 	광(光)이면 true, 아니면 false

		//답: public class SutdaCard{
		 	
		 	int num = (int)(Math.random()*10) + 1;
		  	boolean isKwang; 
		  
		  }
		  //class는 객체를 생성하는 틀을 뜻한다.
		   * class는 기능과 속성으로 나뉘어지는데, 기능은 메서드, 속성은 멤버변수이다.
		   * 다음과 같은 멤버변수를 정의하라고 하였으므로,
		   * int num = (int)(Math.random()*10)+1; //1에서 10 사이의 랜덤 정수,
		   * boolean isKwang; // 광이면 true, 아니면 false 는 이후 메서드에서 정의하므로 지금은 boolean 타입 정의만 내린다. 


		[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
		결과와 같은 결과를 얻도록 하시오.
		[연습문제]/ch6/Exercise6_2.java
		class Exercise6_2 {
		public static void main(String args[]) {
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
		}
		class SutdaCard() {
		int num; //멤버변수
		boolean isKwang; //멤버변수
		
		SutdaCard(int num, boolean isKwang){
			this.num = num; //this는 SutdaCard의 매개변수 num 이 아닌,class SutdaCard 의 멤버변수 num 을 뜻한다.
			this. isKwang = isKwang; // this는 SutdaCard의 매개변수 isKwang 이 아닌, class SutdaCard 의 멤버변수 isKwang 을 뜻한다.
			
		} //SutdaCard 는 class SutdaCard의 생성자이다. 생성자란, 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드' 이다.
		
		SutdaCard(){
			this(1, true); //생성자 안에서 다른 생성자를 호출할 때에는 this를 사용한다.
						  //이 생성자는 this와 파라미터를 이용하여 첫 번째 생성자를 호출하고 있다. 
		}//class SutdaCard 의 두 번째 생성자이다. 
		
		String infor () {
			return num + (isKang ? "K" : ""); //이 생성자는 class SutdaCard의 멤버변수 num, 
											//isKang 이 true 일 경우 "K"를, 아닐 경우 ""를 반환한다. 
			
		}//String 값을 리턴하는 메서드 infor 이다. 
		
			 }
		}
		}
		
		[실행결과]
		31
		K
		
		
		[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
		
		타 입 변수명 설 명
		String name 학생이름
		int ban 반
		int no 번호
		int kor 국어점수
		int eng 영어점수
		int math 수학점수
		
		//답 :  
		 public class Student { //Student class를 정의함
		 	String name; //Student class의 멤버변수를 정의함. 
		  	int ban;
		  	int no;
		  	int eng;
		  	int math;
		  }
		  
		  
		  
		  [6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
			getTotal()과 getAverage()를 추가하시오.
			
			1. 메서드명 : getTotal
			기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
			반환타입 : int
			매개변수 : 없음
			
			2. 메서드명 : getAverage
			기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
			소수점 둘째자리에서 반올림할 것.
			반환타입 : float
			매개변수 : 없음
			
			[연습문제]/ch6/Exercise6_4.java
			class Exercise6_4 {
			public static void main(String args[]) {
			
			Student s = new Student();
			s.name = "홍길동";
			s.ban = 1;
			s.no = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			
			System.out.println("이름:"+s.name);
			System.out.println("총점:"+s.getTotal());
			System.out.println("평균:"+s.getAverage());
			}
			}
			class Student {
				//답 : 
				 
				String name;
				int ban;
				int no;
				int kor;
				int eng;
				int math;
				
				
			int getTotal(){ // int값을 반환하는 getTotal 메서드
			 	return kor + eng + math; // 매개변수 kor, eng, math를 더한 값을 반환한다. 
			 }
			 
			float getAverage(){ //float 값을 반환하는 getAverage 메서드
			 	return (int)( getTotal() / 3f * 10 + 0.5f) / 10f;
			 	//getTotal의 리턴값으로 평균값을 구한 것을 리턴한다. 
			 }	
			}
			[실행결과]
			이름:홍길동
			총점:236
			평균:78.7
			
			[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
			[연습문제]/ch6/Exercise6_5.java
			class Exercise6_5 {
			public static void main(String args[]) {
			
			Student s = new Student("홍길동",1,1,100,60,76);
			System.out.println(s.info());
			}
			}
			class Student {
				 
				String name;
				int ban;
				int no;
				int kor;
				int eng;
				int math;
				
				
				Student(String name, int ban, int no, int kor, int eng, int math){
					this.name = name;
					this.ban = ban;
					this.no = no;
					this.kor = kor;
					this.eng = eng;
					this.math = math;
					
				}
				
				int getTotal(){
			 	return kor + eng + math;
			 }
			 
			float getAverage(){
			 	return (int)( getTotal() / 3f * 10 + 0.5f) / 10f;
			 }
			 
				public String info(){ //String 값을 리턴하는 메서드 info 
				//접근 제어자 public은 다른 패키지 안에 들어 있는 class도 접근 가능하게 만든다.
				//public 이 붙어 있지 않은 class들은 default 값을 가지게 되어 
				//같은 패키지 내의 class들만 접근이 가능하게 된다.
				//결과적으로, 지금 info에 붙어 있는 public은 붙어 있든 말든 상관 없는 것이다.
				 * 
					return name
						+ "," + ban //멤버변수 ban 
						+ "," + no	//멤버변수 no
						+ "," + kor	//멤버변수 kor 
						+ "," + eng //멤버변수 eng 
						+ "," + math //멤버변수  math 
						+ "," + getTotal() //총점
						+ "," + getAverage() //평균
						;
						
					
					
				}
			
			}
			
	 
	[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
		[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
		[연습문제]/ch6/Exercise6_6.java
		class Exercise6_6 {
		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
		static double getDistance(int x, int y, int x1, int y1) { //static 메소드
		
			return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
			//두 점 간의 거리를 구하는 공식은 피타고라스 정리를 사용합니다. 
			// (x - x1) * (x - x1) + (y - y1) * (y - y1) 공식을 한 뒤, Math.sqrt메서드를 이용하여
			// 제곱근을 씌워 줍니다. 
		}
		
		public static void main(String args[]) { //메인 메소드
		System.out.println(getDistance(1,1,2,2)); 
		}
		}
		[실행결과]
		홍길동,1,1,100,60,76,236,78.7
		[실행결과]
		1.4142135623730951
			
			 
		[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 
			 MyPoint클래스의 인스턴스메서드로 정의하시오.
			 //메서드 앞에 static 이 붙어 있으면, 클래스 메서드이고
			 //				   붙어 있지 않으면, 인스턴스 메서드입니다.
			 //클래스 메서드는 객체를 생성하지 않고도 '클래스이름.메서드이름(매개변수)'와 같은 식으로 호출이 가능합니다.
			 //반면에, 인스턴스 매서드는 반드시 객체를 생성해야만 호출할 수 있습니다. 
			 //인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 
			 //즉 메서드의 작업을 수행하는 데 인스턴스 변수를 필요로 하는 메서드입니다.
			 //반면에 메서드 중에서 인스턴스와 관계없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는)
			 //메서드를 클래스 메서드(static 메서드)로 정의합니다.
			  
			  
			 
			[연습문제]/ch6/Exercise6_7.java
			
			class MyPoint {
			
				int x;
				int y;
				
				MyPoint(int x, int y) { //매개변수 int x, int y를 받아
					this.x = x;	//멤버변수 x와 y를 변경시켜주는 생성MyPoint 입니다. 
					this.y = y;
				}
			
				//답 :
				double getDistance(int x1, int y1){ //매개변수 int x1, int y1을 받는 인스턴스 메서드를 생성
					return Math.sqrt((x - x1) * (x - x1) + (y - y1)*(y - y1))
					//리턴값은 매개변수 x1, y1, 멤버변수 x, y를 사용합니다. 
				}
			
			}
			class Exercise6_7 {
			public static void main(String args[]) { //메인 메서드
			
				MyPoint p = new MyPoint(1,1); //멤버변수 x와 y로 int 1, int 1을 받는 
											  //새로운 객체 MyPoint p 생성.
				
			// p와 (2,2)의 거리를 구한다.
			 
				System.out.println(p.getDistance(2,2));
				//객체 p 내부의 getDistance 메소드를 사용하여 매개변수 2, 2와 멤버변수 1, 1을 이용해 거리를 구함. 
			}
			}

			 
			 
			 
	 	[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
			class PlayingCard { //class는 객체를 생성하기 위한 틀 입니다. 
			int kind; 
			int num;
			//int kind와 int num 이라는 class PlayingCard 의 멤버변수 입니다.
			  
			static int width;
			static int height;
			//int width 와 int height 라는 class PlatingCard 의 클래스변수 입니다. 
			
			PlayingCard(int k, int n) { // PlayingCard 라는 class의, 매개변수 int k, int n 을 받는 생성자 입니다.
			kind = k;
			num = n;
			}
			
			
			public static void main(String args[]) {
			PlayingCard card = new PlayingCard(1,1); //card 라는 새로운 객체를 생성합니다.
													//card는 생성자에 의해 1과 1을 각각 int k, int n매개변수로 받습니다. 
				}
			}
			- 클래스변수(static변수) :width, eight //클래스변수는 멤버변수 중 static이 쓰인 변수를 뜻합니다. 
												//클래스변수는 모든 인스턴스가 공통된 저장공간(변수)를 공유하게 됩니다.
			- 인스턴스변수 : kind , num //인스턴스 변수는 멤버변수 중 static 이 쓰이지 않은 변수를 뜻합니다.
									//인스턴스 변수는 인스턴스마다 독립적인 저장공간을 갖습니다. 
			- 지역변수 :  k , n, card, args //지역변수는 메서드 내에 쓰인 변수를 뜻합니다. 
	 
	 
	 [6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
			중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
			(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
			
			class Marine {
			int x=0, y=0; // Marine의 위치좌표(x,y)
			int hp = 60; // 현재 체력
			int weapon = 6; // 공격력
			int armor = 0; // 방어력
			void weaponUp() {
			weapon++;
			}
			void armorUp() {
			armor++;
			}
			void move(int x, int y) {
			this.x = x;
			this.y = y;
			}
			}
			//답 : weapon, armor, weaponUp(), armorUp()
			 //좌표, 체력은 개별 병사마다 서로 달라야 하므로 인스턴스 변수를 사용하지만,
			 //공격력, 방어력은 모든 병사들이 동일해야 하므로 클래스 변수와 클래스 메서드를 사용합니다. 
			  
			 [6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다. //모든 생성자의 이름은 클래스의 이름과 동일해야 합니다.
			b. 생성자는 객체를 생성하기 위한 것이다. //생성자는 객체를 생성하기 위한 것이라기보다는 객체를 초기화하기 위한 것입니다. 객체를 생성하는 것은 new 연산자입니다.
			c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다. //클래스에 아무 생성자도 존재하지 않으면 기본 생성자를 생성해줍니다. 
			d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다. //
			e. 생성자는 오버로딩 할 수 없다. //생성자도 오버로딩이 가능합니다. 
			
			답: b, e
			
			[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
			a. 객체 자신을 가리키는 참조변수이다. //생성자는 객체 자신을 가리키는 참조변수입니다. 
			b. 클래스 내에서라면 어디서든 사용할 수 있다. //this는 인스턴스 메서드에서만 사용이 가능합니다. 
			c. 지역변수와 인스턴스변수를 구별할 때 사용한다. //지역변수와 인스턴스변수를 구별할 때 사용합니다.
			d. 클래스 메서드 내에서는 사용할 수 없다. // 클래스 메서드 내에서는 사용할 수 없습니다. 
			
			답 : b
			
			[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
			a. 메서드의 이름이 같아야 한다. 
			b. 매개변수의 개수나 타입이 달라야 한다.
			c. 리턴타입이 달라야 한다.
			d. 매개변수의 이름이 달라야 한다.
			
			답 : c, d
			
			//오버로딩이 성립하기 위해서는 
			 1. 메서드의 이름이 같아야 하고, 2. 매개변수의 개수나 타입이 달라야 합니다.
			 //오버로딩에는 리턴타입과, 매개변수의 이름은 상관이 없습니다.
			 
			
			[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
				long add(int a, int b) { return a+b;} //add라는 이름의, long 타입을 리턴 타입으로 가지고
													//int a 와 int b를 파라미터로 가지고, a+b를 long 타입으로 리턴하는 메서드 add
				
				a. long add(int x, int y) { return x+y;}  //메서드 매개변수의 이름만 다를 뿐, 타입이 동일- > 오버로딩 x
				b. long add(long a, long b) { return a+b;} //메서드 매개변수의 타입이 다름. -> 오버로딩o
				c. int add(byte a, byte b) { return a+b;} //메서드 매개변수의 타입이 다름. -> 오버로딩o
				d. int add(long a, int b) { return (int)(a+b);} //메서드 매개변수의 타입이 다름. -> 오버로딩 o
			답 : b, c, d
			
			
			
			[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
				a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
				b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
				c.초기화 블럭보다 생성자가 먼저 수행된다.
				d.명시적 초기화를 제일 우선적으로 고려해야 한다.
				e.클래스변수보다 인스턴스변수가 먼저 초기화된다.
				
			답 : c, e
				
			
			[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
				a. 기본값-명시적초기화-초기화블럭-생성자
				b. 기본값-명시적초기화-생성자-초기화블럭
				c. 기본값-초기화블럭-명시적초기화-생성자
				d. 기본값-초기화블럭-생성자-명시적초기화
			
			답: a
			
			[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
				a. 자동 초기화되므로 별도의 초기화가 필요없다.
				b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
				c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
				d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
				e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
				
			답 : a, e
				
			[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
				println
				method1
				method2
				main
				a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
				b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
				c. method2메서드를 호출한 것은 main메서드이다.
				d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
				e. main-method2-method1-println의 순서로 호출되었다.
				f. 현재 실행중인 메서드는 println 뿐이다.
			//답: b
			
			[6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
				이유를 설명하시오.
				class MemberCall {
				int iv = 10;
				static int cv = 20;
				int iv2 = cv;
				static int cv2 = iv; // 라인 A
				static void staticMethod1() {
				System.out.println(cv);
				System.out.println(iv); // 라인 B
				}
				void instanceMethod1() {
				System.out.println(cv);
				System.out.println(iv); // 라인 C
				}
				static void staticMethod2() {
				staticMethod1();
				instanceMethod1(); // 라인 D
				}
				void instanceMethod2() {
				staticMethod1(); // 라인 E
				instanceMethod1();
				}
				}
			//답 : 라인 A, 라인 B, 라인 D
			
			
			[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
			[연습문제]/ch6/Exercise6_19.java
			class Exercise6_19
			{
			
			public static void change(String str) {
			str += "456";
			}
			
			public static void main(String[] args) {
			String str = "ABC123";
			System.out.println(str);
			change(str);
			System.out.println("After change:"+str);
			}
			
			}
			
			//답 : 
			 ABC123
			 After changer :ABC123
			-->스트링은 값을 변경했을 경우에 새로운 객체를 생성한다.
			
			
			[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
			[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
			메서드명 : shuffle
			기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
			처리한 배열을 반환한다.
			반환타입 : int[]
			매개변수 : int[] arr - 정수값이 담긴 배열
			[연습문제]/ch6/Exercise6_20.java
			class Exercise6_20
			{
			
			 int[] shuffle(int[] arr){
			 for(int i = 0; i < arr.length; i++){
			 	int num = (int)(Math.random()* 9) + 1;
			 	int temp;
			 	temp = arr[0];
			 	arr[0] = num;
			 	num = temp; 
			 }
		//답:
		 int[] shuffle(int[] arr){
		 for(int i = 0; i < arr.length; i++){
		 	int num = (int)(Math.random()* 9) + 1;
		 	int temp;
		 	temp = arr[0];
		 	arr[0] = arr[num - 1];
		 	arr[num -1] = temp; 
		 }
		 return arr;
	 }
			
			[6-21] Tv클래스를 주어진 로직대로 완성하시오. 
				완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
				[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
				[실행결과]
				[1, 2, 3, 4, 5, 6, 7, 8, 9]
				[4, 6, 8, 3, 2, 9, 7, 1, 5]
				
				[연습문제]/ch6/Exercise6_21.java
				class MyTv {
				
				boolean isPowerOn;
				int channel;
				int volume;
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
				void turnOnOff() {
				
				(1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
				
					isPowerOn = !isPowerOn;
				
				}
				void volumeUp() {
				// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
				 	if(volume < MAX_VOLUME){
				 		volume++;
				 	}
				 
				}
				void volumeDown() {
				// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
					if(volume > MIN_VOLUME){
						volume--;
					}
				 
				}
				void channelUp() {
				// (4) channel의 값을 1증가시킨다.
				// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
				  
				  	if(channel == MAX_CHANNEL){
				  		channel == MIN_CHANNEL;
				  	}else{
				  		channel++; 
				  	}
				 
				}
				void channelDown() {
				// (5) channel의 값을 1감소시킨다.
				// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
				
				  	if(channel == MIN_CHANNEL){
				  		channel == MAX_CHANNEL;
				  	}else{
				  		channel--; 
				  	}
				}
				} // class MyTv
				class Exercise6_21 {
				public static void main(String args[]) {
				MyTv t = new MyTv();
				t.channel = 100;
				t.volume = 0;
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				t.channelDown();
				t.volumeDown();
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				t.volume = 100;
				t.channelUp();
				t.volumeUp();
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				}
				}		
			 	
			 }
			
			[실행결과]
			[1, 2, 3, 4, 5, 6, 7, 8, 9]
			[4, 6, 8, 3, 2, 9, 7, 1, 5]

			[6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
			메서드명 : isNumber
			기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
			모두 숫자로만 이루어져 있으면 true를 반환하고,
			그렇지 않으면 false를 반환한다.
			만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
			반환타입 : boolean
			매개변수 : String str - 검사할 문자열
			[Hint] String클래스의 charAt(int i)메서드를 사용하면 
			문자열의 i번째 위치한 문자를 얻을 수 있다.
			[연습문제]/ch6/Exercise6_22.java
			class Exercise6_22 {
			
				boolean isNumber(String str){
					if(str == null || str.equals("")){
						return false;
					}
					for(int i = 0; i < str.length(); i++){
						char ch = str.charAt(i);
						if (ch < '0' && ch > '9' ){
							return false; 
						}
				}
				return true;
				
				}
			
			(1) isNumber메서드를 작성하시오.
			
			public static void main(String[] args) {
			String str = "123";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
			str = "1234o";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
			}
			}
			[실행결과]
			123는 숫자입니까? true
			1234o는 숫자입니까? false
			
			
			[6-23] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
				메서드명 : max
				기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
				만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
				반환타입 : int
				매개변수 : int[] arr - 최대값을 구할 배열
				[실행결과]
				123는 숫자입니까? true
				1234o는 숫자입니까? false
				
				[연습문제]/ch6/Exercise6_23.java
				class Exercise6_23{
				
				
				public static int max (int[] arr){
					max = arr[0];
					for(int i = 0; i < arr.length(); i++){
						if( max < arr[i]) {
							max = arr[i];
						}
					}
					
					return max;
				}
				{
				
				
				int[] data = {3,2,9,4,7};
				System.out.println(java.util.Arrays.toString(data));
				System.out.println("최대값:"+max(data));
				System.out.println("최대값:"+max(null));
				System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
				}
				}
				[실행결과]
				[3, 2, 9, 4, 7]
				최대값:9
				최대값:-999999
				최대값:-999999
				
				
				
				[6-24] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
				메서드명 : abs
				기 능 : 주어진 값의 절대값을 반환한다.
				반환타입 : int
				매개변수 : int value
				[연습문제]/ch6/Exercise6_24.java
				class Exercise6_24
				{
				
				public static int abs(int value){
					return value >= 0 ? value : -value;
					
				}
				
				public static void main(String[] args)
				{
					int value = 5;
					System.out.println(value+"의 절대값:"+abs(value));
					value = -10;
					System.out.println(value+"의 절대값:"+abs(value));
				}
				}
				public static void main(String[] args)
				{
					int[] data = {3,2,9,4,7};
					System.out.println(java.util.Arrays.toString(data));
					System.out.println("최대값:"+max(data));
					System.out.println("최대값:"+max(null));
					System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
				}
				}
				[실행결과]
				[3, 2, 9, 4, 7]
				최대값:9
				최대값:-999999
				최대값:-999999
				[실행결과]
				5의 절대값:5
				-10의 절대값:10
								
								
								
								
				
	 * 
	 * 
	 * */
	
	
}
