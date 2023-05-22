import java.util.Scanner;

public class Class0522_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//---객체선언하고 for문 돌려보기------------------------------------------------------		
		//배열선언하기	
			Data[] d = new Data[2];
			int n1 = 0; int n2 = 0;
			
			
		//for문돌리기
			for(int i=0;i<2;i++) {
				
				
			//데이터 입력받기
				System.out.println("1번째 숫자를 입력하세요");
				n1 = scan.nextInt();
				System.out.println("2번째 숫자를 입력하세요");
				n2 = scan.nextInt();

			//객체선언하기
//				d[i] = new Data(); //기본생성자
				d[i] = new Data(n1,n2);       //이런식으로 ()안에 넣은 데이터를 Data 안에 넣어서 data1,2,3,4 의 결과값을 한방에 넣는것
			
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
