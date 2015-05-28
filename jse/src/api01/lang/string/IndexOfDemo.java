package api01.lang.string;

public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "Hello Java World";
		/*
		 * Indexof("S") : s 의 문자열 내부에서의 위치값 리턴
		 * 인덱스는 0부터 시작하고, 공백도 1칸으로 인정한다.
		 */
		System.out.println("테스트용 단어 : "+str);
		int idx;
		idx = str.indexOf("java");
		System.out.println("Java 의 위치값 : "+idx);
		/*
		 * DB 에 저장되는 ID 나 Password 의 경우
		 * 용량떄문에 글자수를 제한하는 경우가 있는데,
		 * 회원가입시 글자수 체크해서 제한할 때 사용.
		 */
		idx = str.lastIndexOf('d');
		
	}
}
