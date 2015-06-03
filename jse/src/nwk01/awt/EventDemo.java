package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);	// 너비, 높이
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label(" ID :");
		labId.setBounds(50, 50, 30, 10); // (50,50 위치 좌표.. 30, 10 너비 높이)
		Label labPwd = new Label(" Password :");
		labPwd.setBounds(50, 65, 100, 10);
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 */
		// frame.setLayout(new FlowLayout());
		// FlowLayout 은 가로로(좌에서 우로) 정렬시킨다. 
		frame.setLayout(null);	// null 이면 x,y 좌표로 정렬된다.
		frame.add(labId);
		frame.add(labPwd);
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 */
		
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
	}
	
}
class EventHandler implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 윈도우 닫기 버튼을 클릭했을 경우
		e.getWindow().setVisible(true);	// 이벤트를 윈도우창에 나타나게 하고
		e.getWindow().dispose();  // 윈도우에 사라지게 해라.
		System.exit(0);  // 시스템에서 완전 제거하라.
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}






