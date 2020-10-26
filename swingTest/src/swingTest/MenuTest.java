package swingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuTest extends JFrame implements ActionListener, ItemListener{
	private JMenuBar menuBar;
	private JMenu menu, submenu;
	private JMenuItem menuItem1, menuItem2;
	private JMenuItem sbMenuItem1, sbMenuItem2;
	private JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	private JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;
	
	public MenuTest() {
		
		//메뉴바를 생성한다.
		menuBar = new JMenuBar();
		
		//첫번째 메뉴를 생성
		menu = new JMenu("첫번째 메뉴");
		menu.setMnemonic(KeyEvent.VK_F); //단축키
		menuBar.add(menu);
		
		//메뉴 항목들을 생성
		menuItem1 = new JMenuItem("메뉴 항목 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK)); //무슨 키가 눌러졌는가 ->알트M 세부항목 단축키
		menuItem1.addActionListener(this); //이벤트 캐치->리스너
		menu.add(menuItem1);
		
		ImageIcon icon = new ImageIcon("icon.gif");
		menuItem2 = new JMenuItem("메뉴 항목 2", icon);
		menu.add(menuItem2);
		
		//라디오 버튼 메뉴 항목들을 생성하여 메뉴에 추가
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		
		rbMenuItem1 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);
		
		rbMenuItem2 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);
		
		//체크 박스 메뉴 항목들을 생성하여 메뉴에 추가
		menu.addSeparator();
		cbMenuItem1 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);
		
		cbMenuItem2 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 2");
		menu.add(cbMenuItem2);
		
		//서브 메뉴 생성
		menu.addSeparator();
		submenu = new JMenu("서브 메뉴");
		submenu.setMnemonic(KeyEvent.VK_S);
		
		sbMenuItem1 = new JMenuItem("서브 메뉴 항목 1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);
		
		sbMenuItem2 = new JMenuItem("서브 메뉴 항목 2");
		submenu.add(sbMenuItem2);
		menu.add(submenu);
		
		//메뉴바의 두번째 메뉴를 작성한다.
		menu = new JMenu("두번째 메뉴");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);
		
		//메뉴바를 프레임에 부착한다.
		setJMenuBar(menuBar);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "메뉴 항목 1이 선택되었습니다.");
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbMenuItem1) {
			JOptionPane.showMessageDialog(this, "체크 박스 메뉴 항목 1이 변경되었습니다.");
			// 체크 박스 메뉴 항목에 대한 처리
		}
	}
	
	public static void main(String[] args) {
		MenuTest f = new MenuTest();
		f.setSize(500, 200);
		f.setVisible(true);
	}
}
