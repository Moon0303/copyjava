package nwt02.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 UI (User Interface)
 화면을 구성하는 개념으로 사용자가 처음 마주하는 부분이라는 의미
 */
public class LottoUI extends JFrame implements ActionListener{
	LottoVO lotto; 			// 필드에 인스턴스변수 선언, 클래스안의 전체 메소드에서 공유하기위해 사용.
	JButton btn;
	JPanel panelNorth, panelSouth;
	ImageIcon icon; 		// import 단축키 : CTRL + SHIFT + O
	List<JButton> btns; 	// List 는 java.util.list 선택
	
	public LottoUI() {
	//	this("",0)
		init();
	}
	
	private void init() {					// init() 은 initialize 라는 초기화의 의미를 갖고 있다.
		this.setTitle("로또생성기");
		lotto = new LottoVO();				// 필드에 인스턴스변수가 선언되어서 사용가능.
		btns = new ArrayList<JButton>();
		panelNorth = new JPanel();
		panelSouth = new JPanel();
		btn = new JButton("생성기");
		/* 버튼에 인터페이스가 가지고 있는 기능을 할당한다. */
		btn.addActionListener(this);
		panelNorth.add(btn);
		add(panelNorth, BorderLayout.NORTH);
		add(panelSouth, BorderLayout.SOUTH);
		setBounds(300, 400, 1200, 300); 	// 300, 400 은 x,y 좌표  
											// 1200, 300 은 픽셀을 단위로 하는 사이즈
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/* 이벤트를 처리하는 능력을 ActionListener 인터페이스로부터 부여받았다.	*/
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
	}

	private void showLotto() {
		int[] arr = lotto.getLotto();	// getter 쓴것
		for(int i=0;i<arr.length;i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
		
	}

	private Icon getIcon(int i) {
		String imgPath = "src/images/"+Integer.toString(i)+".gif";
		return new ImageIcon(imgPath);
	}

	private void makeBtns() {
		/* JButton tmp = new JButton(); 와 아래 로직이 다른점은 
		 *  인스턴스 참조변수(객체) 를 1개 생성하는 것과 6개 생성하는 것이 다른점이다. */
		JButton tmp = null;
		for(int i=0;i<6;i++){
			tmp = new JButton();
			btns.add(tmp);			/* 숫자가 붙지 않은 버튼 형식으로만 만들어진 리스트에
			 						 * 인덱스를 할당하는것.  */
			panelSouth.add(tmp);	// 아래쪽 패널에 버튼을 조립하는 것.
			
		}
	}

}
