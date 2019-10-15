package study01.test14;
//get/set method 심화
public class Person {
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name) {//private String name을 쓰고 싶어서 public 메소드를 만들어준다.
		this.name=name;					  //같은 이름의 변수를 썼을 때는 this를 꼭 붙여라!!
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
@Override
public String toString() {
	return "Person[name="+name+",age="+age+",addr="+addr+"";
}
}
/*DTO
  VO: Value Object 값을 지정하거나 사용하기 위한 class*/
	


