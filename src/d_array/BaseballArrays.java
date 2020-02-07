package d_array;
import java.util.Arrays;
import java.util.Scanner;
public class BaseballArrays {

	public static void main(String[] args) {
	/*	//컴퓨터의 숫자를 담을 배열
		int[] computer = new int[3];
		//사용자의 숫자를 담을 배열
		int[] user = new int[3];
		
		//컴퓨터의 랜덤 숫자 3가지
		computer[0] = (int)(Math.random()*9 + 1);
		computer[1] = (int)(Math.random()*9 + 1);
		while(computer[0] == computer[1]){
			computer[1] = (int)(Math.random()*9 + 1);
				}
		computer[2] = (int)(Math.random()*9 + 1);
		while(computer[2] == computer[0] || computer[2] == computer[1]){
			computer[2] = (int)(Math.random()*9 + 1);
				}
		System.out.println("정답: " + computer[0]+ "," +computer[1]+ "," +computer[2]);
				
		
		Scanner s = new Scanner(System.in);
		
		//중복되지 않는 랜덤한 숫자를 입력받기
		
		System.out.println("첫번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		user[0] = Integer.parseInt(s.nextLine());
		while(user[0]  < 0 || user[0]  > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			user[0]  = Integer.parseInt(s.nextLine());
		}
		System.out.println("두번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		user[1] = Integer.parseInt(s.nextLine());
		
		while(user[1] == user[0]){
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			user[1] = Integer.parseInt(s.nextLine());
		}
		while(user[1] < 0 || user[1] > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			user[1] = Integer.parseInt(s.nextLine());
		}
		
		System.out.println("세번째 숫자를 입력해 주세요(1~9까지의 숫자)>");
		user[2] = Integer.parseInt(s.nextLine());
		while(user[2] == user[0] || user[2] == user[1]){
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			user[2] = Integer.parseInt(s.nextLine());
		}
		while(user[2] < 0 || user[2] > 9){
			System.out.println("범위에 맞는 수를 입력해주세요.");
			user[2] = Integer.parseInt(s.nextLine());
		}
		
		System.out.println("입력한 숫자는 " +  user[0] +","+ user[1] + "," + user[2] + " 입니다.");
		

	System.out.println(Arrays.toString(user));
	
	//스트라이크 판별
	
	int strike = 0;
	int ball = 0;
	int out = 0;
	
	//com1과 input1 비교
	if(computer[0] == user[0]){
		strike += 1;
	}else if(computer[0] == user[1] || computer[0] == user[2]){
		ball += 1;
	}else{
		out += 1;
	}
	//com2과 input2 비교
	if(computer[1] == user[1]){
		strike += 1;
	}else if(computer[1] == user[0] || computer[1] == user[2]){
		ball += 1;
	}else{
		
		
		out += 1;
	}
	//com3과 input3 비교
	if(computer[2] == user[2]){
		strike += 1;
	}else if(computer[2] == user[0] || computer[2] == user[1]){
		ball += 1;
	}else{
		out += 1;
	}
	
	//3스트라이크 일 경우:
	if(strike == 3){
		System.out.println("모두 맞추셨습니다!");
	}
	
	System.out.println("당신의 입력값은 " + strike + ":S"+ ","+ ball + ":B"+  ","+  out + ":O 입니다.");

		//컴퓨터 변수와 사용자 변수를 서로 비교해 볼, 스트라이크, 아웃 판별하기
		//결과를 출력하고 스트라이크가 아니면 다시 시작하게 하기.
		//3스트라이크이면 게임을 끝내고 여태까지 몇 번 시도했는가 출력하기
		 * --------------------------------------------------------내 코드 끝
		 * 
*/
	//선생님 코드
				int[] answer = new int[3];
				int[] input = new int[answer.length];
				
				boolean isDuplicated;
				do{
					isDuplicated = false;
					
					for(int i = 0; i < answer.length; i++){
						answer[i] = (int)(Math.random() * 9) + 1;
					}
					
					for(int i = 0; i < answer.length; i++){
						for(int j = 0; j < answer.length; j++){
							if(i != j && answer[i] == answer[j]){
								isDuplicated = true;
							}
						}
					}
				}while(isDuplicated);
				
				Scanner s = new Scanner(System.in);
				int count = 0;
				while(true){
					System.out.println(answer.length + "자리 숫자를 입력해주세요>");
					int temp = Integer.parseInt(s.nextLine());
					
					int index = input.length - 1;
					while(0 < temp){
						input[index--] = temp % 10;
						temp /= 10;
					}
					
					int strike = 0;
					int ball = 0;
					int out = 0;
					
					for(int i = 0; i < answer.length; i++){
						for(int j = 0; j < input.length; j++){
							if(answer[i] == input[j]){
								if(i == j){
									strike++;
								}else{
									ball++;
								}
							}
						}
					}
					out = answer.length - strike - ball;
					
					System.out.println(++count + "차 시도"
							+ Arrays.toString(input).replace(", ", "") + " : "
							+ strike + "S " + ball + "B " + out + "O");
					System.out.println("-------------------------");
					if(strike == answer.length){
						System.out.println("정답입니다!!");
						break;
					}
				}
			
		
		
}//건들지 말것
}