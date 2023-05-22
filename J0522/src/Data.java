
public class Data {
	
	//오버로딩 : 이름은 같지만 타입과 개수가 다른것
	
	// Data(){}  //생성자 : 이 부분이 입력하지 않아도 자동으로 생성된다
	
	Data(int n1, int n2){ //
		num1 = n1;
		num2 = n2;
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;
	}
	
	int num1; //입력받을 1번째 숫자
	int num2; //입력받을 2번째 숫자
	int data1;//두수 더하기
	int data2;//두수 빼기
	int data3;//두수 곱하기
	int data4;//두수 나누기

//---디폴트값을 주는 this------------------------------------------------------------------------	
	Data(){
		//this : 같은 클래스 내 다른 생성자를 호출하는것이 : this()
		this(1,1);
		num1 = 1;
		num2 = 1;
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;
	}
//	
//	Data(int num1, int num2){
//		//클래스 내 인스턴스 변수를 가리킴
//		this.num1 = num1;
//		this.num2 = num2;
//		data1 = num1 + num2;
//		data2 = num1 - num2;
//		data3 = num1 * num2;
//		data4 = num1 / num2;
//	}
	
	
	
}
