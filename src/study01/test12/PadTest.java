package study01.test12;

public class PadTest {

	public static void main(String[]args) {
	String str="1";
	int max=4-str.length();
	for(int i=1;i<=max;i++) {	//이렇게 되면 str.length가 계속 바뀌어 원하는값안나옴
		str+="0";
		System.out.println(str);
	}
	
	}
}
/*Debuging
	실행ctrl+shift+d+j
	다음F6 나감F8	*/