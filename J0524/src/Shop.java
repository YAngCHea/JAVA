
public class Shop {

	public static void main(String[] args) {
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. STv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("-----------------------------");
		System.out.println("구매하고싶은 번호를 입력하세요.");
		
		//객체선언하기
		Buyer b = new Buyer();
		STv s = new STv();
		
		//STv 하나 구매하기
		b.buy(s);
		
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		//하나더 구매하기
		b.buy(s);        //얘를 b.buy(new STv());  실무에서는 이렇게 쓴다.
		
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		//컴퓨터 구매하기
		Computer c = new Computer();
		
		b.buy(c);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		//한대 더 구매하기
		b.buy(c);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		//오디오 구매하기
        Audio a = new Audio();
		
		b.buy(a);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		
		
	}
}
