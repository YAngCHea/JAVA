
public class C0524_01 {

	public static void main(String[] args) {
//		Singleton ss = new Singleton();       //Singleton을 private으로 선언해뒀기 때문에! 객체선언이 안댐!
		Singleton ss = Singleton.getInstance();
		
		System.out.println(Singleton.getNum());
	}
}


