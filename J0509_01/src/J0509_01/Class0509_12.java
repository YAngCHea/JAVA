package J0509_01;

import java.util.Scanner;

public class Class0509_12 {

	public static void main(String[] args) {
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		ch = scan.next().charAt(0);
		String result = (ch>='a'&&ch<='z')?"영문 소문자입니다":"영문소문자가 아닙니다";
		System.out.println(result);

	}

}
