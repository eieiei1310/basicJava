package daseul;

public class Store2 {
	
	//연습
	/*
	 * 과일가게와 손님을 만드시오
	 * 과일가게의 상품
	 * 	- 1.바나나 (1000원)
	 * 	- 2.수박 (2000원)
	 *  - 3.복숭아 (3000원)
	 * 손님이 물건을 구매하기 전, 과일 가게의 상품의 가격과 이름을 안내하시오.
	 *  
	 * 손님
	 *  - 1. 돈이 10000원 있고 가방이 1개인 손님
	 *  - 2. 돈이 20000원 있고 가방이 2개인 손님
	 *  - 3. 돈이 35000원 있고 가방이 3개인 손님
	 *  
	 * 각 손님이 구매한 물건과 손님의 지출 비용, 잔액을 출력하시오.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		//과일
		Fruite f1 = new Banana();
		Fruite f2 = new WaterMelon();
		Fruite f3 = new Peach();
		//f1.info();
		//f2.info();
		//f3.info();
		//바구니
		Fruite[] bag1 = new Fruite[1];
		Fruite[] bag2 = new Fruite[2];
		Fruite[] bag3 = new Fruite[3];
		
		//손님
		customer c1 = new customer("철수",10000, bag1);
		customer c2 = new customer("영희",20000, bag2);
		customer c3 = new customer("다슬",35000, bag3);
		
		c1.buy(f1);
		c1.infor();
		
		c2.buy(f1);
		c2.buy(f2);
		c2.infor();
		
		c3.buy(f1);
		c3.buy(f2);
		c3.buy(f3);
		c3.infor();
		
	}
}//건드리지 말 것 

 class Fruite {
		String name;
		int price;
		
		Fruite(String name, int price){
			this.name = name;
			this.price = price;
		}
		
		void info(){
			System.out.println("------------------------------");
			System.out.println("\t과일 이름:\t" + name );
			System.out.println("\t과일 가격:\t" + price );
		}
}
	
class Banana extends Fruite {
	Banana(){
		super("바나나", 1000);
	}
}

 class WaterMelon extends Fruite {
	WaterMelon(){
		super("수박", 2000);
	}
}

class Peach extends Fruite {
	Peach(){
		super("복숭아", 3000);
	}
}	
	

class customer{
	String name;
	int money;
	Fruite[] fruiteBag;
	
	customer(String name, int money, Fruite[] fruiteBag){
		this.money = money;
		this.fruiteBag = fruiteBag;
		this.name = name;
	}
	void buy(Fruite f){
		if(f.price > money){
			System.out.println("\t" + f.name+ "는(은) 가격이 너무 비쌉니다.\t");
			System.out.println("\t구입실패\t");
		}
		money -= f.price;
		
		for(int i = 0; i < fruiteBag.length; i++){
			if(fruiteBag[i] == null){
				fruiteBag[i] = f;
				break;
			}
			
		}
		System.out.println("----" + f.name + "을(를) 구매하셨습니다.----\t");
	}
	void infor(){
		System.out.println("-------" + name +"의 쇼핑의 결과-------------");
		System.out.println("잔액 : " + money + "원");
		System.out.println("바구니에 들어있는 과일은 : ");
		for(int i = 0; i < fruiteBag.length; i++){
			if(fruiteBag[i] != null){
				System.out.println("\t" +(i + 1) + "." + fruiteBag[i].name );
			}
		}
		System.out.println("입니다.\t");
	}
	
	
	
		
	
	
}
