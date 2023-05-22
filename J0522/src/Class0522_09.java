
public class Class0522_09 {

	public static void main(String[] args) {
		//객체선언
		//serialNo = 1
		Product p1 = new Product();  
		System.out.println("p1 count : "+p1.count);
		System.out.println("p1 serialNo = " +p1.serialNo);
		
		//serialNo = 
		Product p2 = new Product();
		System.out.println("p2 count : "+p2.count);
		System.out.println("p2 serialNo = " +p2.serialNo);
		
		Product p3 = new Product();
		System.out.println("p3 count = " + p3.count);
		System.out.println("p3 serialNo = " + p3.serialNo);
		
		//다시 p1 p2 p3의 count를 봤을때 모두 = 3  
		System.out.println("p1 count : "+p1.count);
		System.out.println("p1 count : "+p2.count);
		System.out.println("p1 count : "+p3.count);
		
		
		//int count = 0;
		//serialNo = 0;
		//초기화블럭 : count = 1; serialNo = 1;
		//생성자 : 
		
	}
}
