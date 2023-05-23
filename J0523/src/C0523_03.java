import java.util.Scanner;

public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Card c = new Card("Space",1);
		
		Card c2 = null;
		Deck d1 = new Deck();
		
//		c1 = d1; //타입이 다르기에 넣을 수 없음
		c2 = c;  //같은타입이면 넣을 수 있음
		
		Object o = null;         //범용적으로 쓰고싶을때 object를 만든다.
		o = d1;  //조상과 자손이라는 관계가 맺어져서 가능함
		
		
		int a = 5;
		String str = null;
//		str = a;  //타입이 다르기에 넣을 수 없음
		
		System.out.println(c);
	}
	
	static void add() {}
	
	static void add(int x) {}
	
	
	
	
	
	
}
