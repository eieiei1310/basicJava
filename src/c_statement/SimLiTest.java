package c_statement;
import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//나의 연애 유형은?
		String answer;
		String yes = "Y";
				
		System.out.println("나는 금사빠다");
		answer = s.nextLine();
		if(answer.equals(yes)){
			System.out.println("연애할 때 끌려다니는 타입이다.");
			answer = s.nextLine();
			if(answer.equals(yes)){
				System.out.println("감정 표현에 솔직한 편이다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					System.out.println("이성친구는 존재할 수 없다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("당신은 D타입 입니다.");
						}else {
							System.out.println("당신은 C타입 입니다.");
						}
					}else{
						System.out.println("당신은 B타입 입니다.");
					}
				}else{
					System.out.println("활동적인 데이트가 좋다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("이성친구는 존재할 수 없다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = s.nextLine();
							if(answer.equals(yes)){
								System.out.println("당신은 D타입 입니다.");
							}else{
								System.out.println("당신은 C타입 입니다.");
							}
						}else{
							System.out.println("당신은 B타입 입니다.");
						}
					}else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("당신은 D타입 입니다.");
						}else{
							System.out.println("당신은 C타입 입니다.");
						}
					}
				}
			}else{
				System.out.println("데이트 코스는 미리 짜는 게 편하다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					System.out.println("활동적인 데이트가 좋다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("이성친구는 존재할 수 없다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = s.nextLine();
							if(answer.equals(yes)){
								System.out.println("당신은 D타입입니다.");
							}else{
								System.out.println("당신은 C타입입니다.");
							}
						}else{
							System.out.println("당신은 B타입입니다.");
						}
					}else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("당신은 D타입입니다.");
						}else{
							System.out.println("당신은 C타입입니다.");
						}
					}
					
				}else{
					System.out.println("감정 표현에 솔직한 편이다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("이성친구는 존재할 수 없다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = s.nextLine();
							if(answer.equals(yes)){
								System.out.println("당신은 D타입입니다.");
							}else{
								System.out.println("당신은 C타입입니다.");
							}
					}else{
						System.out.println("당신은 B타입 입니다.");
					}
				}
			 }
			}
		}else{
			System.out.println("감정기복이 크지 않다.");
			answer = s.nextLine();
			if(answer.equals(yes)){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					System.out.println("당신은 A타입 입니다..");
				
			}else{
				System.out.println("이성친구는 존재할 수 없다.");
			}answer = s.nextLine();
			if(answer.equals(yes)){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					System.out.println("당신은 D타입 입니다.");
				}else{
					System.out.println("당신은 c타입 입니다.");
				}
			}else{
				System.out.println("당신은 B타입 입니다.");
			}
			
		}else{
			System.out.println("감정표현에 솔직한 편이다.");
			answer = s.nextLine();
			if(answer.equals(yes)){
				System.out.println("이성친구는 존재할 수 없다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					answer = s.nextLine();
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					if(answer.equals(yes)){
						System.out.println("당신은 D타입 입니다.");
					}else{
						System.out.println("당신은 C타입 입니다.");
					}
				}else{
					System.out.println("당신은 B타입 입니다.");
				}
			}else{
				System.out.println("활동적인 데이트가 좋다.");
				answer = s.nextLine();
				if(answer.equals(yes)){
					System.out.println("이성친구는 존재할 수 없다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = s.nextLine();
						if(answer.equals(yes)){
							System.out.println("당신은 D타입 입니다.");
						}else{
							System.out.println("당신은 C타입 입니다.");
						}
					}
				}else{
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					answer = s.nextLine();
					if(answer.equals(yes)){
						System.out.println("당신은 D타입 입니다.");
					}else{
						System.out.println("당신은 C타입 입니다.");
					}
				}
			}
			
		}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
