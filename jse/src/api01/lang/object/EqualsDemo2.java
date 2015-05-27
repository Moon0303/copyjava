package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1 == p2) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른사람";
		System.out.println("(p1 == p2) 결과값 : "+result);
		/*
		 * (p1 == p2) 결과값 : p1과 p2는 다른사람
		 * 결과로 보아 == 는
		 * 해시코드 주소값을 비교한다.
		 */
		
		result = (p1.equals(p2)) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른사람";
		System.out.println("(p1.equals(p2)) 결과값 : "+result);
		/*
		 * (p1.equals(p2)) 결과값 : p1과 p2는 같은 사람
		 * 결과로 보아 equals 는
		 * 실제 리터럴값을 비교한다.
		 */
	}
}
class Person{
	private String ssn;			// 주민번호
	public Person(String ssn) {
		this.ssn = ssn;
	}
	// getter setter 만들기 , alt+shift+s
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// equals overriding hot-key
	// ALT + SHIFT + S , gernerate hashcode()를 선택한다.
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){		// obj가 null이 아니고 Person의 개체라면
			return ssn == ((Person)obj).ssn;			// obj를 person으로 형변환하고 그 객체를 소환.
		}else{
			return false;
		}
	}
	
}