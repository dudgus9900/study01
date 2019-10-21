package Memo;

public class Date1021 {

}
/*10/21 수업내용

* if(op.equals("+"))  / if("+".equals(op)   두개다 같은 말이다(오른쪽이 가독성이 더 좋다)

*숫자1 : <input type="number"name="num1"value="3">  - value값을 집어넣어서 초기값을 정할 수도 있다.

* <select name="op">
	<option value="+">더하기</option>
	<option value="-">빼기</option>
	<option value="*">곱하기</option>
	<option value="/">나누기</option>
	</select>     - select 박스에서는 "+","-","*","/"같이앞에는 코딩이나 데이터가 들어가고 뒤에 설명이 붙는다.

* <%=result%>
  <%out.println();%>   -두개 모두 똑같은 말이다.(expression)

* 확장자명이 jsp라는 가정하에 <% %>쓸 수 있다.
  <% %> 4가지 기능
	<%@ %>-디렉티브 : page 설명서라고 이해하자
		ex)<%@ page language="java" contentType="text/html; charset=UTF-8"
    		   pageEncoding="UTF-8"%>
	<% %>-실행부 : 자바형태로 실행부
	<%= %>-표현 : out.println(); 줄인말이다!
		ex)<%out.println(result());%>  =  <%/=result%> 
	<%! %>-선언부 :html<% %>에서 메소드를 사용하고싶을 때 쓰는 놈

* jsp는 처음 java로바뀌어서 읽어들이는거다.

* static은 단한번만 loading 한다.
* 
* 10/22 쪽지셤 List, Map, Connection에 대한 것과 10/21까지 배운것!!
* */