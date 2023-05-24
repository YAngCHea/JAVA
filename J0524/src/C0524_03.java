
public class C0524_03 {
	public static void main(String[] args) {
		Car c = new Car();
		Car cc = null;
		Ambulance a = new Ambulance();
		Ambulance aa = null;
		FireEngine f = new FireEngine();
		FireEngine ff = null;
		
		//다형성
		Car c2 = new Ambulance();
		Car c3 = new FireEngine();
		
		//-------------------------------------------
		a.siren();
		f.water();
		//c2.siren();   부모에는 siren() 주소가 없다.
		//c3.water        도 불가
		
		aa = (Ambulance)c2;
		aa.siren();
		
		
		//자손의 참조변수로 부모의 객체를 다루는 것은 안됨.
		aa = (Ambulance)c;        //형변환은 가능하지만, 공간이 없어서 에러가난다
		//aa.siren();
		
		//다른 자손의 형변환은 안된다
		//aa  = (Ambulance)c3;
	}

}
