
public class Class0522_11 {

	public static void main(String[] args) {
		//원만들기 : 점, 반지름 필요
		//Circle 객체선언하기
		Circle c1 = new Circle();
		Point center = new Point(150,150);
		Circle c2 = new Circle(center,50);
		// = Circle c2 = new Circle(new Point(150,150),50);
		//c2 => x=150, y=150, r=50
		
		int[] x = {1,2,3};
		int y = 10;
		
		Point[] p = {new Point(100,100),new Point(140,50),new Point(50,100)};
		
		
		Triangle t1 = new Triangle(new Point(100,100),new Point(140,50),new Point(50,100));
		
//		Triangle t2 = new Triangle(Point[] p);
		Triangle t2 = new Triangle(p);  //p : 이미 위에서 정의했으니까 Point[]는 필요없음
		Triangle t3 = new Triangle(p[0],p[1],p[2]);
		
		

	}

}
