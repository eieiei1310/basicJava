package e_oop;

public class AirConditioner {

	
	/*boolean power; //전원
	
	int temperture; //온도

	int airVolume; //풍량
	
	
	AirConditioner(){
		power = false;
		temperture = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
		
	}
	
	//온도+ 버튼
	void temperatureUp(){
		temperture++;
	}
	
	//온도- 버튼
	void temperatureDown(){
		temperture--;
	}
	
	//풍량 버튼
	void airVolume(){
		if(3 < ++airVolume){
			airVolume = 1;
		}
	}*/
	
	//온도가 18~30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을 때만 버튼들이 작동되도록 메소드들을 변경해주세요.
	
	boolean power; //전원
	int temperture; //온도
	int airVolume; //풍량
	
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 18;
	
	
	AirConditioner(){
		power = false;
		temperture = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}
	
	//온도+ 버튼
	void temperatureUp(){
		if(power && temperture < MAX_TEMPERATURE){
			temperture++;
			System.out.println("온도가 1도 올라갑니다.");
			System.out.println("현재 온도는 " + temperture + "도 입니다.");
		}
	}
	
	//온도- 버튼
	void temperatureDown(){
		if(power && temperture > MIN_TEMPERATURE){
			temperture--;
			System.out.println("온도가 1도 내려갑니다.");
			System.out.println("현재 온도는 " + temperture + "도 입니다.");
		}
	}
	
	//풍량 버튼
	void airVolume(){
		/*if(power){
			++airVolume;
			System.out.println("바람 세기가 " + airVolume +"단계로 조정되었습니다.");
			if(3 <= airVolume){
				airVolume = 1;
				System.out.println("바람 세기가 " + airVolume +"단계로 조정되었습니다.");
			}
		}*/
		
		if(power){
			if(3 < ++airVolume){
				airVolume = 1;
			}
			System.out.println("바람 세기가 " + airVolume +"단계로 조정되었습니다.");
		}
		
	}
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		ac.power();
		ac.temperatureUp();
		ac.temperatureDown();
		ac.airVolume();
		ac.airVolume();
		ac.airVolume();
		ac.airVolume();
		
	}
	//상수를 사용하면 좋습니다.(고정된 값)
	
	
}
