package swingTest;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

class MyFrame5 extends JFrame {
	JButton b1;
	private JButton b2, b3;
	
	public MyFrame5() {
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		JPanel p = new JPanel();
		p.setLayout(null);; // 패널의 배치 관리자를 제거한ㄴ다.
		
		b1 = new JButton("Button #1");
		p.add(b1);
		b2 = new JButton("Button #2");
		p.add(b2);
		b3 = new JButton("Button #3");
		p.add(b3);
		b1.setBounds(20, 5, 95, 30);
		b2.setBounds(44, 45, 105, 70);
		b3.setBounds(180, 15, 105, 90);
		
		Border border = BorderFactory.createTitledBorder("크기");
		p.setBorder(border); //경계 만들기
		
		add(p);
		setVisible(true);
	}
}

public class AbsoluteTest {
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}
}
