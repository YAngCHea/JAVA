import java.util.ArrayList;
import java.util.Scanner;
public class StuMain {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] argu) {
		
		int choice = 0;
		String searchName = "";
		
		//아래변수가 Student에도 있지만 이 부분을 한번 더 넣어준다
		String name = "";                
		int kor = 0;
		int eng = 0;
		int math = 0;
		int check = 0;   //검색했는데 없을 경우 사용한다
		
//		Student[] s = new Student[10]; //배열선언
//		s[0] = new Student();  //객체선언
		ArrayList<Student> list = new ArrayList<>();     //ArrayList<Student> list : 객체의 배열
		
		while(true) {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.성적삭제");
			System.out.println("5.성적검색");
			System.out.println("6.등수처리");
			System.out.println("7.오름차순 정리");
			System.out.println("8.내림차순 정리");
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
				stuInput(list);
				break;
				
			case 2: //2.성적출력
				stuOutput(list);
				break;
				
			case 3:  //3.성적수정
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchName = scan.next();
				check = 0;
				for(int i=0;i<list.size();i++) {
					Student s = list.get(i);
					if(s.getName().equals(searchName)) {
						System.out.println("[ 학생이 검색되었습니다 ]");
						System.out.println("수정할 과목을 선택하세요");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("---------------------------");
						System.out.println("번호를 입력하세요");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1 : //국어
							System.out.printf("[ 현재 %s점수 : %d ] \n", Student.title[choice+1],s.getKor());
							System.out.printf("변경할 %s점수를 입력하세요\n", Student.title[choice+1]);
							s.setKor(scan.nextInt());    //set = 저장 //내가 입력한 값이 바로 저장
							break;
							
						case 2:  //영어
							System.out.printf("[ 현재 %s점수 : %d ] \n", Student.title[choice+1],s.getEng());
							System.out.printf("변경할 %s점수를 입력하세요\n", Student.title[choice+1]);
							s.setEng(scan.nextInt());    //set = 저장 //내가 입력한 값이 바로 저장
							break;
						case 3:  //수학
							System.out.printf("[ 현재 %s점수 : %d ] \n", Student.title[choice+1],s.getMath());
							System.out.printf("변경할 %s점수를 입력하세요\n", Student.title[choice+1]);
							s.setMath(scan.nextInt());    //set = 저장 //내가 입력한 값이 바로 저장
							break;
						}
						//이부분이 공통영역이라 밖으로 빼면 된다
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						System.out.printf(" %s 점수가 변경되었습니다.\n", Student.title[choice+1]);
						System.out.println();
						check = 1;
					}
				}//for
			
				if(check == 0) {
					System.out.println("[ 찾고자하는 학생이 없습니다. 다시입력하세요. ]");
					System.out.println();
				}
			    break;
			
			case 0:
				break;
			}//switch
			
			
		}//while

	}//main메소드
	
//----------------------------------------------------------------	
	//다른 메소드 선언 : 리턴타입 메소드명(매개변수){    }
	//case 1:
	static void stuInput(ArrayList<Student> list) {
		
		String name = "";                
		int kor = 0, eng = 0, math = 0;
		
		//학생입력부분
		for(int i=list.size();;i++) {
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
			
			list.add(new Student(name,kor,eng,math));   //개수에 제한이 없음
			//호출을 해서 total, avg을 모두 가져오기
		}//for
	}
//-----------------------------------------------------------------	
	//case 2 : 
	//학생성적 입력
	static void stuOutput(ArrayList<Student> list) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
				Student.title[0],Student.title[1],Student.title[2],Student.title[3],
				Student.title[4],Student.title[5],Student.title[6],Student.title[7]);
		System.out.println("-----------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			//"학번","이름","국어","영어","수학","합계","평균","등수"
			Student s = list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					s.getStuNo(), s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
