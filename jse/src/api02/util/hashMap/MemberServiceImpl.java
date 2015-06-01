package api02.util.hashMap;
/*
 * 객체지향의 4대 특징인 은닉화, 상속, 추상화, 다양성
 * 추상화 + 다양성 을 구현하는 implements.
 * 인터페이스 구현 방식은 클래스 명 다음에 implements 키워드 코딩후
 * 인터페이스를 입력하면, 클래스명에 빨간줄(에러)표시가 뜬다.
 * 마우스를 대고 add unimplement 클릭.
 * 자동 오버라이딩이 된다.
 */
public class MemberServiceImpl implements MemberService {

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		//1. vo 객체를 생성해서
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		// DB 에 값이 저장되는 형상을 표현
		
	}

	@Override
	public void login(String id, String password) {
		// TODO Auto-generated method stub
		
	}

}
