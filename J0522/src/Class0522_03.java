import java.util.Scanner;

public class Class0522_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
////---객체선언해서 변수 사용하기-------------------------------------------------		
//		// 두개의 숫자를 입력받아서 + - * / 를 한다
//		//생성자를 활용
//
//	//객체선언하기
//		Data d = new Data();
//	//데이터 입력받기
//		System.out.println("1번째 숫자를 입력하세요");
//		d.num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요");
//		d.num2 = scan.nextInt();
//	//결과출력하기
//		d.data1 = d.num1 + d.num2;
//		d.data2 = d.num1 - d.num2;
//		d.data3 = d.num1 * d.num2;
//		d.data4 = d.num1 / d.num2;
//		System.out.println(d.data1);
//		System.out.println(d.data2);
//		System.out.println(d.data3);
//		System.out.println(d.data4);
		
		
//---객체선언하고 for문 돌려보기------------------------------------------------------		
	//배열선언하기	
		Data[] d = new Data[2];
		
	//for문돌리기
		for(int i=0;i<2;i++) {
			
		//객체선언하기
			d[i] = new Data();
			
		//데이터 입력받기
			System.out.println("1번째 숫자를 입력하세요");
			d[i].num1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요");
			d[i].num2 = scan.nextInt();
		//결과출력하기
			d[i].data1 = d[i].num1 + d[i].num2;
			d[i].data2 = d[i].num1 - d[i].num2;
			d[i].data3 = d[i].num1 * d[i].num2;
			d[i].data4 = d[i].num1 / d[i].num2;
			System.out.println(d[i].data1);
			System.out.println(d[i].data2);
			System.out.println(d[i].data3);
			System.out.println(d[i].data4);
		}
		
	}

}
