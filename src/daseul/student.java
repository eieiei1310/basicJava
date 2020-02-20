package daseul;

public class student {
	//멤버변수 선언 6-3
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	student(String name, int ban, int no, int kor, int eng, int math){
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
	
	double getAverage(){
		return (int)(getTotal() / 3f *10 + 0.5f) /10 ;
	}
	
	
	public String info(){ 
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


