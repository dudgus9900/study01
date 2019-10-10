package study01.test07;

class Mother{
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라.");
	}
}

public class Son extends Mother {

	public void cook(){
		 System.out.println("라면먹을래 걍");
	}

	public static void main(String[]args) {
		
		
	}
}