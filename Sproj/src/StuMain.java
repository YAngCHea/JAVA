import java.util.Scanner;
public class StuMain {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] argu) {
		
		int choice = 0;
		int count = 0;   //학생수 count
		
		//아래변수가 Student에도 있지만 이 부분을 한번 더 넣어준다
		String name = "";                
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Student[] s = new Student[10]; //배열선언
		
//		s[0] = new Student();  //객체선언
		
		while(true) {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			
			if(choice==0) {
				System.out.println("[프로그램을 종료합니다]");
				System.out.println();
				break;
			}//if종료
			
			
			
			switch(choice) {
			case 1:  //1.성적입력
				
				//성적입력 프로그램 메소드 호출
				count = stuInput(count,s);
				
				break;
				
			case 2:
				break;
			case 0:
				break;
			}//switch
			
			
		}//while

	}//main메소드
	
//----------------------------------------------------------------	
	//다른 메소드 선언 : 리턴타입 메소드명(매개변수){    }
	static int stuInput(int count,Student[] s) {
		
		String name = "";                
		int kor = 0, eng = 0, math = 0;
		
		//학생입력부분
		for(int i=count;i<s.length;i++) {
			System.out.println();
			System.out.println("[" + (i+1) + "번째 학생]");
			System.out.println((i+1) + "번째 이름을 입력하세요.(0.이전페이지 이동)");
			name = scan.next();
			
			//이전페이지 이동확인하기
			if(name.equals("0")) {
				System.out.println("[ 이전페이지로 이동합니다 ]");
				System.out.println();
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			
			s[i] = new Student(name,kor,eng,math);
			//호출을 해서 total, avg을 모두 가져오기
			count++;
		}//for
		return count;
	}
//-----------------------------------------------------------------	
	
	
	
}
