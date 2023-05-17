import java.util.Scanner;

public class StuMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] s = new Student[10];
		// [성적입력 프로그램]
		// 1.성적을 입력하세요
		// 2.성적을 출력합니다
		// 3.성적수정
		// 4.등수처리
		// 5.학생성적검색
		// 0.종료합니다
		// -------------------

		//이름,국어,영어,수학,합계,평균 - 10명
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		int choice = 0;
		int count = 0; //성적입력 학생수
		String searchname = " ";
		int[] rank = new int[10];
		int check = 0;        //존재 유무
		
		//프로그램 시작 무한반복
		loop : while(true) {
			//화면 출력하기
			choice = stuScreen();
			
			switch(choice) {
			case 1:// 1.성적을 입력하세요
				
				
				//성적입력 메소드 호출 - 클래스명. 메소드명() / 메소드명()
				count = stuInput(count, s); //입력된 학생수
				
				
				break;
			case 2://2.성적을 출력합니다
			
				
				
				break;
				
			case 3:// 3.성적수정
				
				break;
				
			case 4:// 4.등수처리 score[i][3]
				
				break;
				
			case 5:// 5.학생성적검색
				
				break;
				
			case 0:// 0.종료합니다
				
				break loop;  //while에 걸린 loop
			
			
			}
			
		}//while	
	}//main

	static int stuScreen() {
		//화면 출력부분
		System.out.println("[학생 성적처리 프로그램]");
		System.out.println("1.성적을 입력하세요");
		System.out.println("2.성적을 출력합니다");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.종료합니다");
		System.out.println("--------------------------------------");
		int choice = scan.nextInt();
		return choice;
	}
	
	
	//1.학생성적 입력메소드
	static int stuInput(int count, Student[] s) {
		for(int i=count;i<s.length;i++) {
			
			s[i] = new Student(); //객체선언
			
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요.(0.이전 페이지 이동)>>");
			s[i].name = scan.next();
	//이전페이지 이동하기
			if(s[i].equals("0")) {
				System.out.println("이전페이지로 이동합니다");
				System.out.println();
				break;  //for문 빠져나오기 :여기서 while로 빠져나와야하는게 아닌지?
			}

			System.out.println("국어점수를 입력하세요");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			s[i].math = scan.nextInt();
			
			
			
			System.out.println((count+1) + "번째 학생 성적이 등록되었습니다");
			
	//학생수 1 증가
			count++; //얘를 써줘야 i가 올라간다
		}//for
		return count;	
	}
}
