package d_array;

import java.util.Scanner;
import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
	/*	String s = new String("ABCD"); //참조형 타입을 초기화하는 방법
		String str = "ABCD"; //String 은 특별히 간단하게 초기화 가능;
*/		
		/*char[] charArray = str.toCharArray();//String 클래스 내부에 문자배열을 가지고 있다.
		System.out.println(charArray);
		
		
		 * <<String 의 주요 메소드>>
		 * 
		 * -equals() : 문자열의 내용이 같은지 확인한다.
		 * -length() : 문자열의 길이를 반환한다.
		 * -chatAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		 * -substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * -indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * -replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 * 
		 * 
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}
		
		String revStr = ""; //str을 거꾸로 담을 변수
		//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		
		for(int i = str.length() - 1; i >= 0; i--){
			revStr += str.charAt(i);
			// 동일문장: revStr = revStr + str.charAt(i);
		
		}
		
		System.out.println(revStr);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5,8);//5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다.
		System.out.println(sub2);
		
		str = "치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다.
		System.out.println(idx);
		
		
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 500원"
				
		};*/
		
		/*for(int i = 0; i < menus.length; i++){
			String name = menus[i].substring(0, menus[i].indexOf(" "));
			System.out.println(name);
			}*/
	/*	System.out.println(menus.length);
		  for(int i = 0; i < menus.length; i++){
			  //String price = menus[i].substring(menus[i].indexOf(" "),menus[i].indexOf("원") );
			  
			   int price = Integer.parseInt(
					   	   menus[i].substring(menus[i].indexOf(" ") + 1 , menus[i].indexOf("원")));
			   System.out.println(price + "원");
			  
			   
		  }*/
		
		/*  str = "123456789";
		  str = str.replace("3","짝");
		  System.out.println(str);
		  str = str.replace("6","짝");
		  System.out.println(str);
		  str = str.replace("9","짝");
		  System.out.println(str);
		  
		  String pn = "010-2363-3647";
		  //하이픈(-)을 제거해서 출력해주세요.
		  
		  String pnFinal;
			  //if(pn[i] != "-"){
			  //pnFinal += pn[i];
			  //}
			  pnFinal = pn.replace("-","");
			  System.out.println(pnFinal);*/
			
		Scanner s = new Scanner(System.in);
		//숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
	/*	System.out.println("숫자를 입력해주세요.");
		String user = s.nextLine();*/
		
		
	/*	String temp = user.substring(0,1);
		
		temp += ",";
		temp = temp + user.substring(1,4);
		temp += ",";
		temp = temp + user.substring(7,10);
		temp += ",";
		*/
		
	/*	String str = "ABCD"; //String 은 특별히 간단하게 초기화 가능;
		//새로운 변수를 만들어 뒤에서부터 3자리씩 콤마를 찍는다.
		//원래 수에서 뒤에서부터 가져옴. 
		
		
		String revStr = ""; //str을 거꾸로 담을 변수
		//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		
		for(int i = str.length() - 1; i >= 0; i--){
			revStr += str.charAt(i);
			// 동일문장: revStr = revStr + str.charAt(i);
		
		}
		System.out.println(revStr);*/
		
		
		//새로운 변수를 만들어 뒤에서부터 3자리씩 콤마를 찍는다.
		//원래 수에서 뒤에서부터 가져옴. 
		
		//765,432,1 -> 뒤집기.
		
		// 1. 새로운 변수를 만들어 뒤에서부터 3자리씩 추가한뒤,
		// 2. 3자리마다 콤마를 찍는다.
		// 3. 뒤집어진 변수를 다시 처음처럼 뒤집는다.
		
		//내 식
		/*System.out.println("숫자를 입력해주세요.");
		String user = s.nextLine();
		
		//입력된 숫자를 거꾸로 돌리는 첫번째 for문
		String temp = "";
		for(int i = user.length() - 1; i >= 0; i--){
			temp += user.charAt(i);
			//1234 입력시 4321 저장됨
		}
		//거꾸로 돌린 숫자를 다시 되돌리면서 숫자를 찍는 두번째 for문
		String temp2 = ""; 
		for(int i = temp.length() - 1; i >= 0; i--){
			temp2 += temp.charAt(i);
			//4321 저장된것을 1234로 옮김
			//인덱스는 3210으로 바뀜
			
			if( i % 3 == 0 && i != 0){
				temp2 += ",";
				}
			
			
		}
		
		System.out.println(temp2)*/;
		
		
		
		///선생님 식
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요2");
		String number = sc.nextLine();
		String newNumbers = "";
		int count = 0;
		
		for (int i = number.length() - 1 ; i >= 0; i--){
			newNumbers = number.charAt(i) +newNumbers;
			//System.out.println(newNumbers);
			count++;
			if(count%3 == 0 && count != number.length()){
				newNumbers = "," + newNumbers;
			}
			
			
		}
		
		System.out.println(newNumbers);
		
		
		
		
	}//건들지말것
}
