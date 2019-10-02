package study01.test07;

class Calc1{
	
	int num1;
	int num2;
	
	public void add() {
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
}
public class Execute1 {
	
	public static void main(String[]args) {
		Calc1 calc=new Calc1();
		calc.num1=5;
		calc.num2=2;
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
	}
}
