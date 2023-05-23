
public class Deck {

	// 52종류 카드생성
	Card[] c = new Card[52];

	// Space, Heart, Diamond, Clover

	Deck() {
		for(int i = 0;i<52;i++){
			c[i] = new Card(); // 객체선언
			c[i].kind = c[i].shape[i / 13];
			c[i].number = (i % 13) + 1;
		}//for
	}// deck

	//카드뽑기   c[0] c[1] c[2] ....... c[51]
	Card pick(int index) {  //0-51
		return c[index];
		}
	
	//카드랜덤셔플 0-51
	void shuffle() {
		for(int i=0;i<1000;i++) {
		int random = (int)(Math.random()*51);
		Card temp = null;
		
		temp = c[0];
		c[0] = c[random];
		c[random] = temp;
		}//for
		
	}//shuffle
	
}


