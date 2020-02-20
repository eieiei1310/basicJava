package f_oop2;

public class SampleChild extends SampleParent{

	void childMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var); // 상속받은 변수
		int result = method(7,13);//상속받은 메소드
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		System.out.println(sc.var);
		int result = sc.method(7,13);
		System.out.println(result);
	}
	
	//오버 라이딩 : 상속받은 메소드의 내용을 재정의 하는 것.
	
	@Override //어노테이션 -> 어노테이션을 붙이면 오버라이딩한 이름을 잘못 써을 때 컴파일 에러가 발생한다.
	int method(int a, int b){
		return a * b;
	}
	
	int var;
	
	void test (double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수 
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때
				  //둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10,20));//자식 클래스 메서드
		System.out.println(super.method(10,20));//부모 클래스 메서드
		
	}
	SampleChild(){
		super();//부모클래스의 생성자 호출
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		
		
		
	}
	
	
}

