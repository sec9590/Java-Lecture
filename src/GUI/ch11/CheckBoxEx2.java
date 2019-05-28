package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBoxEx2 extends JFrame {
	Container contentPane;

	String[] names = { "버튼 비활성화", "버튼 감추기" };
	JCheckBox[] check = new JCheckBox[names.length];
	JButton b;

	CheckBoxEx2() {
		setTitle("체크박스와 ItemEvent  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		for (int i = 0; i < check.length; i++) {
			check[i] = new JCheckBox(names[i]);
			contentPane.add(check[i]);
			check[i].addItemListener(new MyItemListener());
		}

		b = new JButton("test button");
		contentPane.add(b);

		setSize(300, 500);
		setVisible(true);

	}

	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			if (e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if (e.getItem() == check[0]) {
				if (b.isEnabled())
					b.setEnabled(false);
				else
					b.setEnabled(true);
			} else if (e.getItem() == check[1])
				if (b.isVisible())
					b.setVisible(false);
				else
					b.setVisible(true);

		}
	}

	public static void main(String[] args) {
		new CheckBoxEx2();
	}
}
