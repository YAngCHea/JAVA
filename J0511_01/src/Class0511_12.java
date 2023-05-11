
public class Class0511_12 {

	public static void main(String[] args) {
//		int num = 5;
//		int num2 = num;
//		num2 = 10;
//		System.out.println(num);//5
//		System.out.println(num2);//10
////---배열의 복사---------------------------------------------------------------
//		int[] input = new int[3];
//		input[0] = 5;
//		
//		int[] input2 = input;
//		System.out.println(input2[0]);  // 5
//		
//		input2[0] = 20;
//		System.out.println(input2[0]);  // 20
//		System.out.println(input[0]);  //20    :int[] input2 = input; 이 부분이 주소를 복사하는것이기 때문!!
//		                                      //이런식으로 복사하면 안된다.
////----------------------------------------------------------------------------
		int a = 10;
		int b = 20;
		
		//a와 b의 값을 서로 바꿔서 저장을 하시오.
		int c = 0;      //c를 새로 하나 만들고 돌려서 저장을 해야 정상적으로 돌아간다.
		c = a;
		a = b;
		b = c; 
		
		System.out.println(a);
		System.out.println(b);
	}

}
