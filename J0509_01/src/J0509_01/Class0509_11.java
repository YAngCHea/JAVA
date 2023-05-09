package J0509_01;

import java.util.Scanner;

public class Class0509_11 {

	public static void main(String[] args) {
		// 소수점 4째자리에서 반올림 출력하시오.
		//1.변수선언
		//2.출력
		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;       //소수점3째자리까지 출력
		double result = Math.round(pi*1000)/1000.0;  //소수점 4째자리에서 반올림해서 3.142나온다
		System.out.println(result);
				

		//double pi = 3.7894 소수점 2자리에서 반올림 출력하시오
		double pi1 = 3.7894;
		double result2 = Math.round(pi1 * 10)/10.0;
		System.out.println("소수점 2자리에서 반올림 했다 : "+result2);
		
		//소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오
		double pi2 = 1.23456;
		double result3 = Math.round(pi2 * 100)/100.0;
		System.out.println("소수점 3자리에서 반올림 했따! : "+result3);
		
		
		//여기 교수님 코드 확인하기
		//반올림 round(), 올림 ceil(), 버림 floor()
		
		//실수를 입력받아 소수점 4자리에서 올림해서 출력하시오.
		double input5 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		input5 = scan.nextDouble();
		
		
		
		
		
	}

}
