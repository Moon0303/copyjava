package nwk01.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 */
		Button btn0k = new Button("확 인");
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Dimension dim = toolkit.getScreenSize();
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 */
		frame.setLayout(null);
		frame.add(btn0k);
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 */
//		frame.setLocation(dim.);
		/*
		 한글깨짐 솔루션
		 프로젝트명 우클릭
		 > 맨 밑 properties 클랙
		 > run/debug setting 클릭
		 > 현재 클래그명 더블클릭
		 > arguments 탭 클릭
		 > VM arguments 빈공간에
		 > -Dfile.encoding=ms949 입력
		 > 저장후 재실행 
		 */
	}
}








