package study01.test11;
//Interface는 표준화 시키는것이라고 생각하자(method뜻에 맞게 만들어라ex) on-on으로/off-off로
public class Excute {
	public static void main(String[]args) {
		Remote r= new TvRemocon();        //메모리생성은 안되(Interface라서)
		r.on();							  //but!! 데이터타입으로는 설정할 수 있다!!
		Remote r2= new AirconRemocon();
		r2.on();
	/*switch문 공부
		int age=20;
		switch(age) {
		case 10:
			System.out.println("10살 이하");
			break;							값이 전부다나오기 떄문에 break걸어놔야댐
		case 20:
			System.out.println("20살 이하");
			break;
		case 30:
			System.out.println("30살 이하");
			break;
		default:
			System.out.println("31살 이하");*/
		
		
		}
	}
	

