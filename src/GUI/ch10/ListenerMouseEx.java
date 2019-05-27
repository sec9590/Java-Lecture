package GUI.ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ListenerMouseEx extends JFrame{
	ListenerMouseEx(){
		setTitle("버튼에 mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.orange);
		MyMouseListener listener = new MyMouseListener ();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerMouseEx();
	}	
	
	class MyMouseListener implements MouseListener { 
		public void mouseEntered(MouseEvent e) { 
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.RED);
		}	
		public void mouseExited(MouseEvent e) { 
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.YELLOW);
		}	
		public void mousePressed(MouseEvent e) {} 
		public void mouseReleased(MouseEvent e) {} 
		public void mouseClicked(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.BLUE);
		} 			
		
	}
}
