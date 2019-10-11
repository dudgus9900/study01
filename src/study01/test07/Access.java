package study01.test07;

class Cat1{
	private int age;
	private String name;
	private String type;
	
	public void setName(String str) {
		this.name=str;
	}
	public String getName() {
		return name;
	}
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
		c.setName("야옹이");
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
}

