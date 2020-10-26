package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleSlider extends JFrame{
	public static void main(String[] args) {
		SampleSlider f = new SampleSlider();
		f.setTitle("SampleSlider");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	SampleSlider() {
		JSlider s = new JSlider();
		s.setOrientation(JSlider.HORIZONTAL);
		
		JProgressBar bar = new JProgressBar(0,200);
		bar.setStringPainted(true);
		bar.setValue(50);
		
		JLabel label = new JLabel();
		label.setText("Raspberry PI");
		
		JTextField text = new JTextField();
		text.setColumns(25);
		text.setText("Raspberry PI");
		
		JButton button = new JButton();
		button.setText("Raspberry PI");
		
		JCheckBox cb1 = new JCheckBox();
		JCheckBox cb2 = new JCheckBox();
		JCheckBox cb3 = new JCheckBox();
		cb1.setText("green");
		cb2.setText("red");
		cb3.setText("blue");
		
		JPanel p = new JPanel();
		p.add(s);
		p.add(bar);
		p.add(label);
		p.add(text);
		p.add(button);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
