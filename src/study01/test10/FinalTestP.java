package study01.test10;
//instance of = 나 이거 ~라고 불러도되?
class FF{//얘는 2개의 이름으로 불릴수 있다. Object , Father
	
}
public class FinalTestP extends FF {
	final int num=1;
	
	public static void main(String[]args) {
		FinalTestP ft=new FinalTestP();
		System.out.println(ft instanceof FinalTestP);
		System.out.println(ft instanceof FF);
		System.out.println(ft instanceof Object);
		FF ff=new FinalTestP();
		
		System.out.println(ft instanceof FinalTestP);
		
		
		ff=new FF();
		if(ff instanceof FinalTestP)
			ft= (FinalTestP) ff;   
		
		System.out.println(ft instanceof FinalTestP);
		
	}
}
/*쉽게 생각해서 부르기 쉽게 사람이라고 했다가
 나중가서 개개인의 이름으로 나누는건데
 그때  FF ff=new FinalTestP();이렇게 이름을 물어보고 확인하는것*/