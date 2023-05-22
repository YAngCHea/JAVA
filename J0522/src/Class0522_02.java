import java.util.Scanner;

public class Class0522_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두개의 숫자를 입력받아서 + - * / 를 한다
		//생성자를 활용
		int num[] = new int[4];
		int data[] = new int[8];		
////---1.원래는 이렇게 했었음--------------------------------------------		
//		for(int i=0;i<2;i++) {
//			System.out.println((i+1) + "번째 숫자를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		
//		data[0] = num[0] + num[1];
//		data[1] = num[0] - num[1];
//		data[2] = num[0] * num[1];
//		data[3] = num[0] / num[1];
//		String calculate[] = {"+","-","*","/"};
//		
//		for(int i=0;i<4;i++) {
//			System.out.println(num[0] + calculate[i] + num[1] + " = " + data[i]);
//		}		
//		
////---2.한번더 찍어보기-----------------------------------------------------------		
//		for(int i=2;i<4;i++) {
//			System.out.println((i+1) + "번째 숫자를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		
//		data[4] = num[2] + num[3];
//		data[5] = num[2] - num[3];
//		data[6] = num[2] * num[3];
//		data[7] = num[2] / num[3];
//		
//		for(int i=4;i<8;i++) {
//			System.out.println(num[2] + calculate[i] + num[3] + " = " + data[i]);
//		}
		
////---3.위에꺼 1,2를 합치기----------------------------------------------------------------------	
		//숫자입력받기
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println((j+1) + "번째 숫자를 입력하세요.");
				num[j+(2*i)] = scan.nextInt();
			}
			
			//계산결과 만들기
			data[4*i+0] = num[2*i+0] + num[2*i+1];
			data[4*i+1] = num[2*i+0] - num[2*i+1];
			data[4*i+2] = num[2*i+0] * num[2*i+1];
			data[4*i+3] = num[2*i+0] / num[2*i+1];
			String calculate[] = {"+","-","*","/"};
			
			//계산결과 출력하기
			for(int j=0;j<4;j++) {
				System.out.println(num[2*i+0] + calculate[j] + num[2*i+1] + " = " + data[4*i+j]);
			}
		}
//--------------------------------------------------------------------------------------------
	}

}
