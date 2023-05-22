import java.util.Scanner;

public class Class0522_05 {

	public static void main(String[] args) {
		
		Data d1 = new Data();    //변수 6개 : num1(-1), num2(-1), data1(-1), data2(-1), data3(-1), data4(-1)
		Data d2 = new Data();    //변수 6개 : num1(-2), num2(-2), data1(-2), data2(-2), data3(-2), data4(-2)
		                         // =>약간 이런느낌 : num3, num4, data4, data5, data6, data7
		                         // 위에 있는 변수들은 각각 다 다르다 : 배열 d1과 d2가 다르기 때문.
		Data d3 = new Data();    //새로운 변수가 또 생긴것 : num1(-3), num2(-3), data1(-3), data2(-3), data3(-3), data4(-3)  : 이런느낌
		                         //얘는 기본생성자
		
		Data d4 = new Data(1,2);   //()안에 값을 넣으면
		                           //얘는 매개변수가 있는 생성자
		System.out.println(d4.data2);   //이런식으로 들어간다
		
		Data[] d = new Data[5];
		d[0] = d1;    // = new Data();  똑같은것
		d[1] = d2;
		d[2] = d3;
		d[3] = d4;
		
		System.out.println(d[3]);    //이렇게하면 주소만 나온다
		System.out.println(d[3].data2);    //이러면 값이 나온다
		
//---활용하기--------------------------------------------------------------------
		Scanner scan = new Scanner(System.in);
		int n1 = 0; int n2 = 0;

	//for문돌리기
		for(int i=0;i<2;i++) {
			
		//데이터 입력받기
			System.out.println("1번째 숫자를 입력하세요");
			n1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요");
			n2 = scan.nextInt();

		//객체선언하기
			d[i] = new Data(n1,n2);       //이런식으로 ()안에 넣은 데이터를 Data 안에 넣어서 data1,2,3,4 의 결과값을 한방에 넣는것
			                              //변수 6개 : num1(-1), num2(-1), data1(-1), data2(-1), data3(-1), data4(-1) : 이거맨날 선언하기 싫어서 쓰는거임..
		
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
