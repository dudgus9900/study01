package study01.test07;

class Cat1{
	private int age;
	private String name;
	private String type;
	
	public void setAge(int age) {
	this.age=age;	
	}
	public int getAge() {
		return age;
		
	}
}
public class Access {
	
	public static void main(String[]args) {
		Cat1 c=new Cat1();
		c.setAge(5);
	}
}

