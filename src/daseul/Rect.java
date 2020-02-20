package daseul;

public class Rect {

	String name;
	int width;
	int height;
	
	Rect(){
		this("사각형", 8, 6);
	}
	
	Rect(String name, int width, int height){
		
		this.name = name;
		this.width = width;
		this.height = height;
		
		}
	
	int getArea(int width, int height){
		return width * height;
	}
	
	int getCircum(int width, int height){
		return ( width *2 ) + ( height *2 );
	}
	
	String infor(){
		return " 이름 : "+ name + 
			   " 가로 : " + width + 
			   " 세로 : " + height + 
			   " 면적 : " + getArea(width , height ) + 
			   " 둘레 : " + getCircum(width, height)
				;
		}
		
	
	
	
	    public static void main(String args[]) {
	       //Rect객체 생성 
	    	Rect s = new Rect();
	    	
	      //info메소드를 호출하여 출력 
	    	System.out.println(s.infor());
	   
	}
	
}