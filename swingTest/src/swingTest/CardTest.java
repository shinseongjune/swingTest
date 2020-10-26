package swingTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements ActionListener {
	JPanel panel;
	Cards cards;
	
	public MyFrame4() {
		setTitle("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0)); //GridLayout의 패널을 만들고 여기에 제어 버튼을 넣는다.
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel, "North");
		cards = new Cards(); //Cards 객체를 생성하여 중앙에 배치한다. Cards는 패널의 일종이다(뒤에 정의된다).
		add(cards, "Center");
		setVisible(true);
	}
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout(); //카드 레이아웃 설정
			setLayout(layout);
			for (int i=1; i <= 10; i++) {
				add(new JButton("현재 카드의 번호는 " + i + "입니다"), "Center");
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) { //이벤트를 처리하는 부분이다. 차후에 학습한다.
		if (e.getActionCommand().equals("종료")) {
			System.exit(0); // 0 = 정상 종료(code 0)
		} else if (e.getActionCommand().equals("<<")) {
			cards.layout.first(cards); //CardLayout 중에서 첫 번째 카드를 선택한다.
		} else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
}

public class CardTest {
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}
}
