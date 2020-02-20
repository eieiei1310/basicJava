package f_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "proteced : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	
}
//파일 안에서 public이 붙은 클래스는 클래스파일 이름과 동일한 하나여야 한다. 