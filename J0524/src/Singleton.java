
public class Singleton {
	
	private static int num;
	
	
	//같은 클래스 내에서만 s를 사용할 수 있음
	private static Singleton s = new Singleton();
	
	private Singleton() {
		num = 10;
	}
	
	//getInstance메소드 - 리턴타입 : Singleton클래스
	static Singleton getInstance() {        //static없으니까 인스턴스메소드  //있으면 클래스 메소드 : 클래스명.변수명
		if(s==null) {
			s = new Singleton();      //객체선언을 다시 해
		}
		return s;
	}

	
	//getter setter만들기
	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Singleton.num = num;
	}
	
	
	
	
}
