package daseul;
import java.util.Arrays;
import java.util.Scanner;
public class arrBaseball {

	public static void main(String[] args) {
		//숫자 야구 게임 배열로 만들기
		/*
		 *1. 컴퓨터 랜덤 숫자 3개
		 *2. 사용자 입력 숫자 3개
		 *3. 숫자 스트라이크/볼/아웃 비교하기
		 *4. 결과 출력 및 끝 
		 * 
		 * */
		int[] computer = new int[3];
		int[] user = new int[3];
		//스트라이크, 볼, 아웃
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		//컴퓨터의 중복되지 않는 세 숫자 구하기
		
		for(int i = 0; i < computer.length; i++){
			computer[i] = (int)(Math.random() * 9)+ 1;
		}
		while(true){
		for(int i = 0; i < computer.length; i++){
			for(int j = 0; j <computer.length; j++){
				if(j != i && computer[i] == computer[j]){
					computer[i] = (int)(Math.random() * 9)+1;
					}
				}
			
			}
			break;
		}
		
		System.out.println(Arrays.toString(computer));
		
		//사용자 입력 세 숫자 구하기
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			count++;
			for(int i = 0; i < user.length; i++){
				System.out.println("1에서 9까지의 숫자를 입력해주세요 (입력>)");
				user[i] = Integer.parseInt(s.nextLine());
				
				while(user[i] < 0 || user[i] > 9){
					System.out.println("범위에 맞는 수를 입력해주세요.");
					user[i] = Integer.parseInt(s.nextLine());
				}
				
				for(int j = 0; j < user.length; j++){
					if(i == j && computer[i] == user[i]){
						strike++;
					}else if(i != j && computer[i] == user[j]){
						ball++;
					}
				}
			}
			break;
		}
		System.out.println(Arrays.toString(user));
		System.out.println("S :" + strike + ", B :" + ball + ", O : " + (user.length - (strike + ball)));
		
		
		
		
	}//건들지 말 것 
}
