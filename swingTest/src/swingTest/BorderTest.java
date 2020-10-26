package swingTest;

import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임은 디폴트로 BorderLayout이므로 사실은 불필요
		setLayout(new BorderLayout());
		
		//버튼을 추가한다.
		add(new JButton("Center"), BorderLayout.CENTER); //프레임에 버튼을 추가한다. 추가하는 위치를 지정한다.
		add(new JButton("Line Start"), BorderLayout.LINE_START); //WEST
		add(new JButton("Line End"), BorderLayout.LINE_END);	 //EAST
		add(new JButton("Page Start"), BorderLayout.PAGE_START); //NORTH
		add(new JButton("Page Ebd"), BorderLayout.PAGE_END);	 //SOUTH
		pack();
		setVisible(true);
		
	}
}

public class BorderTest {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
