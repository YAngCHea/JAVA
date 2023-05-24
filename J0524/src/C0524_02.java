
public class C0524_02 {
//다형성 : 조상타입의 참조변수로 자손타입의 객체를 다룰수 있는것 
	//자식은 부모에 있는 것도 쓸수이씀 / 부모는 자식에 있는거 못씀
	public static void main(String[] args) {
		//객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.caption();        //캡션기능을 시작합니다.
		
		
		//다형성
		Tv t = new CaptionTv();
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
//		t.caption();    //자식에있는애라 못불러온다  //공간은 있지만, t의 변수가 없어서 사용할 수 없음
		
		
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel);
		
		CaptionTv c2 = null;
		t2 = c; //얘는 가능하지만
//		c = t2; //얘는 불가능함
		
		//이렇게 하고싶으면 강제 형변환을 해줘야한다
		c = (CaptionTv)t2;
		
		
	}
	
	
}
