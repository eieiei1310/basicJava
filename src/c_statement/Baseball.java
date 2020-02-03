package c_statement;
import java.util.Scanner; 

public class Baseball {

	public static void main(String[] args) {
		
		/////////////////첫번째 문제풀이////////////////////////////////////////////////////////////
	/*	Scanner s = new Scanner(System.in);
		//컴퓨터의 랜덤 숫자 3가지
		int com1 = (int)(Math.random()*9 + 1);
		int com2 = (int)(Math.random()*9 + 1);
		while(com1 == com2){
			com2 = (int)(Math.random()*9 + 1);
		}
		int com3 = (int)(Math.random()*9 + 1);
		while(com3 == com1 || com3 == com2){
			com3 = (int)(Math.random()*9 + 1);
		}
		System.out.println("정답: " + com1+ "," +com2+ "," +com3);
		
		//입력받는 숫자 3가지
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		*/
	/*	//숫자 입력 받기
		System.out.println("첫번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input1 = Integer.parseInt(s.nextLine());
		while(input1 < 0 || input1 > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			input1 = Integer.parseInt(s.nextLine());
		}
		System.out.println("두번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input2 = Integer.parseInt(s.nextLine());
		
		while(input2 == input1){
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			input2 = Integer.parseInt(s.nextLine());
		}
		while(input2 < 0 || input2 > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			input2 = Integer.parseInt(s.nextLine());
		}
		
		System.out.println("세번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input3 = Integer.parseInt(s.nextLine());
		while(input3 == input1 || input3 == input2){
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			input3 = Integer.parseInt(s.nextLine());
		}
		while(input3 < 0 || input3 > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			input3 = Integer.parseInt(s.nextLine());
		}
		
		System.out.println("입력한 숫자는 " +  input1 +","+ input2 + "," + input3 + " 입니다.");
		
		
	 //숫자 야구 판별하는 코드 쓰기
		//1. 순서와 숫자 모두 일치하면 == strike;
		//2. 숫자만 일치하면 == ball;
		//3. 순서와 숫자 모두 틀리면 == out;
		
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		//com1과 input1 비교
		if(com1 == input1){
			strike += 1;
		}else if(com1 == input2 || com1 == input3){
			ball += 1;
		}else{
			out += 1;
		}
		//com2과 input2 비교
		if(com2 == input2){
			strike += 1;
		}else if(com2 == input1 || com2 == input3){
			ball += 1;
		}else{
			out += 1;
		}
		//com3과 input3 비교
		if(com3 == input3){
			strike += 1;
		}else if(com3 == input1 || com3 == input2){
			ball += 1;
		}else{
			out += 1;
		}
		
		//3스트라이크 일 경우:
		if(strike == 3){
			System.out.println("모두 맞추셨습니다!");
		}
		
		System.out.println("당신의 입력값은 " + strike + "S"+ ","+ ball + "B"+  ","+  out + "O 입니다.");
		*/
		////////////////////////////////////////////////////////////////////////////////
		///두번째 문제풀이///
		
		
		Scanner s = new Scanner(System.in);
		//컴퓨터의 랜덤 숫자 3가지
		int com1 = (int)(Math.random()*9 + 1);
		int com2 = (int)(Math.random()*9 + 1);
		while(com1 == com2){
			com2 = (int)(Math.random()*9 + 1);
		}
		int com3 = (int)(Math.random()*9 + 1);
		while(com3 == com1 || com3 == com2){
			com3 = (int)(Math.random()*9 + 1);
		}
		System.out.println("정답: " + com1+ "," +com2+ "," +com3);
		
		//입력받는 숫자 3가지
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		
		//숫자 입력 받기
		
		
		System.out.println("첫번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input1 = Integer.parseInt(s.nextLine());
		
		while(input1 > 9 || input1 < 0 ){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input1 = Integer.parseInt(s.nextLine());
		}
		System.out.println("두번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input2 = Integer.parseInt(s.nextLine());
		
		while(input2 > 9 || input2 < 0 || input2 == input1){
			if(input2 > 9 || input2 < 0){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input2 = Integer.parseInt(s.nextLine());
			}else if(input2 == input1){
				System.out.println("중복된 숫자는 입력할 수 없습니다.");
				input2 = Integer.parseInt(s.nextLine());
			}
		}
		System.out.println("세번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input3 = Integer.parseInt(s.nextLine());
		
		while(input3 > 9 || input3 < 0 || input3 == input1 || input3 == input2 ){
			if(input3 > 9 || input3 < 0){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input3 = Integer.parseInt(s.nextLine());
			}else if(input3 == input1 || input3 == input2){
				System.out.println("중복된 숫자는 입력할 수 없습니다.");
				input3 = Integer.parseInt(s.nextLine());
			}
		}
		
		System.out.println("입력한 숫자는 " +  input1 +","+ input2 + "," + input3 + " 입니다.");
		
		//숫자 야구 판별하는 코드 쓰기
				//1. 순서와 숫자 모두 일치하면 == strike;
				//2. 숫자만 일치하면 == ball;
				//3. 순서와 숫자 모두 틀리면 == out;
				
				
				int strike = 0;
				int ball = 0;
				int out = 0;
				
				//com1과 input1 비교
				if(com1 == input1){
					strike += 1;
				}else if(com1 == input2 || com1 == input3){
					ball += 1;
				}else{
					out += 1;
				}
				//com2과 input2 비교
				if(com2 == input2){
					strike += 1;
				}else if(com2 == input1 || com2 == input3){
					ball += 1;
				}else{
					
					
					out += 1;
				}
				//com3과 input3 비교
				if(com3 == input3){
					strike += 1;
				}else if(com3 == input1 || com3 == input2){
					ball += 1;
				}else{
					out += 1;
				}
				
				//3스트라이크 일 경우:
				if(strike == 3){
					System.out.println("모두 맞추셨습니다!");
				}
				
				System.out.println("당신의 입력값은 " + strike + ":S"+ ","+ ball + ":B"+  ","+  out + ":O 입니다.");
		
		/////////////////////세번째 문제풀이///////////////////////////////으으 일단 포기 다음에 한다. 
		
		/*Scanner s = new Scanner(System.in);
		
		
		//컴퓨터의 랜덤 숫자 3가지 
		
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		while(com1 == com2 || com2 == com3 || com1 == com3){
			com1 = (int)(Math.random()*9 + 1);
			com2 = (int)(Math.random()*9 + 1);
			com3 = (int)(Math.random()*9 + 1);
		}
		System.out.println("정답: " + com1+ "," +com2+ "," +com3);
		
		
		
		
		int input = 0;
		
		//숫자 입력 받기
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		
		
		
	////숫자 입력 받기 + 범위 /중복 검사
		while(true){
			
			int sum = 0;
			System.out.println("3자리의 숫자를 입력해주세요.");
			input = Integer.parseInt(s.nextLine());
			//숫자 나눠서 배치하기
			input3 = sum + input % 10; 
			input = input / 10;
			input2 = sum + input % 10;
			input = input / 10;
			input1 = sum + input %10;
			System.out.println(input1 +","+input2+"," +input3);
			
			
			//숫자 범위 검사 하기
			while(input > 987 || input < 0){
				System.out.println(" 3자리의 양수를 입력해주세요. ");
				input = Integer.parseInt(s.nextLine());
			}
			//숫자 중복 검사 하기
			while(input1 == input2 || input2 == input3 || input1 == input3){
				System.out.println("중복되지 않은 3자리의 숫자를 입력해주세요.");
				input = Integer.parseInt(s.nextLine());
				
			}
			
			
		}
			
	
	
	
		
		System.out.println("첫번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input1 = Integer.parseInt(s.nextLine());
		
		while(input1 > 9 || input1 < 0 ){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input1 = Integer.parseInt(s.nextLine());
		}
		System.out.println("두번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input2 = Integer.parseInt(s.nextLine());
		
		while(input2 > 9 || input2 < 0 || input2 == input1){
			if(input2 > 9 || input2 < 0){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input2 = Integer.parseInt(s.nextLine());
			}else if(input2 == input1){
				System.out.println("중복된 숫자는 입력할 수 없습니다.");
				input2 = Integer.parseInt(s.nextLine());
			}
		}
		System.out.println("세번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		input3 = Integer.parseInt(s.nextLine());
		
		while(input3 > 9 || input3 < 0 || input3 == input1 || input3 == input2 ){
			if(input3 > 9 || input3 < 0){
				System.out.println("범위에 맞는 수를 입력해주세요.");
				input3 = Integer.parseInt(s.nextLine());
			}else if(input3 == input1 || input3 == input2){
				System.out.println("중복된 숫자는 입력할 수 없습니다.");
				input3 = Integer.parseInt(s.nextLine());
			}
		}
		
		
		
		//숫자 야구 판별하는 코드 쓰기
				//1. 순서와 숫자 모두 일치하면 == strike;
				//2. 숫자만 일치하면 == ball;
				//3. 순서와 숫자 모두 틀리면 == out;
				
				
				int strike = 0;
				int ball = 0;
				int out = 0;
				
				//com1과 input1 비교
				if(com1 == input1){
					strike += 1;
				}else if(com1 == input2 || com1 == input3){
					ball += 1;
				}else{
					out += 1;
				}
				//com2과 input2 비교
				if(com2 == input2){
					strike += 1;
				}else if(com2 == input1 || com2 == input3){
					ball += 1;
				}else{
					
					
					out += 1;
				}
				//com3과 input3 비교
				if(com3 == input3){
					strike += 1;
				}else if(com3 == input1 || com3 == input2){
					ball += 1;
				}else{
					out += 1;
				}
				
				//3스트라이크 일 경우:
				if(strike == 3){
					System.out.println("모두 맞추셨습니다!");
				}
				
				System.out.println("당신의 입력값은 " + strike + ":S"+ ","+ ball + ":B"+  ","+  out + ":O 입니다.");
				*/
				
	}//건들지말것
}
