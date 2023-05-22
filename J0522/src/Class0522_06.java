
public class Class0522_06 {

	public static void main(String[] args) {
		//Car - 기본 생성자 사용 : color, gearType, door 출력하기
		
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);

		//매개변수가 있는 생성자 사용 : read auto 5 출력하세욥
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		//객체선언
		//다른 객체를 복사할때 사용 : 인스턴스변수를 복사 할 때 사용
		Car c3 = new Car(c2);
		
		
		
		
		
//		//참조변수 선언하기
//		Car c3 = null;
//		
//		//복사가능?
//		c3 = c2;
//		c3.color = "blue";
		
		
		
		
	}

}
