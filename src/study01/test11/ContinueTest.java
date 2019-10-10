package study01.test11;

public class ContinueTest {

	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) continue;	//continue는 for문 끝나지않고 다시 증감부로 보낸다.
			System.out.println(i);	//뭔가를 스킵해야 할 때 쓰이면 되겠구나.
			}
		}
	}
