
public class C0523_01 {

	public static void main(String[] args) {
		// Deck객체선언하기
		Deck d = new Deck();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.println(d.c[i].kind + d.c[j].number);	
			}
		}
		
		System.out.printf("%s %d \n",d.c[0].kind,d.c[0].number);
		System.out.printf("%s %d \n",d.c[51].kind,d.c[51].number);
		
//		int[] arr = {1,2,3,4,5};
//		for(int i=0;i<5;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
//	//구구단 전부
//		
//		for(int i=1; i<10;i++) {
//			System.out.println("["+(i) +"단입니다]");
//			for(int j=1; j<10;j++) {
//				System.out.println(i + "*" + j + " = " + (i*j));	
//			}
//			System.out.println();
//		}
		

	}

}
