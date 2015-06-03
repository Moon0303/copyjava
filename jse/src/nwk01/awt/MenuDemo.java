package nwk01.awt;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);	// 너비, 높이
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemOpen = new MenuItem("Open");
		/* Menu 와 MenuItem 의 차이
		 * 자식이 있으면 Menu 를 쓰고
		 * 자식이 없으면 MenuItem 을 쓴다.
		 */
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMenuPreview = new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("Setup");
		subMenu.add(subMenuPrint);
		subMenu.add(subMenuPreview);
		subMenu.add(subMenuSetup);
		
		
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 */
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(subMenu);
		menuFile.addSeparator(); // 구분자 표시
		menuFile.add(itemExit);
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		menuBar.add(menuHelp);
		
		frame.setMenuBar(menuBar);  /* add 를 사용하지 않고 setMenuBar 를
									 * 사용하면 자동으로 가장 위쪽에 자리잡는다.*/
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 */
		
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
	}
}
