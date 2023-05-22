
public class Point {

	int x;//인스턴스변수 - 객체선언후 참조변수명.변수명
	int y;//인스턴스변수 - 객체선언후 참조변수명.변수명
	
	 Point(){//기본생성자 - 클래스명과 일치, void없음
		 this(0,0);
	 }
	 
	 Point(int x, int y){ //생성자 - 클래스명과 일치, void없음
		 this.x = x;   //this : 인스턴스변수  x : 지역변수(메소드안에서 선언)
		 this.y = y;   //this : 인스턴스변수  y : 지역변수(메소드 벗어나면 없어짐)
	 }
	 
	 
	 
	 
}
