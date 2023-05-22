
public class Class0522_08 {

		static int cv = 1;  //클래스변수 - 객체선언 없이 클래스명.변수명
		int iv = 1;  //인스턴스변수 - 객체선언 후 참조변수명.변수명
		
		static {
			cv = 2;   //클래스 초기화 블럭
		}
		{
			iv = 2;   //인스턴스 초기화 블럭
		}

	public static void main(String[] args) {
		Class0522_08 c = new Class0522_08();
		
		cv = 3;
		c.iv = 3;
	}

}
