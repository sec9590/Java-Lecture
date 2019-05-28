package GUI.ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SinhodeungEx1 extends JFrame {
	Container contentPane;

	SinhodeungEx1() {
		setTitle("신호등");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
		add(new MyPanel());
	}

	class MyPanel extends JPanel implements ActionListener {
		boolean flag = false;
		private int light_number = 0;

		public MyPanel() {
			setLayout(new BorderLayout());
			JButton b = new JButton("traffic light turn on");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);

			if (light_number == 0) {
				g.setColor(Color.red);
				g.fillOval(100, 100, 100, 100);
			} else if (light_number == 1) {
				g.setColor(Color.green);
				g.fillOval(100, 200, 100, 100);
			} else if (light_number == 2) {
				g.setColor(Color.yellow);
				g.fillOval(100, 300, 100, 100);
			}
		}

		public void actionPerformed(ActionEvent e) {
			if(++light_number > 2)
				light_number = 0;		
			repaint();
		}
	}

	public static void main(String[] args) {
		new SinhodeungEx1();
	}
}
