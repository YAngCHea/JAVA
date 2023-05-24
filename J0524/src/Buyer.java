
public class Buyer {

	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
//---------------------------------------------	
//	//STv구매하기
//	void buy(STv s) {
//		money = money - s.price;    //150
//		bonusPoint = bonusPoint + s.bonusPoint;	
//	}
//	
//	//Computer구매하기
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint = bonusPoint + c.bonusPoint;
//	}
//	
//	//Audio
//	void buy(Audio a) {
//		money = money - a.price;
//		bonusPoint  = bonusPoint + a.bonusPoint;
//	}
//------------------------------------------------
//	     Product p = new STv();
//	     Product p = new Computer();
//	     Product p = new Audio();
	//이런식으로 다형성을 이용하면 Product하나로 끝낼 수 있다
	
	int count = 0;
	
	//Product
		void buy(Product p) {
			money = money - p.price;
			bonusPoint  = bonusPoint + p.bonusPoint;
			cart[count] = p;                         //10개까지만!
			count++;
		}

}
