package study01.test11;

public class TvRemocon implements Remote{	//TvRemocon Object Remote 로 불릴수 있다.

	@Override
	public void on() {
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("tv를 끕니다.");
		
	}
	/*@Override
	public void volume() {} 오버라이딩 할 수 없으니까 오류난다.*/
}
