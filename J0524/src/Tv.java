
public class Tv {

	boolean power;
	int channel;      //default 0
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	
	
}
