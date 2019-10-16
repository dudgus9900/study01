package study01.test15;
//replace에 대해 알아보자
public class Replace {

	public static void main(String[]args) {
		String str="2019-08-01";
		System.out.println(str.replace("-","."));//이렇게 하면 2019.08.01이 나오고
		//str=str.replace("-","."); 이걸 쓰면 아래의 System.out.println(str);도 2019.08.01라고 나온다.
		System.out.println(str);
		
	}
}
/*쿼리박스
create table user_info(      /*구조를 만들때는 create
id varchar2(50) not null,
pwd varchar2(50) not null,
name varchar2(20) not null,
age varchar2(3) not null,
etc varchar2(4000)
);
insert into user_info        /*데이터를 집어넣을때는 inser into
values('dcdcdcdc','321','홍길동',100,'보여주는 부분이죠'); /* 홍길동도오동도ㅗ오도오   이렇게 되면 한글이 한글자에 3byte기 때문에 오류가난다,

select * from user_info

where id='asdasd' and name='박영현'; /*'Asdasd'는 다르다. 값은 대소문자 구분!!  →Where 조건절이라고 부른다.
				      id가 'asdasd'와 name이 '박영현'이 나온다.
------------------------------------------------------------------------------------------------------------------------------------------------------
*/				      