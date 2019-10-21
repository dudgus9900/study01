package study02;

public class Memo {

}
/*<a href="http://naver.com">네이버</a><br>
블락태그 : &lt;div&gt; <br>
<div>난 div요소</div>
테이블 : &lt;table&gt; <br>
테이블의 로우 : &lt;tr&gt; <br>
테이블의 헤더 : &lt;th&gt; <br>
테이블의 데이터 : &lt;td&gt; <br>
<table border="1">
	<tr>
		<th>이름</th>
		<th>나이</th>
	</tr>
	<tr>
		<td>홍길동</td>
		<td>33</td>
	</tr>
	<tr>
		<td>임꺽정</td>
		<td>34</td>
	</tr>
</table>

*html 입력용(Input용) 명령어 <form> 태그

-html에서는 속성이 attribute (Java에서는 property)
 html에서는 ? 들어가는 주소면 GET 방식이다.(검색은 무조건 GET방식이어야 한다!)
 
-<form>
	 ID : <input type="text"name="id"<br>한글 영어 상관없이 씀     - "text"가 속성값이다.
	 PassWord : <input type="password"name="pwd"<br> 한글X비밀번호처럼 나타낸다. 
	 Name : <input type="text"name="name"<br>
	 Age : <input type="number"name="age"<br> 숫자밖에 안들어감
	 Etc : <textarea name="etc"></textarea>
	</form>


*<button>Signup</button> 
 - button타입 이 form타입 안에 있고 앞에 아무것도 
   적혀있지 않으면 submit이다(나 자신에게 보내는것-이렇게쓰지는 않지만;;)

*jsp에서 import하는 방법
 - ctrl + space

*상대경로 / 절대 경로(signup-ok.jsp를 보며 같이 공부하자)
-<form method="get"action="signup_ok.jsp"> 이렇게 써도 되나 
 <form method="get"action="">이렇게 써도 된다.(상대경로)
-/bdi-web/jsp/signup_ok(bdi-web이 절대경로이다.(/부터 시작하는것이다!!)
 ex)/bdi-web/test/b.jsp - bdi-web부터 찾기에 url에서 치면 나온다.
    bdi-web/test/b.jsp - test파일부터 찾기 때문에 error뜬다.
-상대경로는 쓰지말고 절대경로를 써주어야한다.(html은 폴더에 폴더에폴더를 거치기 때문에 나중에 어떠한 경로인지 모른다.)
===============================================================================================
셤문제 
*엔티티 만드는것 or 엔티티를 보고 create문을 만드는 것
*테이블 접속해서 자바에서 insert하는 방법
*10/14일 전까지 자바를 제외하고 나갔던것들
*위의 CREATE TABLE USER_INFO 자바에서 하는 방법 
*OSI 7계층(google에 검색해보자!)*/