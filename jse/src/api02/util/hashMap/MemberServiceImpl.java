package api02.util.hashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * 객체지향의 4대 특징인 은닉화, 상속, 추상화, 다양성
 * 추상화 + 다양성 을 구현하는 implements.
 * 인터페이스 구현 방식은 클래스 명 다음에 implements 키워드 코딩후
 * 인터페이스를 입력하면, 클래스명에 빨간줄(에러)표시가 뜬다.
 * 마우스를 대고 add unimplement 클릭.
 * 자동 오버라이딩이 된다.
 */
public class MemberServiceImpl implements MemberService {
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String, Object>();
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 * 1. vo 객체를 생성해서
		 *  DB 에 값이 저장되는 형상을 표현
		 */
		
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		/*
		 * 2. 인스턴스 변수값을 통합하여 운반하고 검색할
		 * 컬렉션을 준비한다.
		 */
	
		/*
		 * vo.getID() 가 가능한 이유는 위 메소드인 vo.setID() 에서
		 * 저장한 인스턴스 변수 String id 를 같이 공유하며
		 * 바라보고 있기 때문이다.
		 * vo.getID() 를 "id" 라는 리터럴("",상수값,고정값)에 저장
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", vo.getAge());
		map.put("addr", vo.getAddr());
		
	}

	@Override
	public void login(String id, String password) {
		/*
		 * join() 에 지역변수로 map 를 선언했더니
		 * join() 만 그 값을 참조할 수 있고, login() 는
		 * 그 값을 볼 수 없어서 아래 map.get("id") 에서 사용할수 없었다.
		 * 그래서. 이 클래스의 메소드라면 그 값을 바라볼 수 있도록
		 * 필드에 선언해준다.
		 */
		System.out.println("맵에 담긴 ID : "+ map.get("id"));
		if(!map.containsKey("id")){
			System.out.println("입력하신 ID 는 존재하지 않습니다."
					+ "다시 입력하세요.");
		}else{
			if(!(map.get("password").equals(password))){
				System.out.println("비번이 달라요"
						+ "다시 입력하세요");
			}else{
				System.out.println("환영합니다.."
						+ vo.getAddr() + "에 사시는"
						+ vo.getAge() + "세 되시는"
						+ vo.getName() + "님 환영합니다.");
			}
		}
		
	}

}













