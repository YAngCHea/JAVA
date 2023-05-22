//변수의 초기화 : 변수를 선언하고 처음으로 값을 저장하는 것

public class Class0522_07 {

	//인스턴스변수 : 초기화(=0)안해도 자동으로 초기화가 되기때문에 에러가 안난다
	int x;
	int y = x;
	char ch = ' ';
	String str;
	
	public static void main(String[] args) {
		
		//Class0522_07(){}  //기본생성자 자동 생성
		
		//객체선언
		Class0522_07 c = new Class0522_07();
		
	//지역변수는 초기화를 해야 에러가 안난다
		int a=0;      
		int b=a;
		
		//a,b,x,y를 출력하세요
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.x);
		System.out.println(c.y);
		
		
	    System.out.println("ch =" + c.ch + ".");    //공백이라 안나오는것
		System.out.println("str = " + c.str);       //null
		System.out.println("str = " + (c.str+1));       //null
		
		
		

	}

}
