package swingTest;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane1;
		// 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
		pane1 = new JPanel();
		pane1.setLayout(new FlowLayout(FlowLayout.CENTER)); //패널의 배치관리자를 FlowLayout으로 설정
		//패널에 버튼을 생성하여 추가
		pane1.add(new JButton("Button1"));
		pane1.add(new JButton("Button2"));
		pane1.add(new JButton("Button3"));
		pane1.add(new JButton("B4"));
		pane1.add(new JButton("Long Button5")); // 패널에 버튼 추가
		add(pane1); //패널을 프레임에 추가
		pack();
//		setResizable(false);
		setVisible(true);
	}
}

public class FlowTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
