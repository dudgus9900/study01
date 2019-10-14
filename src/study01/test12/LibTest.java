package study01.test12;
//메이븐 lang3.jar를 받아서 라이브러리에 추가하고 기능 이용해보기
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LibTest {

	public static void main(String[]args) {
		List<String> ages=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("나이를 입력하세요 : ");
			String age=scan.nextLine();
			age=StringUtils.leftPad(age,3,"0");	//leftPad-(static method:new가 안만들어졌네,public:상속도 안받았는데 가른패키지를 쓸수 있네)
			ages.add(age);
		}
		Collections.sort(ages);			//정렬해줄 때 사용한다.
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
		}
	}
}
