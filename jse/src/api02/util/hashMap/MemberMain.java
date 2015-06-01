package api02.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		System.out.println("나이 입력");
		int age  = scanner.nextInt();			// 숫자입력은 nextInt() 주의
		System.out.println("아이디 입력");
		String id = scanner.next();
		System.out.println("비번 입력");
		String password = scanner.next();
		System.out.println("주소 입력");
		String addr = scanner.next();
		/*
		 * 기능으로 특화된 MemberServiceImpl 의 객체를 생성한다.
		 * 왜냐하면 입력받은 값들을 DB 에 저장하고, 맵에 담아서 사용하기 위함이다.
		 */
		MemberService service = new MemberServiceImpl();
		// 객체를 생성하는 이유는 그 객체가 가진 기능(메소드)를 호출하기 위해서다.
		service.join(id, password, name, age, addr);
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인 하세요");
		System.out.println("id 입력");
		id = scanner.next();
		System.out.println("password 입력");
		password = scanner.next();
		service.login(id, password);		//service 객체를 불러와서 login메소드를 호출
	}
}
