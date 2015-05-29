package api02.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * jave.util.ArrayList의 메소드인
 * add()는 백터의 add()와 동일하다
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector는 내부적으로 string 사용. 속도가 느림. 동기화지원
		 * ArrayList 는 내부적으로 StrngBuffer 사용. 동기화 지원하지 않음
		 */
		ArrayList<String> lists = new ArrayList<String>();
		// 항목추가
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		/* 출력1 : iterater() 이용*/
		//이클립스 제안 중에서 java.util.Iterater 선택
		Iterator<String> it1 = lists.iterator();
		
		//Iterator 를 선언하고 whi를 코딩하면
		// 3가지 이클립스 제안이 나오는데 그중 .. with iterator 를 선택
		
		while (it1.hasNext()) {
			//String string = (//String) it1.next();
			System.out.printf("%s",it1.next());
			/* 윗 구문 중 printf 인 것에 주의!!
			 * printf 는 포맷팅한 결과를 콘솔에 출력하겠다는 의미
			 * %s 는 string 값을 의미하며, 다음 구문인
			 * it1.next() 의 리턴값을 보여주는 역할을 한다.
			 * 여기서 %s 는 string 값을 의미
			 * 만약 숫자를 포맷팅한다면 %d 10진수를 의미
			 */
		}
		System.out.println();
		/* 출력 2*/
		while (it1.hasNext()) {
			
		}
		/* 출력 3*/
		
/*		while (it3.hasNext()) {
			str = it3.next();
			 ArrayList 의 요소중에서 "대" 자로
			 * 시작하는 것이 잇다면...
			 
			if(str.startsWith("대")){
				System.out.printf("%s",str);
			}
		}*/
		System.out.println();
		//ArrayList 는 동일한 자료의 입력이 가능하다
		
		ArrayList<String> lists2 = new ArrayList<String>();
		lists2.add("대전");
		lists2.add("대구");
		lists2.add("부산");
		
		
		
	}
}
