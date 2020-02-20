package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	
	void method(){
		
		
	}
	
	//추상 메소드 : 선언부만 존재하고 구현부는 없는 메소드
	abstract void abstractMethod();
	
	
}//건들지 말것


class SampleAbstractChild extends SampleAbstractParent {

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	} 
}