package e_oop;

public class TV {

	
	//TV와 최대한 비슷하게 TV클래스를 만들어주세요.
	
	boolean power; //전원
	int volume; //볼륨
	int channel; //채널
	
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;
	
	final int MAX_CHANNEL = 3;
	final int MIN_CHANNELE = 1;
	
	TV(){
		power = false;
		volume = MIN_VOLUME;
		channel = MIN_CHANNELE;
	}
	
	//전원 버튼
	void power(){
		power = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}
	
	//볼륨 + 버튼
	void volumeUp(){
		if(power && volume < MAX_VOLUME){
			++volume;
			System.out.println("볼륨이 1 올라갑니다.");
		}else if(volume == MAX_VOLUME){
			System.out.println(MAX_VOLUME + "이상으로는 올릴 수 없습니다.");
		}
		System.out.println("현재 음량은 " + volume + " 입니다.");
	}
	
	//볼륨 - 버튼
	void volumeDown(){
		if(power && volume > MIN_VOLUME){
			volume--;
			System.out.println("볼륨이 1 내려갑니다.");
		}else if(volume == MIN_VOLUME){
			System.out.println(MIN_VOLUME + "이상으로는 내릴 수 없습니다.");
		}
		System.out.println("현재 음량은 " + volume + " 입니다.");
	}
	
	//채널 + 버튼
	void channelPluse(){
	if(power){
		if(MAX_CHANNEL < ++channel){
			channel = MIN_CHANNELE;
		}
		System.out.println("채널이 " + channel +" 로 조정되었습니다.");
	}
	
	
}
	//채널 - 버튼
		void channelMinus(){
		if(power){
			if(MIN_CHANNELE > --channel){
				channel = MAX_CHANNEL;
			}
			System.out.println("채널이 " + channel +" 로 조정되었습니다.");
		}
		
		
	}


		//실행 메소드
		
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.power();
		for(int i = 0; i < 12; i++){
			tv.volumeUp();
		}
		for(int i = 0; i < 12; i++){
			tv.volumeDown();
		}
		
		
		
		
	}
	
	
}