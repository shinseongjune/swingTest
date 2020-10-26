package swingTest;

import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame {
	public MyFrame3() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 3)); // 3개의 열과 필요한 만큼의 행 / 3개의 열을 가진 GridLayout, 행의 개수는 추가되는 컴포넌트에 의하여 결정된다.
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
	}
}

public class GridTest {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}
//boxlayout도 있음