package study01.test11;

import java.util.ArrayList;

public class WhileTest {
	public static void main(String[]args) {
	
		ArrayList<String> strList=new ArrayList<String>();//While의 기본 문법
		while(strList.size()<7) {
		strList.add("아무거나");		//어떠한 조건을 만족하지않으면 실행X.
	}
		do {							//do_while의 기본 문법
			strList.add("아무거나");		
		}while(strList.size()<7);		//일단 한번은 실행해라(8까지하기는 한다.)
	}
}

/*  int i=1;			|	for(i=1;i<=10;i++){}
    while(i<=10) {i++;}	|		똑같은 코딩이나 경우에 따라 for/while을 구분해서 사용한다.*/
	